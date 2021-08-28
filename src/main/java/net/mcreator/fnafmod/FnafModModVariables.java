package net.mcreator.fnafmod;

import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.storage.WorldSavedData;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.IServerWorld;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.network.PacketBuffer;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;

public class FnafModModVariables {
	public FnafModModVariables(FnafModModElements elements) {
		elements.addNetworkMessage(WorldSavedDataSyncMessage.class, WorldSavedDataSyncMessage::buffer, WorldSavedDataSyncMessage::new,
				WorldSavedDataSyncMessage::handler);
		elements.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new,
				PlayerVariablesSyncMessage::handler);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::init);
	}

	private void init(FMLCommonSetupEvent event) {
		CapabilityManager.INSTANCE.register(PlayerVariables.class, new PlayerVariablesStorage(), PlayerVariables::new);
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.getPlayer().world.isRemote()) {
			WorldSavedData mapdata = MapVariables.get(event.getPlayer().world);
			WorldSavedData worlddata = WorldVariables.get(event.getPlayer().world);
			if (mapdata != null)
				FnafModMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(0, mapdata));
			if (worlddata != null)
				FnafModMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(1, worlddata));
		}
	}

	@SubscribeEvent
	public void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.getPlayer().world.isRemote()) {
			WorldSavedData worlddata = WorldVariables.get(event.getPlayer().world);
			if (worlddata != null)
				FnafModMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(1, worlddata));
		}
	}
	public static class WorldVariables extends WorldSavedData {
		public static final String DATA_NAME = "fnaf_mod_worldvars";
		public boolean goldenkill = false;
		public boolean freddykill = false;
		public boolean foxykill = false;
		public boolean chicakill = false;
		public boolean bonniekill = false;
		public boolean TimeDay = false;
		public WorldVariables() {
			super(DATA_NAME);
		}

		public WorldVariables(String s) {
			super(s);
		}

		@Override
		public void read(CompoundNBT nbt) {
			goldenkill = nbt.getBoolean("goldenkill");
			freddykill = nbt.getBoolean("freddykill");
			foxykill = nbt.getBoolean("foxykill");
			chicakill = nbt.getBoolean("chicakill");
			bonniekill = nbt.getBoolean("bonniekill");
			TimeDay = nbt.getBoolean("TimeDay");
		}

		@Override
		public CompoundNBT write(CompoundNBT nbt) {
			nbt.putBoolean("goldenkill", goldenkill);
			nbt.putBoolean("freddykill", freddykill);
			nbt.putBoolean("foxykill", foxykill);
			nbt.putBoolean("chicakill", chicakill);
			nbt.putBoolean("bonniekill", bonniekill);
			nbt.putBoolean("TimeDay", TimeDay);
			return nbt;
		}

		public void syncData(IWorld world) {
			this.markDirty();
			if (world instanceof World && !world.isRemote())
				FnafModMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(((World) world)::getDimensionKey),
						new WorldSavedDataSyncMessage(1, this));
		}
		static WorldVariables clientSide = new WorldVariables();
		public static WorldVariables get(IWorld world) {
			if (world instanceof ServerWorld) {
				return ((ServerWorld) world).getSavedData().getOrCreate(WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends WorldSavedData {
		public static final String DATA_NAME = "fnaf_mod_mapvars";
		public MapVariables() {
			super(DATA_NAME);
		}

		public MapVariables(String s) {
			super(s);
		}

		@Override
		public void read(CompoundNBT nbt) {
		}

		@Override
		public CompoundNBT write(CompoundNBT nbt) {
			return nbt;
		}

		public void syncData(IWorld world) {
			this.markDirty();
			if (world instanceof World && !world.isRemote())
				FnafModMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new WorldSavedDataSyncMessage(0, this));
		}
		static MapVariables clientSide = new MapVariables();
		public static MapVariables get(IWorld world) {
			if (world instanceof IServerWorld) {
				return ((IServerWorld) world).getWorld().getServer().getWorld(World.OVERWORLD).getSavedData().getOrCreate(MapVariables::new,
						DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class WorldSavedDataSyncMessage {
		public int type;
		public WorldSavedData data;
		public WorldSavedDataSyncMessage(PacketBuffer buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			this.data.read(buffer.readCompoundTag());
		}

		public WorldSavedDataSyncMessage(int type, WorldSavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(WorldSavedDataSyncMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.type);
			buffer.writeCompoundTag(message.data.write(new CompoundNBT()));
		}

		public static void handler(WorldSavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}
	@CapabilityInject(PlayerVariables.class)
	public static Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = null;
	@SubscribeEvent
	public void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
		if (event.getObject() instanceof PlayerEntity && !(event.getObject() instanceof FakePlayer))
			event.addCapability(new ResourceLocation("fnaf_mod", "player_variables"), new PlayerVariablesProvider());
	}
	private static class PlayerVariablesProvider implements ICapabilitySerializable<INBT> {
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(PLAYER_VARIABLES_CAPABILITY::getDefaultInstance);
		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public INBT serializeNBT() {
			return PLAYER_VARIABLES_CAPABILITY.getStorage().writeNBT(PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new),
					null);
		}

		@Override
		public void deserializeNBT(INBT nbt) {
			PLAYER_VARIABLES_CAPABILITY.getStorage().readNBT(PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new), null,
					nbt);
		}
	}

	private static class PlayerVariablesStorage implements Capability.IStorage<PlayerVariables> {
		@Override
		public INBT writeNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side) {
			CompoundNBT nbt = new CompoundNBT();
			nbt.putBoolean("FreddyFrame1", instance.FreddyFrame1);
			nbt.putBoolean("FreddyFrame2", instance.FreddyFrame2);
			nbt.putBoolean("FreddyFrame3", instance.FreddyFrame3);
			nbt.putBoolean("FreddyFrame4", instance.FreddyFrame4);
			nbt.putBoolean("FreddyFrame5", instance.FreddyFrame5);
			nbt.putBoolean("FoxyFrame1", instance.FoxyFrame1);
			nbt.putBoolean("FoxyFrame2", instance.FoxyFrame2);
			nbt.putBoolean("FoxyFrame3", instance.FoxyFrame3);
			nbt.putBoolean("FoxyFrame4", instance.FoxyFrame4);
			nbt.putBoolean("FoxyFrame5", instance.FoxyFrame5);
			nbt.putBoolean("ChicaFrame1", instance.ChicaFrame1);
			nbt.putBoolean("ChicaFrame2", instance.ChicaFrame2);
			nbt.putBoolean("ChicaFrame3", instance.ChicaFrame3);
			nbt.putBoolean("ChicaFrame4", instance.ChicaFrame4);
			nbt.putBoolean("ChicaFrame5", instance.ChicaFrame5);
			nbt.putBoolean("BonnieFrame1", instance.BonnieFrame1);
			nbt.putBoolean("BonnieFrame2", instance.BonnieFrame2);
			nbt.putBoolean("BonnieFrame3", instance.BonnieFrame3);
			nbt.putBoolean("BonnieFrame4", instance.BonnieFrame4);
			nbt.putBoolean("BonnieFrame5", instance.BonnieFrame5);
			nbt.putDouble("PlayerFacing", instance.PlayerFacing);
			nbt.putBoolean("Mask", instance.Mask);
			return nbt;
		}

		@Override
		public void readNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side, INBT inbt) {
			CompoundNBT nbt = (CompoundNBT) inbt;
			instance.FreddyFrame1 = nbt.getBoolean("FreddyFrame1");
			instance.FreddyFrame2 = nbt.getBoolean("FreddyFrame2");
			instance.FreddyFrame3 = nbt.getBoolean("FreddyFrame3");
			instance.FreddyFrame4 = nbt.getBoolean("FreddyFrame4");
			instance.FreddyFrame5 = nbt.getBoolean("FreddyFrame5");
			instance.FoxyFrame1 = nbt.getBoolean("FoxyFrame1");
			instance.FoxyFrame2 = nbt.getBoolean("FoxyFrame2");
			instance.FoxyFrame3 = nbt.getBoolean("FoxyFrame3");
			instance.FoxyFrame4 = nbt.getBoolean("FoxyFrame4");
			instance.FoxyFrame5 = nbt.getBoolean("FoxyFrame5");
			instance.ChicaFrame1 = nbt.getBoolean("ChicaFrame1");
			instance.ChicaFrame2 = nbt.getBoolean("ChicaFrame2");
			instance.ChicaFrame3 = nbt.getBoolean("ChicaFrame3");
			instance.ChicaFrame4 = nbt.getBoolean("ChicaFrame4");
			instance.ChicaFrame5 = nbt.getBoolean("ChicaFrame5");
			instance.BonnieFrame1 = nbt.getBoolean("BonnieFrame1");
			instance.BonnieFrame2 = nbt.getBoolean("BonnieFrame2");
			instance.BonnieFrame3 = nbt.getBoolean("BonnieFrame3");
			instance.BonnieFrame4 = nbt.getBoolean("BonnieFrame4");
			instance.BonnieFrame5 = nbt.getBoolean("BonnieFrame5");
			instance.PlayerFacing = nbt.getDouble("PlayerFacing");
			instance.Mask = nbt.getBoolean("Mask");
		}
	}

	public static class PlayerVariables {
		public boolean FreddyFrame1 = false;
		public boolean FreddyFrame2 = false;
		public boolean FreddyFrame3 = false;
		public boolean FreddyFrame4 = false;
		public boolean FreddyFrame5 = false;
		public boolean FoxyFrame1 = false;
		public boolean FoxyFrame2 = false;
		public boolean FoxyFrame3 = false;
		public boolean FoxyFrame4 = false;
		public boolean FoxyFrame5 = false;
		public boolean ChicaFrame1 = false;
		public boolean ChicaFrame2 = false;
		public boolean ChicaFrame3 = false;
		public boolean ChicaFrame4 = false;
		public boolean ChicaFrame5 = false;
		public boolean BonnieFrame1 = false;
		public boolean BonnieFrame2 = false;
		public boolean BonnieFrame3 = false;
		public boolean BonnieFrame4 = false;
		public boolean BonnieFrame5 = false;
		public double PlayerFacing = 0;
		public boolean Mask = false;
		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayerEntity)
				FnafModMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) entity),
						new PlayerVariablesSyncMessage(this));
		}
	}
	@SubscribeEvent
	public void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void clonePlayer(PlayerEvent.Clone event) {
		PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PlayerVariables()));
		PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
		clone.PlayerFacing = original.PlayerFacing;
		clone.Mask = original.Mask;
		if (!event.isWasDeath()) {
			clone.FreddyFrame1 = original.FreddyFrame1;
			clone.FreddyFrame2 = original.FreddyFrame2;
			clone.FreddyFrame3 = original.FreddyFrame3;
			clone.FreddyFrame4 = original.FreddyFrame4;
			clone.FreddyFrame5 = original.FreddyFrame5;
			clone.FoxyFrame1 = original.FoxyFrame1;
			clone.FoxyFrame2 = original.FoxyFrame2;
			clone.FoxyFrame3 = original.FoxyFrame3;
			clone.FoxyFrame4 = original.FoxyFrame4;
			clone.FoxyFrame5 = original.FoxyFrame5;
			clone.ChicaFrame1 = original.ChicaFrame1;
			clone.ChicaFrame2 = original.ChicaFrame2;
			clone.ChicaFrame3 = original.ChicaFrame3;
			clone.ChicaFrame4 = original.ChicaFrame4;
			clone.ChicaFrame5 = original.ChicaFrame5;
			clone.BonnieFrame1 = original.BonnieFrame1;
			clone.BonnieFrame2 = original.BonnieFrame2;
			clone.BonnieFrame3 = original.BonnieFrame3;
			clone.BonnieFrame4 = original.BonnieFrame4;
			clone.BonnieFrame5 = original.BonnieFrame5;
		}
	}
	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;
		public PlayerVariablesSyncMessage(PacketBuffer buffer) {
			this.data = new PlayerVariables();
			new PlayerVariablesStorage().readNBT(null, this.data, null, buffer.readCompoundTag());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, PacketBuffer buffer) {
			buffer.writeCompoundTag((CompoundNBT) new PlayerVariablesStorage().writeNBT(null, message.data, null));
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PlayerVariables()));
					variables.FreddyFrame1 = message.data.FreddyFrame1;
					variables.FreddyFrame2 = message.data.FreddyFrame2;
					variables.FreddyFrame3 = message.data.FreddyFrame3;
					variables.FreddyFrame4 = message.data.FreddyFrame4;
					variables.FreddyFrame5 = message.data.FreddyFrame5;
					variables.FoxyFrame1 = message.data.FoxyFrame1;
					variables.FoxyFrame2 = message.data.FoxyFrame2;
					variables.FoxyFrame3 = message.data.FoxyFrame3;
					variables.FoxyFrame4 = message.data.FoxyFrame4;
					variables.FoxyFrame5 = message.data.FoxyFrame5;
					variables.ChicaFrame1 = message.data.ChicaFrame1;
					variables.ChicaFrame2 = message.data.ChicaFrame2;
					variables.ChicaFrame3 = message.data.ChicaFrame3;
					variables.ChicaFrame4 = message.data.ChicaFrame4;
					variables.ChicaFrame5 = message.data.ChicaFrame5;
					variables.BonnieFrame1 = message.data.BonnieFrame1;
					variables.BonnieFrame2 = message.data.BonnieFrame2;
					variables.BonnieFrame3 = message.data.BonnieFrame3;
					variables.BonnieFrame4 = message.data.BonnieFrame4;
					variables.BonnieFrame5 = message.data.BonnieFrame5;
					variables.PlayerFacing = message.data.PlayerFacing;
					variables.Mask = message.data.Mask;
				}
			});
			context.setPacketHandled(true);
		}
	}
}

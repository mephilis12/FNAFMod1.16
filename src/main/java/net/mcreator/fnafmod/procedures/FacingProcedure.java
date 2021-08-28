package net.mcreator.fnafmod.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.Direction;
import net.minecraft.entity.Entity;

import net.mcreator.fnafmod.FnafModModVariables;
import net.mcreator.fnafmod.FnafModModElements;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;
import java.util.HashMap;

@FnafModModElements.ModElement.Tag
public class FacingProcedure extends FnafModModElements.ModElement {
	public FacingProcedure(FnafModModElements instance) {
		super(instance, 212);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FnafModMod.LOGGER.warn("Failed to load dependency entity for procedure Facing!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getHorizontalFacing()) == Direction.NORTH)) {
			{
				double _setval = (double) 1;
				entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerFacing = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getHorizontalFacing()) == Direction.WEST)) {
			{
				double _setval = (double) 2;
				entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerFacing = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getHorizontalFacing()) == Direction.SOUTH)) {
			{
				double _setval = (double) 3;
				entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerFacing = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getHorizontalFacing()) == Direction.EAST)) {
			{
				double _setval = (double) 4;
				entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerFacing = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}

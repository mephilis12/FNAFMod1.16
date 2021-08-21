package net.mcreator.fnafmod.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
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
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FnafModMod.LOGGER.warn("Failed to load dependency world for procedure Facing!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if (((entity.getHorizontalFacing()) == Direction.NORTH)) {
			FnafModModVariables.WorldVariables.get(world).PlayerFacing = (double) 1;
			FnafModModVariables.WorldVariables.get(world).syncData(world);
		} else if (((entity.getHorizontalFacing()) == Direction.WEST)) {
			FnafModModVariables.WorldVariables.get(world).PlayerFacing = (double) 2;
			FnafModModVariables.WorldVariables.get(world).syncData(world);
		} else if (((entity.getHorizontalFacing()) == Direction.SOUTH)) {
			FnafModModVariables.WorldVariables.get(world).PlayerFacing = (double) 3;
			FnafModModVariables.WorldVariables.get(world).syncData(world);
		} else if (((entity.getHorizontalFacing()) == Direction.EAST)) {
			FnafModModVariables.WorldVariables.get(world).PlayerFacing = (double) 4;
			FnafModModVariables.WorldVariables.get(world).syncData(world);
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

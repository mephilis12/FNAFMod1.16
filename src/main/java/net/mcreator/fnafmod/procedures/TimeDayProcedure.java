package net.mcreator.fnafmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;

import net.mcreator.fnafmod.FnafModModVariables;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;
import java.util.HashMap;

public class TimeDayProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onWorldTick(TickEvent.WorldTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				IWorld world = event.world;
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("world", world);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FnafModMod.LOGGER.warn("Failed to load dependency world for procedure TimeDay!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (((world instanceof World) ? ((World) world).isDaytime() : false)) {
			FnafModModVariables.WorldVariables.get(world).TimeDay = (boolean) (true);
			FnafModModVariables.WorldVariables.get(world).syncData(world);
		}
		FnafModModVariables.WorldVariables.get(world).TimeDay = (boolean) (false);
		FnafModModVariables.WorldVariables.get(world).syncData(world);
	}
}

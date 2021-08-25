package net.mcreator.fnafmod.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;

import net.mcreator.fnafmod.FnafModModVariables;
import net.mcreator.fnafmod.FnafModModElements;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;
import java.util.HashMap;

@FnafModModElements.ModElement.Tag
public class TimeDayProcedure extends FnafModModElements.ModElement {
	public TimeDayProcedure(FnafModModElements instance) {
		super(instance, 273);
		MinecraftForge.EVENT_BUS.register(this);
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

	@SubscribeEvent
	public void onWorldTick(TickEvent.WorldTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			IWorld world = event.world;
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("world", world);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}

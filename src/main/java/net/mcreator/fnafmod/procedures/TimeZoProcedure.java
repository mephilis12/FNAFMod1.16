package net.mcreator.fnafmod.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.fnafmod.FnafModModVariables;
import net.mcreator.fnafmod.FnafModModElements;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;

@FnafModModElements.ModElement.Tag
public class TimeZoProcedure extends FnafModModElements.ModElement {
	public TimeZoProcedure(FnafModModElements instance) {
		super(instance, 245);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FnafModMod.LOGGER.warn("Failed to load dependency world for procedure TimeZo!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if ((((world.getWorldInfo().getDayTime()) > 12500) && ((world.getWorldInfo().getDayTime()) < 23000))) {
			FnafModModVariables.WorldVariables.get(world).Daytime = (boolean) (true);
			FnafModModVariables.WorldVariables.get(world).syncData(world);
		} else {
			FnafModModVariables.WorldVariables.get(world).Daytime = (boolean) (false);
			FnafModModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}

package net.mcreator.fnafmod.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.fnafmod.FnafModModElements;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;

@FnafModModElements.ModElement.Tag
public class FreddyFazbearOnEntityTickUpdateProcedure extends FnafModModElements.ModElement {
	public FreddyFazbearOnEntityTickUpdateProcedure(FnafModModElements instance) {
		super(instance, 33);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FnafModMod.LOGGER.warn("Failed to load dependency world for procedure FreddyFazbearOnEntityTickUpdate!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if ((((world.getWorldInfo().getDayTime()) > 12500) && ((world.getWorldInfo().getDayTime()) < 23000))) {
			return (true);
		}
		return (false);
	}
}

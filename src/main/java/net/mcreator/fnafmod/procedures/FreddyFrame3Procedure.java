package net.mcreator.fnafmod.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.fnafmod.FnafModModVariables;
import net.mcreator.fnafmod.FnafModModElements;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;

@FnafModModElements.ModElement.Tag
public class FreddyFrame3Procedure extends FnafModModElements.ModElement {
	public FreddyFrame3Procedure(FnafModModElements instance) {
		super(instance, 83);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FnafModMod.LOGGER.warn("Failed to load dependency world for procedure FreddyFrame3!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if ((FnafModModVariables.WorldVariables.get(world).FreddyFrame3)) {
			return (true);
		}
		return (false);
	}
}

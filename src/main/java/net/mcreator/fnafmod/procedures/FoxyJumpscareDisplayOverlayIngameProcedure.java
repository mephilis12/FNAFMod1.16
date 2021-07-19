package net.mcreator.fnafmod.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.fnafmod.FnafModModVariables;
import net.mcreator.fnafmod.FnafModModElements;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;

@FnafModModElements.ModElement.Tag
public class FoxyJumpscareDisplayOverlayIngameProcedure extends FnafModModElements.ModElement {
	public FoxyJumpscareDisplayOverlayIngameProcedure(FnafModModElements instance) {
		super(instance, 67);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FnafModMod.LOGGER.warn("Failed to load dependency world for procedure FoxyJumpscareDisplayOverlayIngame!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if ((FnafModModVariables.WorldVariables.get(world).foxykill)) {
			return (true);
		}
		return (false);
	}
}

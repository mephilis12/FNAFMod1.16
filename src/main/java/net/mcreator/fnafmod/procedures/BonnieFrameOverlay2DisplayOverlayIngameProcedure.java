package net.mcreator.fnafmod.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.fnafmod.FnafModModVariables;
import net.mcreator.fnafmod.FnafModModElements;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;

@FnafModModElements.ModElement.Tag
public class BonnieFrameOverlay2DisplayOverlayIngameProcedure extends FnafModModElements.ModElement {
	public BonnieFrameOverlay2DisplayOverlayIngameProcedure(FnafModModElements instance) {
		super(instance, 102);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FnafModMod.LOGGER.warn("Failed to load dependency world for procedure BonnieFrameOverlay2DisplayOverlayIngame!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if ((FnafModModVariables.WorldVariables.get(world).BonnieFrame2)) {
			return (true);
		}
		return (false);
	}
}

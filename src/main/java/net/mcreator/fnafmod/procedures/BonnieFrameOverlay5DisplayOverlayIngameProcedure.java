package net.mcreator.fnafmod.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.fnafmod.FnafModModVariables;
import net.mcreator.fnafmod.FnafModModElements;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;

@FnafModModElements.ModElement.Tag
public class BonnieFrameOverlay5DisplayOverlayIngameProcedure extends FnafModModElements.ModElement {
	public BonnieFrameOverlay5DisplayOverlayIngameProcedure(FnafModModElements instance) {
		super(instance, 108);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FnafModMod.LOGGER.warn("Failed to load dependency world for procedure BonnieFrameOverlay5DisplayOverlayIngame!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if ((FnafModModVariables.WorldVariables.get(world).BonnieFrame5)) {
			return (true);
		}
		return (false);
	}
}

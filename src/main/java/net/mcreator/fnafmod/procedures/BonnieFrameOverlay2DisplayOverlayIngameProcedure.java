package net.mcreator.fnafmod.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.fnafmod.FnafModModVariables;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;

public class BonnieFrameOverlay2DisplayOverlayIngameProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FnafModMod.LOGGER.warn("Failed to load dependency entity for procedure BonnieFrameOverlay2DisplayOverlayIngame!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new FnafModModVariables.PlayerVariables())).BonnieFrame2)) {
			return (true);
		}
		return (false);
	}
}

package net.mcreator.fnafmod.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.fnafmod.FnafModModVariables;
import net.mcreator.fnafmod.FnafModModElements;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;

@FnafModModElements.ModElement.Tag
public class BonnieFrameOverlay4DisplayOverlayIngameProcedure extends FnafModModElements.ModElement {
	public BonnieFrameOverlay4DisplayOverlayIngameProcedure(FnafModModElements instance) {
		super(instance, 106);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FnafModMod.LOGGER.warn("Failed to load dependency entity for procedure BonnieFrameOverlay4DisplayOverlayIngame!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new FnafModModVariables.PlayerVariables())).BonnieFrame4)) {
			return (true);
		}
		return (false);
	}
}

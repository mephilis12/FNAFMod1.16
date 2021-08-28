package net.mcreator.fnafmod.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.fnafmod.FnafModModVariables;
import net.mcreator.fnafmod.FnafModModElements;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;

@FnafModModElements.ModElement.Tag
public class ChicaFrameOverlay3DisplayOverlayIngameProcedure extends FnafModModElements.ModElement {
	public ChicaFrameOverlay3DisplayOverlayIngameProcedure(FnafModModElements instance) {
		super(instance, 115);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FnafModMod.LOGGER.warn("Failed to load dependency entity for procedure ChicaFrameOverlay3DisplayOverlayIngame!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new FnafModModVariables.PlayerVariables())).ChicaFrame3)) {
			return (true);
		}
		return (false);
	}
}

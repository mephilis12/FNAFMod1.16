package net.mcreator.fnafmod.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.fnafmod.FnafModModElements;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;

@FnafModModElements.ModElement.Tag
public class ToyFoxyEntityDiesProcedure extends FnafModModElements.ModElement {
	public ToyFoxyEntityDiesProcedure(FnafModModElements instance) {
		super(instance, 247);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FnafModMod.LOGGER.warn("Failed to load dependency entity for procedure ToyFoxyEntityDies!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"summon fnaf_mod:mangle");
			}
		}
	}
}

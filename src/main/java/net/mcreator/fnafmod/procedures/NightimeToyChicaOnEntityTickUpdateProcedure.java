package net.mcreator.fnafmod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.fnafmod.entity.NightimeToyChicaEntity;
import net.mcreator.fnafmod.FnafModModElements;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;

@FnafModModElements.ModElement.Tag
public class NightimeToyChicaOnEntityTickUpdateProcedure extends FnafModModElements.ModElement {
	public NightimeToyChicaOnEntityTickUpdateProcedure(FnafModModElements instance) {
		super(instance, 274);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FnafModMod.LOGGER.warn("Failed to load dependency entity for procedure NightimeToyChicaOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FnafModMod.LOGGER.warn("Failed to load dependency world for procedure NightimeToyChicaOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world instanceof World) ? ((World) world).isDaytime() : false)) {
			if ((entity instanceof NightimeToyChicaEntity.CustomEntity)) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager()
								.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon fnaf_mod:toy_chica");
					}
				}
			}
		}
	}
}

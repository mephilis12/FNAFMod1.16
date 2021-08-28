package net.mcreator.fnafmod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.fnafmod.FnafModModElements;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;
import java.util.Collections;

@FnafModModElements.ModElement.Tag
public class GoldenFreddyOnEntityTickUpdateProcedure extends FnafModModElements.ModElement {
	public GoldenFreddyOnEntityTickUpdateProcedure(FnafModModElements instance) {
		super(instance, 49);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FnafModMod.LOGGER.warn("Failed to load dependency entity for procedure GoldenFreddyOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FnafModMod.LOGGER.warn("Failed to load dependency world for procedure GoldenFreddyOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world instanceof World) ? ((World) world).isDaytime() : false)) {
			{
				Entity _ent = entity;
				_ent.setPositionAndUpdate((entity.getPersistentData().getDouble("spawnX")), (entity.getPersistentData().getDouble("spawnY")),
						(entity.getPersistentData().getDouble("spawnZ")));
				if (_ent instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPersistentData().getDouble("spawnX")),
							(entity.getPersistentData().getDouble("spawnY")), (entity.getPersistentData().getDouble("spawnZ")), _ent.rotationYaw,
							_ent.rotationPitch, Collections.emptySet());
				}
			}
		}
	}
}

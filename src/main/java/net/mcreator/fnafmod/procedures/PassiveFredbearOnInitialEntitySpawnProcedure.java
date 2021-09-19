package net.mcreator.fnafmod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.fnafmod.entity.PassiveFredbearEntity;
import net.mcreator.fnafmod.FnafModModVariables;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;

public class PassiveFredbearOnInitialEntitySpawnProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FnafModMod.LOGGER.warn("Failed to load dependency entity for procedure PassiveFredbearOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FnafModMod.LOGGER.warn("Failed to load dependency world for procedure PassiveFredbearOnInitialEntitySpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		entity.getPersistentData().putDouble("spawnX", (entity.getPosX()));
		entity.getPersistentData().putDouble("spawnY", (entity.getPosY()));
		entity.getPersistentData().putDouble("spawnZ", (entity.getPosZ()));
		if ((entity instanceof PassiveFredbearEntity.CustomEntity)) {
			if (((entity.getPersistentData().getBoolean("alreadyset")) == (false))) {
				entity.getPersistentData().putBoolean("alreadyset", (false));
				if ((FnafModModVariables.WorldVariables.get(world).PlayerFacing == 1)) {
					entity.rotationYaw = (float) (0);
					entity.setRenderYawOffset(entity.rotationYaw);
					entity.prevRotationYaw = entity.rotationYaw;
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
						((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
						((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
					}
					entity.rotationPitch = (float) (0);
				} else if ((FnafModModVariables.WorldVariables.get(world).PlayerFacing == 2)) {
					entity.rotationYaw = (float) ((-90));
					entity.setRenderYawOffset(entity.rotationYaw);
					entity.prevRotationYaw = entity.rotationYaw;
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
						((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
						((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
					}
					entity.rotationPitch = (float) (0);
				} else if ((FnafModModVariables.WorldVariables.get(world).PlayerFacing == 3)) {
					entity.rotationYaw = (float) (180);
					entity.setRenderYawOffset(entity.rotationYaw);
					entity.prevRotationYaw = entity.rotationYaw;
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
						((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
						((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
					}
					entity.rotationPitch = (float) (0);
				} else if ((FnafModModVariables.WorldVariables.get(world).PlayerFacing == 4)) {
					entity.rotationYaw = (float) (90);
					entity.setRenderYawOffset(entity.rotationYaw);
					entity.prevRotationYaw = entity.rotationYaw;
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
						((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
						((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
					}
					entity.rotationPitch = (float) (0);
				}
			}
		}
	}
}

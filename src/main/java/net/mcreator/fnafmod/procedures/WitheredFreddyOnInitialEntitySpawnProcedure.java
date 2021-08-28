package net.mcreator.fnafmod.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.fnafmod.entity.WitheredFreddyEntity;
import net.mcreator.fnafmod.FnafModModVariables;
import net.mcreator.fnafmod.FnafModModElements;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;

@FnafModModElements.ModElement.Tag
public class WitheredFreddyOnInitialEntitySpawnProcedure extends FnafModModElements.ModElement {
	public WitheredFreddyOnInitialEntitySpawnProcedure(FnafModModElements instance) {
		super(instance, 231);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FnafModMod.LOGGER.warn("Failed to load dependency entity for procedure WitheredFreddyOnInitialEntitySpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putDouble("spawnX", (entity.getPosX()));
		entity.getPersistentData().putDouble("spawnY", (entity.getPosY()));
		entity.getPersistentData().putDouble("spawnZ", (entity.getPosZ()));
		if ((entity instanceof WitheredFreddyEntity.CustomEntity)) {
			if (((entity.getPersistentData().getBoolean("alreadyset")) == (false))) {
				entity.getPersistentData().putBoolean("alreadyset", (false));
				if ((((entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new FnafModModVariables.PlayerVariables())).PlayerFacing) == 1)) {
					entity.rotationYaw = (float) (0);
					entity.setRenderYawOffset(entity.rotationYaw);
					entity.prevRotationYaw = entity.rotationYaw;
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
						((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
						((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
					}
					entity.rotationPitch = (float) (0);
				} else if ((((entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new FnafModModVariables.PlayerVariables())).PlayerFacing) == 2)) {
					entity.rotationYaw = (float) ((-90));
					entity.setRenderYawOffset(entity.rotationYaw);
					entity.prevRotationYaw = entity.rotationYaw;
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
						((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
						((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
					}
					entity.rotationPitch = (float) (0);
				} else if ((((entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new FnafModModVariables.PlayerVariables())).PlayerFacing) == 3)) {
					entity.rotationYaw = (float) (180);
					entity.setRenderYawOffset(entity.rotationYaw);
					entity.prevRotationYaw = entity.rotationYaw;
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
						((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
						((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
					}
					entity.rotationPitch = (float) (0);
				} else if ((((entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new FnafModModVariables.PlayerVariables())).PlayerFacing) == 4)) {
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

package net.mcreator.fnafmod.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.fnafmod.entity.ArcadeMachineBonnieEntity;
import net.mcreator.fnafmod.FnafModModVariables;
import net.mcreator.fnafmod.FnafModModElements;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;

@FnafModModElements.ModElement.Tag
public class ArcadeMachineBonnieOnInitialEntitySpawnProcedure extends FnafModModElements.ModElement {
	public ArcadeMachineBonnieOnInitialEntitySpawnProcedure(FnafModModElements instance) {
		super(instance, 270);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FnafModMod.LOGGER.warn("Failed to load dependency entity for procedure ArcadeMachineBonnieOnInitialEntitySpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof ArcadeMachineBonnieEntity.CustomEntity)) {
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
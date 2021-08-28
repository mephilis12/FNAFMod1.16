package net.mcreator.fnafmod.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.fnafmod.entity.WitheredBonnieEntity;
import net.mcreator.fnafmod.entity.SittingWitheredBonnieEntity;
import net.mcreator.fnafmod.FnafModModElements;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;
import java.util.Collections;

@FnafModModElements.ModElement.Tag
public class WitheredBonnieOnEntityTickUpdateProcedure extends FnafModModElements.ModElement {
	public WitheredBonnieOnEntityTickUpdateProcedure(FnafModModElements instance) {
		super(instance, 291);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FnafModMod.LOGGER.warn("Failed to load dependency entity for procedure WitheredBonnieOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				FnafModMod.LOGGER.warn("Failed to load dependency x for procedure WitheredBonnieOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				FnafModMod.LOGGER.warn("Failed to load dependency y for procedure WitheredBonnieOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				FnafModMod.LOGGER.warn("Failed to load dependency z for procedure WitheredBonnieOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FnafModMod.LOGGER.warn("Failed to load dependency world for procedure WitheredBonnieOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
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
			if (((entity.getPersistentData().getDouble("FNAFTimer")) == 0)) {
				if ((entity instanceof WitheredBonnieEntity.CustomEntity)) {
					if (!entity.world.isRemote())
						entity.remove();
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new SittingWitheredBonnieEntity.CustomEntity(SittingWitheredBonnieEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				}
			}
		}
		if (((entity.getPersistentData().getDouble("FNAFTimer")) == 0)) {
			entity.getPersistentData().putDouble("FNAFTimer", 20);
		} else {
			entity.getPersistentData().putDouble("FNAFTimer", ((entity.getPersistentData().getDouble("FNAFTimer")) - 1));
		}
	}
}

package net.mcreator.fnafmod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.mcreator.fnafmod.item.CupcakeItem;
import net.mcreator.fnafmod.item.CircuitBoardItem;
import net.mcreator.fnafmod.item.ChicaFabricItem;
import net.mcreator.fnafmod.FnafModModElements;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;

@FnafModModElements.ModElement.Tag
public class ChicaChickenEntityDiesProcedure extends FnafModModElements.ModElement {
	public ChicaChickenEntityDiesProcedure(FnafModModElements instance) {
		super(instance, 186);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				FnafModMod.LOGGER.warn("Failed to load dependency x for procedure ChicaChickenEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				FnafModMod.LOGGER.warn("Failed to load dependency y for procedure ChicaChickenEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				FnafModMod.LOGGER.warn("Failed to load dependency z for procedure ChicaChickenEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FnafModMod.LOGGER.warn("Failed to load dependency world for procedure ChicaChickenEntityDies!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !world.isRemote()) {
			ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ChicaFabricItem.block, (int) (1)));
			entityToSpawn.setPickupDelay((int) 10);
			entityToSpawn.setNoDespawn();
			world.addEntity(entityToSpawn);
		}
		if (world instanceof World && !world.isRemote()) {
			ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ChicaFabricItem.block, (int) (1)));
			entityToSpawn.setPickupDelay((int) 10);
			entityToSpawn.setNoDespawn();
			world.addEntity(entityToSpawn);
		}
		if (world instanceof World && !world.isRemote()) {
			ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ChicaFabricItem.block, (int) (1)));
			entityToSpawn.setPickupDelay((int) 10);
			entityToSpawn.setNoDespawn();
			world.addEntity(entityToSpawn);
		}
		if (world instanceof World && !world.isRemote()) {
			ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(CircuitBoardItem.block, (int) (1)));
			entityToSpawn.setPickupDelay((int) 10);
			entityToSpawn.setNoDespawn();
			world.addEntity(entityToSpawn);
		}
		if (world instanceof World && !world.isRemote()) {
			ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(CircuitBoardItem.block, (int) (1)));
			entityToSpawn.setPickupDelay((int) 10);
			entityToSpawn.setNoDespawn();
			world.addEntity(entityToSpawn);
		}
		if (world instanceof World && !world.isRemote()) {
			ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(CupcakeItem.block, (int) (1)));
			entityToSpawn.setPickupDelay((int) 10);
			entityToSpawn.setNoDespawn();
			world.addEntity(entityToSpawn);
		}
	}
}

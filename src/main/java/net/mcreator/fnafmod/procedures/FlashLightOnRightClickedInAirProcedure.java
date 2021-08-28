package net.mcreator.fnafmod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.fnafmod.item.FlashLightOnItem;
import net.mcreator.fnafmod.item.FlashLightItem;
import net.mcreator.fnafmod.FnafModModElements;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;

@FnafModModElements.ModElement.Tag
public class FlashLightOnRightClickedInAirProcedure extends FnafModModElements.ModElement {
	public FlashLightOnRightClickedInAirProcedure(FnafModModElements instance) {
		super(instance, 308);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FnafModMod.LOGGER.warn("Failed to load dependency entity for procedure FlashLightOnRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(FlashLightOnItem.block, (int) (1));
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
		if (((entity.getPersistentData().getDouble("FNAFTimer")) == 0)) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(FlashLightItem.block, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		if (((entity.getPersistentData().getDouble("FNAFTimer")) == 0)) {
			entity.getPersistentData().putDouble("FNAFTimer", 20);
		} else {
			entity.getPersistentData().putDouble("FNAFTimer", ((entity.getPersistentData().getDouble("FNAFTimer")) - 1));
		}
	}
}

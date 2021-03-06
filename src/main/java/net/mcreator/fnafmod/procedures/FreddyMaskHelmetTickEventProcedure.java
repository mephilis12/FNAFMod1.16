package net.mcreator.fnafmod.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.fnafmod.item.FreddyMaskItem;
import net.mcreator.fnafmod.FnafModModVariables;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;

public class FreddyMaskHelmetTickEventProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FnafModMod.LOGGER.warn("Failed to load dependency entity for procedure FreddyMaskHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((FreddyMaskItem.helmet == ((entity instanceof LivingEntity)
				? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 3))
				: ItemStack.EMPTY).getItem())) {
			{
				boolean _setval = (boolean) (true);
				entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Mask = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		{
			boolean _setval = (boolean) (false);
			entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Mask = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

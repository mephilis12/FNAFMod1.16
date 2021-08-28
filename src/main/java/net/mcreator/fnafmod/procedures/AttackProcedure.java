package net.mcreator.fnafmod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.fnafmod.item.FreddyMaskItem;
import net.mcreator.fnafmod.FnafModModElements;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;

@FnafModModElements.ModElement.Tag
public class AttackProcedure extends FnafModModElements.ModElement {
	public AttackProcedure(FnafModModElements instance) {
		super(instance, 296);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FnafModMod.LOGGER.warn("Failed to load dependency entity for procedure Attack!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FnafModMod.LOGGER.warn("Failed to load dependency world for procedure Attack!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((world.getWorldInfo().getDayTime()) > 12500) && ((world.getWorldInfo().getDayTime()) < 23000))
				&& (!(new ItemStack(FreddyMaskItem.helmet, (int) (1)).getItem() == ((entity instanceof LivingEntity)
						? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 3))
						: ItemStack.EMPTY).getItem())))) {
			return (true);
		}
		return (false);
	}
}

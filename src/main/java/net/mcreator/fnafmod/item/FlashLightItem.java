
package net.mcreator.fnafmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.BlockState;

import net.mcreator.fnafmod.procedures.FlashLightRightClickedInAirProcedure;
import net.mcreator.fnafmod.itemgroup.FNAFItemsItemGroup;
import net.mcreator.fnafmod.FnafModModElements;

import java.util.Map;
import java.util.HashMap;

@FnafModModElements.ModElement.Tag
public class FlashLightItem extends FnafModModElements.ModElement {
	@ObjectHolder("fnaf_mod:flash_light")
	public static final Item block = null;
	public FlashLightItem(FnafModModElements instance) {
		super(instance, 305);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(FNAFItemsItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("flash_light");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
			ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
			ItemStack itemstack = ar.getResult();
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				FlashLightRightClickedInAirProcedure.executeProcedure($_dependencies);
			}
			return ar;
		}
	}
}

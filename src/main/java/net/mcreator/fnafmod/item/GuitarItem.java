
package net.mcreator.fnafmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.fnafmod.itemgroup.FNAFItemsItemGroup;
import net.mcreator.fnafmod.FnafModModElements;

@FnafModModElements.ModElement.Tag
public class GuitarItem extends FnafModModElements.ModElement {
	@ObjectHolder("fnaf_mod:guitar")
	public static final Item block = null;
	public GuitarItem(FnafModModElements instance) {
		super(instance, 125);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(FNAFItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("guitar");
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
	}
}

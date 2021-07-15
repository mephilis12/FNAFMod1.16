
package net.mcreator.fnafmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.fnafmod.block.RedBlueTileBlock;
import net.mcreator.fnafmod.FnafModModElements;

@FnafModModElements.ModElement.Tag
public class FNAFItemsItemGroup extends FnafModModElements.ModElement {
	public FNAFItemsItemGroup(FnafModModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabfnaf_items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RedBlueTileBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}

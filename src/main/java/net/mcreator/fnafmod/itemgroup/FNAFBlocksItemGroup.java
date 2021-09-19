
package net.mcreator.fnafmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.fnafmod.block.BlackWhiteTileBlock;
import net.mcreator.fnafmod.FnafModModElements;

@FnafModModElements.ModElement.Tag
public class FNAFBlocksItemGroup extends FnafModModElements.ModElement {
	public FNAFBlocksItemGroup(FnafModModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabfnaf_blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BlackWhiteTileBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}


package net.mcreator.fnafmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.fnafmod.block.RedBlackTileBlock;
import net.mcreator.fnafmod.FnafModModElements;

@FnafModModElements.ModElement.Tag
public class FNAFMobsItemGroup extends FnafModModElements.ModElement {
	public FNAFMobsItemGroup(FnafModModElements instance) {
		super(instance, 90);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabfnaf_mobs") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RedBlackTileBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}

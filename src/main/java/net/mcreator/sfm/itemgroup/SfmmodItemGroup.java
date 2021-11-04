
package net.mcreator.sfm.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.sfm.block.CopperoreBlock;
import net.mcreator.sfm.SfmModElements;

@SfmModElements.ModElement.Tag
public class SfmmodItemGroup extends SfmModElements.ModElement {
	public SfmmodItemGroup(SfmModElements instance) {
		super(instance, 108);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsfmmod") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CopperoreBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}

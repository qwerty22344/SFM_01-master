
package net.mcreator.sfm.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.sfm.itemgroup.SfmmodItemGroup;
import net.mcreator.sfm.SfmModElements;

@SfmModElements.ModElement.Tag
public class DiaraldAxeItem extends SfmModElements.ModElement {
	@ObjectHolder("sfm_:diarald_axe")
	public static final Item block = null;
	public DiaraldAxeItem(SfmModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1832;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 18;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DiaraldItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(SfmmodItemGroup.tab)) {
		}.setRegistryName("diarald_axe"));
	}
}

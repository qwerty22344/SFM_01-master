
package net.mcreator.sfm.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.sfm.itemgroup.SfmmodItemGroup;
import net.mcreator.sfm.SfmModElements;

@SfmModElements.ModElement.Tag
public class DiaraldShovelItem extends SfmModElements.ModElement {
	@ObjectHolder("sfm_:diarald_shovel")
	public static final Item block = null;
	public DiaraldShovelItem(SfmModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 1832;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 0f;
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
		}, 1, -2.7999999999999998f, new Item.Properties().group(SfmmodItemGroup.tab)) {
		}.setRegistryName("diarald_shovel"));
	}
}

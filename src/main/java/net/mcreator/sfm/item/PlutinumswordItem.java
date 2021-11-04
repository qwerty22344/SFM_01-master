
package net.mcreator.sfm.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.sfm.itemgroup.SfmmodItemGroup;
import net.mcreator.sfm.SfmModElements;

@SfmModElements.ModElement.Tag
public class PlutinumswordItem extends SfmModElements.ModElement {
	@ObjectHolder("sfm_:plutinumsword")
	public static final Item block = null;
	public PlutinumswordItem(SfmModElements instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 750;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 5f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PlutinumItem.block, (int) (1)), new ItemStack(PlutinumsmallItem.block, (int) (1)));
			}
		}, 3, -2.4f, new Item.Properties().group(SfmmodItemGroup.tab)) {
		}.setRegistryName("plutinumsword"));
	}
}

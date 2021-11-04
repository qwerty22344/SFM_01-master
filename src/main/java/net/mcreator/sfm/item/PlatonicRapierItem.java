
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
public class PlatonicRapierItem extends SfmModElements.ModElement {
	@ObjectHolder("sfm_:platonic_rapier")
	public static final Item block = null;
	public PlatonicRapierItem(SfmModElements instance) {
		super(instance, 38);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 620;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 22;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PlutinumItem.block, (int) (1)), new ItemStack(PlutinumsmallItem.block, (int) (1)));
			}
		}, 3, 16f, new Item.Properties().group(SfmmodItemGroup.tab)) {
		}.setRegistryName("platonic_rapier"));
	}
}

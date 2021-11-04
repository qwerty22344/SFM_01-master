
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
public class PlutinumaxeItem extends SfmModElements.ModElement {
	@ObjectHolder("sfm_:plutinumaxe")
	public static final Item block = null;
	public PlutinumaxeItem(SfmModElements instance) {
		super(instance, 40);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 750;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 8f;
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
		}, 1, -3f, new Item.Properties().group(SfmmodItemGroup.tab)) {
		}.setRegistryName("plutinumaxe"));
	}
}

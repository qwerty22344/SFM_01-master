
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
public class BronzeSwordItem extends SfmModElements.ModElement {
	@ObjectHolder("sfm_:bronze_sword")
	public static final Item block = null;
	public BronzeSwordItem(SfmModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 325;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 3.1f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BronzeItem.block, (int) (1)));
			}
		}, 3, -2.4f, new Item.Properties().group(SfmmodItemGroup.tab)) {
		}.setRegistryName("bronze_sword"));
	}
}

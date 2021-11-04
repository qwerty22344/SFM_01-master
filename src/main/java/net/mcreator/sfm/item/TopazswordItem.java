
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
public class TopazswordItem extends SfmModElements.ModElement {
	@ObjectHolder("sfm_:topazsword")
	public static final Item block = null;
	public TopazswordItem(SfmModElements instance) {
		super(instance, 44);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 970;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 22;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TopazItem.block, (int) (1)));
			}
		}, 3, -2.4f, new Item.Properties().group(SfmmodItemGroup.tab)) {
		}.setRegistryName("topazsword"));
	}
}

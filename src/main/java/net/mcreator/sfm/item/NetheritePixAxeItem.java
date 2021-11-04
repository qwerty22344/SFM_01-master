
package net.mcreator.sfm.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.sfm.itemgroup.SfmmodItemGroup;
import net.mcreator.sfm.SfmModElements;

import java.util.List;

@SfmModElements.ModElement.Tag
public class NetheritePixAxeItem extends SfmModElements.ModElement {
	@ObjectHolder("sfm_:netherite_pix_axe")
	public static final Item block = null;
	public NetheritePixAxeItem(SfmModElements instance) {
		super(instance, 51);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2031;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 12;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(NetheriteingotItem.block, (int) (1)));
			}
		}, 1, -2.7999999999999998f, new Item.Properties().group(SfmmodItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent(
						"\u041E\u043D\u0430 \u043B\u0443\u0447\u0448\u0435 \u0447\u0435\u043C \u0430\u043B\u043C\u0430\u0437\u043D\u0430\u044F \u043A\u0438\u0440\u043A\u0430!"));
			}
		}.setRegistryName("netherite_pix_axe"));
	}
}

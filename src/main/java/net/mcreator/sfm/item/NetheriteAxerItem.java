
package net.mcreator.sfm.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.sfm.itemgroup.SfmmodItemGroup;
import net.mcreator.sfm.SfmModElements;

import java.util.List;

@SfmModElements.ModElement.Tag
public class NetheriteAxerItem extends SfmModElements.ModElement {
	@ObjectHolder("sfm_:netherite_axer")
	public static final Item block = null;
	public NetheriteAxerItem(SfmModElements instance) {
		super(instance, 52);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2031;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 12;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(NetheriteingotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(SfmmodItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent(
						"\u0420\u0443\u0431\u0438\u0442\u044C \u0434\u0435\u0440\u0435\u0432\u044C\u044F \u0441\u0442\u0430\u043B\u043E \u043D\u0430\u043C\u043D\u043E\u0433\u043E \u043B\u0443\u0447\u0448\u0435!"));
			}
		}.setRegistryName("netherite_axer"));
	}
}

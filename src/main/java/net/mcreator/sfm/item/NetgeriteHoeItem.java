
package net.mcreator.sfm.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.sfm.itemgroup.SfmmodItemGroup;
import net.mcreator.sfm.SfmModElements;

import java.util.List;

@SfmModElements.ModElement.Tag
public class NetgeriteHoeItem extends SfmModElements.ModElement {
	@ObjectHolder("sfm_:netgerite_hoe")
	public static final Item block = null;
	public NetgeriteHoeItem(SfmModElements instance) {
		super(instance, 54);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 2031;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(NetheriteingotItem.block, (int) (1)));
			}
		}, 0f, new Item.Properties().group(SfmmodItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent(
						"\u041E\u043D\u0430 \u0438 \u0441\u0435\u0439\u0447\u0430\u0441 \u0431\u0435\u0437\u043F\u043E\u043B\u0435\u0437\u043D\u0430\u044F!"));
			}
		}.setRegistryName("netgerite_hoe"));
	}
}

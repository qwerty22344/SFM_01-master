
package net.mcreator.sfm.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.player.PlayerEntity;

import net.mcreator.sfm.procedures.GdfgfdKoghdaNazhataPkmPoVozdukhuProcedure;
import net.mcreator.sfm.itemgroup.SfmmodItemGroup;
import net.mcreator.sfm.SfmModElements;

import java.util.Map;
import java.util.HashMap;

@SfmModElements.ModElement.Tag
public class HellsSwordItem extends SfmModElements.ModElement {
	@ObjectHolder("sfm_:hells_sword")
	public static final Item block = null;
	public HellsSwordItem(SfmModElements instance) {
		super(instance, 359);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 6238;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 18f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 22;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(SfmmodItemGroup.tab)) {
			@Override
			public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
				ActionResult<ItemStack> retval = super.onItemRightClick(world, entity, hand);
				ItemStack itemstack = retval.getResult();
				double x = entity.posX;
				double y = entity.posY;
				double z = entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					GdfgfdKoghdaNazhataPkmPoVozdukhuProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setRegistryName("hells_sword"));
	}
}

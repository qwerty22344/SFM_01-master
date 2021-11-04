
package net.mcreator.sfm.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.sfm.procedures.TimeEarsedswordKoghdaNazhataPkmPoVozdukhuProcedure;
import net.mcreator.sfm.procedures.TemporarySwordKoghdaNazhataPkmPoVozdukhuProcedure;
import net.mcreator.sfm.SfmModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@SfmModElements.ModElement.Tag
public class TemporarySwordItem extends SfmModElements.ModElement {
	@ObjectHolder("sfm_:temporary_sword")
	public static final Item block = null;
	public TemporarySwordItem(SfmModElements instance) {
		super(instance, 345);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2192;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 20f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TimeEarsedswordItem.block, (int) (1)));
			}
		}, 3, -2.6f, new Item.Properties().group(null)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("This sword is subject to stopping and cutting time"));
			}

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
					$_dependencies.put("itemstack", itemstack);
					TemporarySwordKoghdaNazhataPkmPoVozdukhuProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}

			@Override
			public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
				boolean retval = super.onEntitySwing(itemstack, entity);
				double x = entity.posX;
				double y = entity.posY;
				double z = entity.posZ;
				World world = entity.world;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("itemstack", itemstack);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					TimeEarsedswordKoghdaNazhataPkmPoVozdukhuProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setRegistryName("temporary_sword"));
	}
}

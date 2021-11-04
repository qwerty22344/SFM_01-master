
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
import net.minecraft.entity.Entity;

import net.mcreator.sfm.procedures.KillmagedonKoghdaNazhataPkmPoVozdukhuProcedure;
import net.mcreator.sfm.procedures.KillmagedonKoghdaInstrumientVTaktieRukiProcedure;
import net.mcreator.sfm.procedures.KillmagedonKoghdaInstrumientVInvientarieProcedure;
import net.mcreator.sfm.itemgroup.SfmmodItemGroup;
import net.mcreator.sfm.SfmModElements;

import java.util.Map;
import java.util.HashMap;

@SfmModElements.ModElement.Tag
public class KillmagedonItem extends SfmModElements.ModElement {
	@ObjectHolder("sfm_:killmagedon")
	public static final Item block = null;
	public KillmagedonItem(SfmModElements instance) {
		super(instance, 340);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 99999;
			}

			public float getEfficiency() {
				return 50f;
			}

			public float getAttackDamage() {
				return 128f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 50;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3.7f, new Item.Properties().group(SfmmodItemGroup.tab)) {
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
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					KillmagedonKoghdaNazhataPkmPoVozdukhuProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}

			@Override
			public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
				super.inventoryTick(itemstack, world, entity, slot, selected);
				double x = entity.posX;
				double y = entity.posY;
				double z = entity.posZ;
				if (selected) {
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					KillmagedonKoghdaInstrumientVTaktieRukiProcedure.executeProcedure($_dependencies);
				}
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					KillmagedonKoghdaInstrumientVInvientarieProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("killmagedon"));
	}
}

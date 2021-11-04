
package net.mcreator.sfm.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.BlockState;

import net.mcreator.sfm.procedures.TemporarySwordKoghdaNazhataPkmPoVozdukhuProcedure;
import net.mcreator.sfm.procedures.CancelstopKoghdaNazhataPkmPoVozdukhuProcedure;
import net.mcreator.sfm.itemgroup.SfmmodItemGroup;
import net.mcreator.sfm.SfmModElements;

import java.util.Map;
import java.util.HashMap;

@SfmModElements.ModElement.Tag
public class TimeStopclockItem extends SfmModElements.ModElement {
	@ObjectHolder("sfm_:time_stopclock")
	public static final Item block = null;
	public TimeStopclockItem(SfmModElements instance) {
		super(instance, 349);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SfmmodItemGroup.tab).maxStackSize(1).rarity(Rarity.EPIC));
			setRegistryName("time_stopclock");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 0F;
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
			ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
			ItemStack itemstack = ar.getResult();
			double x = entity.posX;
			double y = entity.posY;
			double z = entity.posZ;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("itemstack", itemstack);
				TemporarySwordKoghdaNazhataPkmPoVozdukhuProcedure.executeProcedure($_dependencies);
			}
			return ar;
		}

		@Override
		public boolean onDroppedByPlayer(ItemStack itemstack, PlayerEntity entity) {
			double x = entity.posX;
			double y = entity.posY;
			double z = entity.posZ;
			World world = entity.world;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				CancelstopKoghdaNazhataPkmPoVozdukhuProcedure.executeProcedure($_dependencies);
			}
			return true;
		}
	}
}

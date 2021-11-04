
package net.mcreator.sfm.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.fluid.IFluidState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.sfm.procedures.AncientglacierKoghdaBlokRazrushienIghrokomProcedure;
import net.mcreator.sfm.itemgroup.SfmmodItemGroup;
import net.mcreator.sfm.item.MagicIceItem;
import net.mcreator.sfm.SfmModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;

@SfmModElements.ModElement.Tag
public class AncientglacierBlock extends SfmModElements.ModElement {
	@ObjectHolder("sfm_:ancientglacier")
	public static final Block block = null;
	public AncientglacierBlock(SfmModElements instance) {
		super(instance, 361);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(SfmmodItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.GLASS).sound(SoundType.GLASS).hardnessAndResistance(80f, 9999f).lightValue(0).slipperiness(0.8f));
			setRegistryName("ancientglacier");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(MagicIceItem.block, (int) (1)));
		}

		@Override
		public boolean removedByPlayer(BlockState state, World world, BlockPos pos, PlayerEntity entity, boolean willHarvest, IFluidState fluid) {
			boolean retval = super.removedByPlayer(state, world, pos, entity, willHarvest, fluid);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				AncientglacierKoghdaBlokRazrushienIghrokomProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}

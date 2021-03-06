package net.mcreator.sfm.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.sfm.block.TopazBlockBlock;
import net.mcreator.sfm.block.TinBlockBlock;
import net.mcreator.sfm.block.RubyblockBlock;
import net.mcreator.sfm.block.PlutinumBlockBlock;
import net.mcreator.sfm.block.DiaraldBlockBlock;
import net.mcreator.sfm.block.CopperBlockBlock;
import net.mcreator.sfm.block.BronzeBlockBlock;
import net.mcreator.sfm.SfmModElements;

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;

@SfmModElements.ModElement.Tag
public class BlockActiv2Procedure extends SfmModElements.ModElement {
	public BlockActiv2Procedure(SfmModElements instance) {
		super(instance, 303);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure BlockActiv2!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof PlayerEntity)
				? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(DiaraldBlockBlock.block, (int) (1)))
				: false)
				&& (((entity instanceof PlayerEntity)
						? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(RubyblockBlock.block, (int) (1)))
						: false)
						&& (((entity instanceof PlayerEntity)
								? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(TopazBlockBlock.block, (int) (1)))
								: false)
								&& (((entity instanceof PlayerEntity)
										? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(CopperBlockBlock.block, (int) (1)))
										: false)
										&& (((entity instanceof PlayerEntity)
												? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(BronzeBlockBlock.block, (int) (1)))
												: false)
												&& (((entity instanceof PlayerEntity)
														? ((PlayerEntity) entity).inventory
																.hasItemStack(new ItemStack(PlutinumBlockBlock.block, (int) (1)))
														: false)
														&& ((entity instanceof PlayerEntity)
																? ((PlayerEntity) entity).inventory
																		.hasItemStack(new ItemStack(TinBlockBlock.block, (int) (1)))
																: false)))))))) {
			if (entity instanceof ServerPlayerEntity) {
				Advancement _adv = ((MinecraftServer) ((ServerPlayerEntity) entity).server).getAdvancementManager()
						.getAdvancement(new ResourceLocation("sfm_:block_activ"));
				AdvancementProgress _ap = ((ServerPlayerEntity) entity).getAdvancements().getProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemaningCriteria().iterator();
					while (_iterator.hasNext()) {
						String _criterion = (String) _iterator.next();
						((ServerPlayerEntity) entity).getAdvancements().grantCriterion(_adv, _criterion);
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			double i = entity.posX;
			double j = entity.posY;
			double k = entity.posZ;
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}

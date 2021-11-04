
package net.mcreator.sfm.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sfm.procedures.DiaraldArmorLvl2BodyTickEventProcedure;
import net.mcreator.sfm.SfmModElements;

import java.util.Map;
import java.util.HashMap;

@SfmModElements.ModElement.Tag
public class DiaraldArmorLvl2Item extends SfmModElements.ModElement {
	@ObjectHolder("sfm_:diarald_armor_lvl_2_helmet")
	public static final Item helmet = null;
	@ObjectHolder("sfm_:diarald_armor_lvl_2_chestplate")
	public static final Item body = null;
	@ObjectHolder("sfm_:diarald_armor_lvl_2_leggings")
	public static final Item legs = null;
	@ObjectHolder("sfm_:diarald_armor_lvl_2_boots")
	public static final Item boots = null;
	public DiaraldArmorLvl2Item(SfmModElements instance) {
		super(instance, 251);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{4, 7, 9, 5}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 10;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DiaraldItem.block, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "diarald_armor_lvl_2";
			}

			public float getToughness() {
				return 2.3f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(null)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "sfm_:textures/models/armor/dialardarmor_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("diarald_armor_lvl_2_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(null)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "sfm_:textures/models/armor/dialardarmor_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.posX;
				double y = entity.posY;
				double z = entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					DiaraldArmorLvl2BodyTickEventProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("diarald_armor_lvl_2_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(null)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "sfm_:textures/models/armor/dialardarmor_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("diarald_armor_lvl_2_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(null)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "sfm_:textures/models/armor/dialardarmor_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("diarald_armor_lvl_2_boots"));
	}
}

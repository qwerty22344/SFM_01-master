package net.mcreator.sfm.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sfm.SfmModElements;

import java.util.Map;

@SfmModElements.ModElement.Tag
public class BlueroseswordKoghdaZhivaiaSushchnostPopadaietSPomoshchiuInstrumientaProcedure extends SfmModElements.ModElement {
	public BlueroseswordKoghdaZhivaiaSushchnostPopadaietSPomoshchiuInstrumientaProcedure(SfmModElements instance) {
		super(instance, 344);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println(
						"Failed to load dependency entity for procedure BlueroseswordKoghdaZhivaiaSushchnostPopadaietSPomoshchiuInstrumienta!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 200, (int) 1, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 200, (int) 2, (false), (false)));
	}
}

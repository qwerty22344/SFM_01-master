package net.mcreator.sfm.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sfm.SfmModElements;

import java.util.Map;

@SfmModElements.ModElement.Tag
public class KillmagedonKoghdaSushchiestvoRazmakhivaietPriedmietomProcedure extends SfmModElements.ModElement {
	public KillmagedonKoghdaSushchiestvoRazmakhivaietPriedmietomProcedure(SfmModElements instance) {
		super(instance, 343);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure KillmagedonKoghdaSushchiestvoRazmakhivaietPriedmietom!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure KillmagedonKoghdaSushchiestvoRazmakhivaietPriedmietom!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !world.getWorld().isRemote && entity instanceof LivingEntity) {
			ArrowEntity entityToSpawn = new ArrowEntity(world.getWorld(), (LivingEntity) entity);
			entityToSpawn.shoot(entity.getLookVec().x, entity.getLookVec().y, entity.getLookVec().z, (float) 3, 0);
			entityToSpawn.setDamage((float) 15);
			entityToSpawn.setKnockbackStrength((int) 15);
			world.addEntity(entityToSpawn);
		}
	}
}

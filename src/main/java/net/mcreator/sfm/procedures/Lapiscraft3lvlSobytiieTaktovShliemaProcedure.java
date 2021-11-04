package net.mcreator.sfm.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.sfm.SfmModElements;

import java.util.Map;

@SfmModElements.ModElement.Tag
public class Lapiscraft3lvlSobytiieTaktovShliemaProcedure extends SfmModElements.ModElement {
	public Lapiscraft3lvlSobytiieTaktovShliemaProcedure(SfmModElements instance) {
		super(instance, 291);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure Lapiscraft3lvlSobytiieTaktovShliema!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		for (int index0 = 0; index0 < (int) (1); index0++) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"/effect give @p minecraft:speed 3 1 true");
				}
			}
		}
	}
}

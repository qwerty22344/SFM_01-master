package net.mcreator.sfm.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.sfm.SfmModElements;

import java.util.Map;

@SfmModElements.ModElement.Tag
public class PlutinumArmorlLvl2BodyTickEventProcedure extends SfmModElements.ModElement {
	public PlutinumArmorlLvl2BodyTickEventProcedure(SfmModElements instance) {
		super(instance, 237);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure PlutinumArmorlLvl2BodyTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		for (int index0 = 0; index0 < (int) (1); index0++) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"effect give @p minecraft:resistance 1 1 true");
				}
			}
		}
	}
}

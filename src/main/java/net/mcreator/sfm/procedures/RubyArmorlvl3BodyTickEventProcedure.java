package net.mcreator.sfm.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.sfm.SfmModElements;

import java.util.Map;

@SfmModElements.ModElement.Tag
public class RubyArmorlvl3BodyTickEventProcedure extends SfmModElements.ModElement {
	public RubyArmorlvl3BodyTickEventProcedure(SfmModElements instance) {
		super(instance, 221);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure RubyArmorlvl3BodyTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		for (int index0 = 0; index0 < (int) (1); index0++) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"effect give @p minecraft:regeneration 1 2 true");
				}
			}
		}
	}
}

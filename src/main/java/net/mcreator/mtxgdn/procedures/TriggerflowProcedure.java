package net.mcreator.mtxgdn.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.CommandFunction;

import java.util.Optional;

public class TriggerflowProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				Optional<CommandFunction> _fopt = _ent.getServer().getFunctions().get(new ResourceLocation("mtxgdn:granttag"));
				if (_fopt.isPresent())
					_ent.getServer().getFunctions().execute(_fopt.get(), _ent.createCommandSourceStack());
			}
		}
	}
}

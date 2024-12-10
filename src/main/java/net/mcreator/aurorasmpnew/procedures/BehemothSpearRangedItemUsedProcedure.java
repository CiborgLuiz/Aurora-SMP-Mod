package net.mcreator.aurorasmpnew.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.aurorasmpnew.init.AurorasmpnewModItems;

public class BehemothSpearRangedItemUsedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(AurorasmpnewModItems.BEHEMOTH_SPEAR.get(), 20);
	}
}

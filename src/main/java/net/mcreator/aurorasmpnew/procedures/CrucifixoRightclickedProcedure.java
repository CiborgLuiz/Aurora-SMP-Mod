package net.mcreator.aurorasmpnew.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.client.Minecraft;

import net.mcreator.aurorasmpnew.init.AurorasmpnewModItems;

public class CrucifixoRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.isClientSide())
			Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(AurorasmpnewModItems.CRUCIFIXO.get()));
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 50, 0, 0, 0, 1);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(AurorasmpnewModItems.CRUCIFIXO.get(), 2000);
	}
}

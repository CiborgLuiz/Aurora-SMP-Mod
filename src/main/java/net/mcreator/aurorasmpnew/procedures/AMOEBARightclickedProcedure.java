package net.mcreator.aurorasmpnew.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.aurorasmpnew.init.AurorasmpnewModItems;

public class AMOEBARightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("aurorasmpnew:amoeba")), SoundSource.PLAYERS, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("aurorasmpnew:amoeba")), SoundSource.PLAYERS, 1, 1, false);
			}
		}
		if (world.isClientSide())
			Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(AurorasmpnewModItems.AMOEBA.get()));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 1));
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(AurorasmpnewModItems.AMOEBA.get(), 600);
	}
}

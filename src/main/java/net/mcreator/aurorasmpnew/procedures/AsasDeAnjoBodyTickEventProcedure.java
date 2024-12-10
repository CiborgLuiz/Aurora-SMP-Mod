package net.mcreator.aurorasmpnew.procedures;

import software.bernie.geckolib3.item.GeoArmorItem;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.aurorasmpnew.item.AsasDeAnjoItem;
import net.mcreator.aurorasmpnew.init.AurorasmpnewModMobEffects;

public class AsasDeAnjoBodyTickEventProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double particleRadius = 0;
		double particleAmount = 0;
		if (entity instanceof Player player && player.getAbilities().flying) {
			if (itemstack.getItem() instanceof AsasDeAnjoItem armor && armor instanceof GeoArmorItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "moving");
		}
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(AurorasmpnewModMobEffects.FLY.get(), 60, 0));
	}
}

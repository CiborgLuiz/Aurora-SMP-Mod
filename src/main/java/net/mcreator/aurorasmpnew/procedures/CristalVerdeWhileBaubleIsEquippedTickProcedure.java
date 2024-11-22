package net.mcreator.aurorasmpnew.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.aurorasmpnew.init.AurorasmpnewModMobEffects;

public class CristalVerdeWhileBaubleIsEquippedTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(AurorasmpnewModMobEffects.FLY.get(), 60, 0));
	}
}

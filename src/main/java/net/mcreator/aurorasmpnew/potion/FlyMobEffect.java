
package net.mcreator.aurorasmpnew.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.aurorasmpnew.procedures.FlyEffectStartedappliedProcedure;
import net.mcreator.aurorasmpnew.procedures.FlyEffectExpiresProcedure;

public class FlyMobEffect extends MobEffect {
	public FlyMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.aurorasmpnew.fly";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		FlyEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		FlyEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}

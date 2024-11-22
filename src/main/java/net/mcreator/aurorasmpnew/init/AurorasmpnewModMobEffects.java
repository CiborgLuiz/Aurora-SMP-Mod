
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aurorasmpnew.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.aurorasmpnew.potion.FlyMobEffect;
import net.mcreator.aurorasmpnew.potion.BleedingMobEffect;
import net.mcreator.aurorasmpnew.AurorasmpnewMod;

public class AurorasmpnewModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, AurorasmpnewMod.MODID);
	public static final RegistryObject<MobEffect> FLY = REGISTRY.register("fly", () -> new FlyMobEffect());
	public static final RegistryObject<MobEffect> BLEEDING = REGISTRY.register("bleeding", () -> new BleedingMobEffect());
}

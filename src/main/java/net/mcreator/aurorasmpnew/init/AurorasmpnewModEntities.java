
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aurorasmpnew.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.aurorasmpnew.entity.TridenteModularEntity;
import net.mcreator.aurorasmpnew.entity.BehemothSpearEntity;
import net.mcreator.aurorasmpnew.entity.ArcoModularEntity;
import net.mcreator.aurorasmpnew.AurorasmpnewMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AurorasmpnewModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, AurorasmpnewMod.MODID);
	public static final RegistryObject<EntityType<BehemothSpearEntity>> BEHEMOTH_SPEAR = register("projectile_behemoth_spear",
			EntityType.Builder.<BehemothSpearEntity>of(BehemothSpearEntity::new, MobCategory.MISC).setCustomClientFactory(BehemothSpearEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TridenteModularEntity>> TRIDENTE_MODULAR = register("projectile_tridente_modular", EntityType.Builder.<TridenteModularEntity>of(TridenteModularEntity::new, MobCategory.MISC)
			.setCustomClientFactory(TridenteModularEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ArcoModularEntity>> ARCO_MODULAR = register("projectile_arco_modular",
			EntityType.Builder.<ArcoModularEntity>of(ArcoModularEntity::new, MobCategory.MISC).setCustomClientFactory(ArcoModularEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}

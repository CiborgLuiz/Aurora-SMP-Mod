package net.mcreator.aurorasmpnew.init;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.aurorasmpnew.item.AsasDeAnjoItem;
import net.mcreator.aurorasmpnew.client.renderer.AsasDeAnjoArmorRenderer;
import net.mcreator.aurorasmpnew.AurorasmpnewMod;

@Mod.EventBusSubscriber(modid = AurorasmpnewMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AurorasmpnewModGeckoLibArmors {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		event.enqueueWork(() -> {
			AurorasmpnewModGeckoLibArmors.GeckoLibArmorItems.REGISTRY.register(bus);
		});
	}

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.AddLayers event) {
		GeoArmorRenderer.registerArmorRenderer(AsasDeAnjoItem.class, () -> new AsasDeAnjoArmorRenderer());
	}

	public class GeckoLibArmorItems {
		public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AurorasmpnewMod.MODID);
		public static final RegistryObject<AsasDeAnjoItem> ASAS_DE_ANJO_CHESTPLATE = REGISTRY.register("asas_de_anjo_chestplate",
				() -> new AsasDeAnjoItem(EquipmentSlot.CHEST, new Item.Properties().tab(AurorasmpnewModTabs.TAB_AURORA_ITENS).fireResistant()));
	}
}

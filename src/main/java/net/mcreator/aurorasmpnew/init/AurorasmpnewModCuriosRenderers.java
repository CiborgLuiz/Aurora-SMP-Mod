package net.mcreator.aurorasmpnew.init;

import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;

import net.mcreator.aurorasmpnew.client.renderer.TiaraRenderer;
import net.mcreator.aurorasmpnew.client.renderer.PeitoralModularRenderer;
import net.mcreator.aurorasmpnew.client.model.ModelTiara;
import net.mcreator.aurorasmpnew.client.model.ModelCustomModel;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AurorasmpnewModCuriosRenderers {
	@SubscribeEvent
	public static void registerLayers(final EntityRenderersEvent.RegisterLayerDefinitions evt) {
		evt.registerLayerDefinition(AurorasmpnewModLayerDefinitions.PEITORAL_MODULAR, ModelCustomModel::createBodyLayer);
		evt.registerLayerDefinition(AurorasmpnewModLayerDefinitions.TIARA, ModelTiara::createBodyLayer);
	}

	@SubscribeEvent
	public static void clientSetup(final FMLClientSetupEvent evt) {
		CuriosRendererRegistry.register(AurorasmpnewModItems.PEITORAL_MODULAR.get(), PeitoralModularRenderer::new);
		CuriosRendererRegistry.register(AurorasmpnewModItems.TIARA.get(), TiaraRenderer::new);
	}
}

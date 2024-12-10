
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aurorasmpnew.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.aurorasmpnew.client.renderer.TridenteModularRenderer;
import net.mcreator.aurorasmpnew.client.renderer.BehemothSpearRenderer;
import net.mcreator.aurorasmpnew.client.renderer.ArcoModularRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AurorasmpnewModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AurorasmpnewModEntities.BEHEMOTH_SPEAR.get(), BehemothSpearRenderer::new);
		event.registerEntityRenderer(AurorasmpnewModEntities.TRIDENTE_MODULAR.get(), TridenteModularRenderer::new);
		event.registerEntityRenderer(AurorasmpnewModEntities.ARCO_MODULAR.get(), ArcoModularRenderer::new);
	}
}

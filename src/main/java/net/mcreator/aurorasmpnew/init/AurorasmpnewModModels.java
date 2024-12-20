
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aurorasmpnew.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.aurorasmpnew.client.model.Modeltrident_Converted;
import net.mcreator.aurorasmpnew.client.model.Modelprojetilmagico;
import net.mcreator.aurorasmpnew.client.model.Modelbehemoth_spear;
import net.mcreator.aurorasmpnew.client.model.ModelTiara;
import net.mcreator.aurorasmpnew.client.model.ModelMascara;
import net.mcreator.aurorasmpnew.client.model.ModelLeviathan;
import net.mcreator.aurorasmpnew.client.model.ModelCustomModel;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AurorasmpnewModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelbehemoth_spear.LAYER_LOCATION, Modelbehemoth_spear::createBodyLayer);
		event.registerLayerDefinition(ModelMascara.LAYER_LOCATION, ModelMascara::createBodyLayer);
		event.registerLayerDefinition(Modeltrident_Converted.LAYER_LOCATION, Modeltrident_Converted::createBodyLayer);
		event.registerLayerDefinition(ModelLeviathan.LAYER_LOCATION, ModelLeviathan::createBodyLayer);
		event.registerLayerDefinition(ModelCustomModel.LAYER_LOCATION, ModelCustomModel::createBodyLayer);
		event.registerLayerDefinition(Modelprojetilmagico.LAYER_LOCATION, Modelprojetilmagico::createBodyLayer);
		event.registerLayerDefinition(ModelTiara.LAYER_LOCATION, ModelTiara::createBodyLayer);
	}
}

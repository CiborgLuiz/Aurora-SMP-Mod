package net.mcreator.aurorasmpnew.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.aurorasmpnew.item.AsasDeAnjoItem;

public class AsasDeAnjoModel extends AnimatedGeoModel<AsasDeAnjoItem> {
	@Override
	public ResourceLocation getAnimationFileLocation(AsasDeAnjoItem object) {
		return new ResourceLocation("aurorasmpnew", "animations/asasdeanjo.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(AsasDeAnjoItem object) {
		return new ResourceLocation("aurorasmpnew", "geo/asasdeanjo.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(AsasDeAnjoItem object) {
		return new ResourceLocation("aurorasmpnew", "textures/items/asas_de_anjo.png");
	}
}

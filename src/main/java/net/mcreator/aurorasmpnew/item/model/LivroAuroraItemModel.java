package net.mcreator.aurorasmpnew.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.aurorasmpnew.item.LivroAuroraItem;

public class LivroAuroraItemModel extends AnimatedGeoModel<LivroAuroraItem> {
	@Override
	public ResourceLocation getAnimationFileLocation(LivroAuroraItem animatable) {
		return new ResourceLocation("aurorasmpnew", "animations/livro.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(LivroAuroraItem animatable) {
		return new ResourceLocation("aurorasmpnew", "geo/livro.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(LivroAuroraItem animatable) {
		return new ResourceLocation("aurorasmpnew", "textures/items/livro.png");
	}
}

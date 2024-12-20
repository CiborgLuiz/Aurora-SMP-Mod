package net.mcreator.aurorasmpnew.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.aurorasmpnew.item.LivroAuroraAbertoItem;

public class LivroAuroraAbertoItemModel extends AnimatedGeoModel<LivroAuroraAbertoItem> {
	@Override
	public ResourceLocation getAnimationFileLocation(LivroAuroraAbertoItem animatable) {
		return new ResourceLocation("aurorasmpnew", "animations/livro.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(LivroAuroraAbertoItem animatable) {
		return new ResourceLocation("aurorasmpnew", "geo/livro.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(LivroAuroraAbertoItem animatable) {
		return new ResourceLocation("aurorasmpnew", "textures/items/livro.png");
	}
}

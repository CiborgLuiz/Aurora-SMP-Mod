package net.mcreator.aurorasmpnew.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.aurorasmpnew.item.LivroQuePrevePassadoItem;

public class LivroQuePrevePassadoItemModel extends AnimatedGeoModel<LivroQuePrevePassadoItem> {
	@Override
	public ResourceLocation getAnimationFileLocation(LivroQuePrevePassadoItem animatable) {
		return new ResourceLocation("aurorasmpnew", "animations/livro.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(LivroQuePrevePassadoItem animatable) {
		return new ResourceLocation("aurorasmpnew", "geo/livro.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(LivroQuePrevePassadoItem animatable) {
		return new ResourceLocation("aurorasmpnew", "textures/items/aurora_encyclopedia.png");
	}
}

package net.mcreator.aurorasmpnew.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.aurorasmpnew.item.model.AsasDeAnjoModel;
import net.mcreator.aurorasmpnew.item.AsasDeAnjoItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AsasDeAnjoArmorRenderer extends GeoArmorRenderer<AsasDeAnjoItem> {
	public AsasDeAnjoArmorRenderer() {
		super(new AsasDeAnjoModel());
		this.headBone = "armorHead";
		this.bodyBone = "armorBody";
		this.rightArmBone = "armorRightArm";
		this.leftArmBone = "armorLeftArm";
		this.rightLegBone = "armorRightLeg";
		this.leftLegBone = "armorLeftLeg";
		this.rightBootBone = "armorRightBoot";
		this.leftBootBone = "armorLeftBoot";
	}

	@Override
	public RenderType getRenderType(AsasDeAnjoItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}

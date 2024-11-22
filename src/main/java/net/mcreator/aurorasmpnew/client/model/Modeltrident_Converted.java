package net.mcreator.aurorasmpnew.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeltrident_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("aurorasmpnew", "modeltrident_converted"), "main");
	public final ModelPart group;

	public Modeltrident_Converted(ModelPart root) {
		this.group = root.getChild("group");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition group = partdefinition.addOrReplaceChild("group",
				CubeListBuilder.create().texOffs(4, 0).addBox(8.49F, -28.01F, -0.51F, 3.02F, 2.02F, 1.02F, new CubeDeformation(0.0F)).texOffs(0, 13).addBox(7.49F, -25.01F, -0.51F, 5.02F, 1.02F, 1.02F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(9.5F, -26.0F, -0.5F, 1.0F, 25.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 26).addBox(9.4F, -22.1F, -0.6F, 1.2F, 5.2F, 1.2F, new CubeDeformation(0.0F)).texOffs(8, 0)
						.addBox(9.48F, -29.02F, -0.52F, 1.04F, 2.04F, 1.04F, new CubeDeformation(0.0F)),
				PartPose.offset(-10.0F, 41.0F, 0.0F));
		PartDefinition cubosdelado_r1 = group.addOrReplaceChild("cubosdelado_r1",
				CubeListBuilder.create().texOffs(6, 7).addBox(31.0001F, -13.9999F, -0.4999F, 0.9998F, 0.9998F, 0.9998F, new CubeDeformation(0.0F)).texOffs(6, 4)
						.addBox(29.0001F, -12.9999F, -0.4999F, 1.9998F, 0.9998F, 0.9998F, new CubeDeformation(0.0F)).texOffs(4, 10).addBox(27.0001F, -11.9999F, -0.4999F, 2.9998F, 0.9998F, 0.9998F, new CubeDeformation(0.0F)).texOffs(5, 9)
						.addBox(26.01F, -13.99F, -0.49F, 1.98F, 1.98F, 0.98F, new CubeDeformation(0.0F)).texOffs(6, 8).addBox(31.0001F, -17.9999F, -0.4999F, 0.9998F, 0.9998F, 0.9998F, new CubeDeformation(0.0F)).texOffs(6, 8)
						.addBox(30.0001F, -16.9999F, -0.4999F, 0.9998F, 0.9998F, 0.9998F, new CubeDeformation(0.0F)).texOffs(6, 8).addBox(29.0001F, -15.9999F, -0.4999F, 0.9998F, 0.9998F, 0.9998F, new CubeDeformation(0.0F)).texOffs(6, 10)
						.addBox(27.0001F, -17.9999F, -0.4999F, 0.9998F, 0.9998F, 0.9998F, new CubeDeformation(0.0F)).texOffs(5, 4).addBox(26.0001F, -16.9999F, -0.4999F, 0.9998F, 1.9998F, 0.9998F, new CubeDeformation(0.0F)).texOffs(4, 3)
						.addBox(25.0001F, -15.9999F, -0.4999F, 0.9998F, 2.9998F, 0.9998F, new CubeDeformation(0.0F)).texOffs(6, 8).addBox(27.0F, -15.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cubosdelado_r2 = group.addOrReplaceChild("cubosdelado_r2", CubeListBuilder.create().texOffs(4, 29).addBox(4.99F, -9.01F, -0.51F, 2.02F, 2.02F, 1.02F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		group.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}

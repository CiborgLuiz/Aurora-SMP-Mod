// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCustomModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custommodel"), "main");
	private final ModelPart Body;

	public ModelCustomModel(ModelPart root) {
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(16, 5)
						.addBox(-4.0F, -4.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 3)
						.addBox(-4.0F, 7.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -4.0F, 1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 13)
						.addBox(-4.0F, 5.0F, -3.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 13)
						.addBox(-4.0F, -4.0F, -3.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(25, 7)
						.addBox(2.0F, -4.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 26)
						.addBox(2.0F, 7.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 0)
						.addBox(2.0F, -4.0F, 1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 15)
						.addBox(2.0F, 2.0F, -3.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
						.addBox(1.0F, 1.0F, -3.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(2.0F, -4.0F, -3.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(2.0F, 5.0F, -3.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r3 = Body
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(22, 18).addBox(-3.8F, 3.7F, -4.0F, 1.0F, 1.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r4 = Body
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(20, 10).addBox(-0.5F, 7.0F, -3.0F, 1.0F, 1.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Body
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(22, 14).addBox(-0.5F, 0.3F, -5.0F, 1.0F, 1.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Body
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(22, 22).addBox(3.0F, 3.7F, -4.0F, 1.0F, 1.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}
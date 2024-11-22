// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbehemoth_spear<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "behemoth_spear"), "main");
	private final ModelPart group;

	public Modelbehemoth_spear(ModelPart root) {
		this.group = root.getChild("group");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition group = partdefinition.addOrReplaceChild("group",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.0F, -34.0F, 4.0F, 2.0F, 35.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 18)
						.addBox(-2.0F, -32.0F, 6.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 12)
						.addBox(-2.0F, -32.0F, 2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 18)
						.addBox(-4.0F, -32.0F, 4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 12)
						.addBox(0.0F, -32.0F, 4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 39.0F, -5.0F));

		PartDefinition cube_r1 = group.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(8, 4).addBox(0.0F, -1.8F, -4.6F, 0.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -37.0F, 7.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r2 = group.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(8, 2)
						.addBox(0.0F, -2.0F, -4.8F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 0)
						.addBox(0.0F, 0.0F, -4.8F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -34.0F, 7.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r3 = group.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(8, 2).addBox(0.0F, 0.0F, -3.17F, 0.0F, 2.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -34.0F, 3.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r4 = group.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(12, 4).addBox(-4.6F, -1.8F, 0.0F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -37.0F, 5.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r5 = group.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(12, 6)
						.addBox(-4.8F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(-4.8F, 0.0F, 0.0F, 8.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -34.0F, 5.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r6 = group.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(8, 2).addBox(-3.17F, 0.0F, 0.0F, 8.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -34.0F, 5.0F, 0.0F, 0.0F, -0.7854F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		group.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}
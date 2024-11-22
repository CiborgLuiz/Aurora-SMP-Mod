// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelLeviathan<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "leviathan"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart RightFoot;
	private final ModelPart LeftFoot;

	public ModelLeviathan(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightFoot = root.getChild("RightFoot");
		this.LeftFoot = root.getChild("LeftFoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -9.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(-4.0F, -8.0F, -8.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-4.0F, -1.0F, -8.0F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(74, 14)
						.addBox(4.0F, -10.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 22)
						.addBox(-3.0F, -10.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 9)
						.addBox(-3.0F, -11.0F, 5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 71)
						.addBox(-3.0F, -12.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 71)
						.addBox(-3.0F, -13.0F, 7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 71)
						.addBox(-3.0F, -14.0F, 8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 71)
						.addBox(-3.0F, -15.0F, 10.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 71)
						.addBox(-3.0F, -15.0F, 9.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 66)
						.addBox(1.0F, -10.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 68)
						.addBox(1.0F, -11.0F, 5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 69)
						.addBox(1.0F, -12.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 70)
						.addBox(1.0F, -13.0F, 7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(70, 43)
						.addBox(1.0F, -14.0F, 8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 70)
						.addBox(1.0F, -15.0F, 9.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(70, 59)
						.addBox(1.0F, -15.0F, 10.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(74, 2)
						.addBox(4.0F, -11.0F, 5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(62, 73)
						.addBox(4.0F, -12.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 71)
						.addBox(5.0F, -13.0F, 7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 63)
						.addBox(6.0F, -14.0F, 8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 32)
						.addBox(-6.0F, -10.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 47)
						.addBox(-6.0F, -11.0F, 5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 51)
						.addBox(-6.0F, -12.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 72)
						.addBox(-7.0F, -13.0F, 7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 55)
						.addBox(-8.0F, -14.0F, 8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 11)
						.addBox(-5.0F, -6.0F, -1.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-5.0F, -5.0F, -1.0F, 8.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -5.0F, 9.0F, 1.5708F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 22).addBox(-4.0F, -0.5F, -5.0F, 8.0F, 1.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, -4.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(18, 11).addBox(-3.0F, 0.5F, -5.0F, 7.0F, 0.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5F, -4.0F, 0.0F, -0.2182F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(22, 0).addBox(-3.0F, 0.5F, -5.0F, 7.0F, 0.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.5F, -4.0F, 0.0F, 0.2182F, 0.0F, -1.5708F));

		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(25, 23).addBox(-4.0F, -0.5F, -5.0F, 8.0F, 1.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -4.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 22)
						.addBox(-4.0F, -14.0F, -8.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 66)
						.addBox(-4.0F, -8.0F, -8.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -3.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(25, 22)
						.addBox(-4.0F, -14.0F, -8.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 11)
						.addBox(-4.0F, -8.0F, -8.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(64, 64).addBox(-4.0F, -8.0F, -8.0F, 2.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -3.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r9 = Head
				.addOrReplaceChild("cube_r9",
						CubeListBuilder.create().texOffs(66, 27).addBox(-4.0F, -8.0F, -8.0F, 2.0F, 1.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-4.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 38)
						.addBox(-4.0F, 0.0F, 2.0F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 33)
						.addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Body
				.addOrReplaceChild("cube_r10",
						CubeListBuilder.create().texOffs(40, 8).addBox(-4.0F, -2.0F, -1.0F, 6.0F, 12.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(5.0F, 2.0F, -1.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(44, 33).addBox(-4.0F, -2.0F, -1.0F, 6.0F, 12.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 2.0F, -1.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(20, 59)
						.addBox(-4.0F, -2.0F, -3.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 54)
						.addBox(-4.0F, -2.0F, 2.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition cube_r12 = RightArm.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(18, 38)
						.addBox(-2.0F, -4.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-2.0F, 0.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 4)
						.addBox(-3.0F, 0.0F, -3.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -2.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r13 = RightArm.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(26, 19)
						.addBox(-2.0F, -4.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 46)
						.addBox(-2.0F, -3.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, -1.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r14 = RightArm.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(58, 61).addBox(-3.0F, -2.0F, -3.0F, 4.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r15 = RightArm
				.addOrReplaceChild("cube_r15",
						CubeListBuilder.create().texOffs(58, 47).addBox(-4.0F, -2.0F, -3.0F, 6.0F, 6.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(60, 17)
						.addBox(-2.0F, -2.0F, 2.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 59)
						.addBox(-2.0F, -2.0F, -3.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition cube_r16 = LeftArm.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(58, 32).addBox(-2.0F, -2.0F, -1.0F, 6.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 1.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r17 = LeftArm.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(44, 46)
						.addBox(1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 39)
						.addBox(1.0F, 1.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -4.0F, 2.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r18 = LeftArm.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(6, 51)
						.addBox(1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 55)
						.addBox(1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -3.0F, 2.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r19 = LeftArm.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(66, 24)
						.addBox(1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 64)
						.addBox(0.0F, -2.0F, -1.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 0.0F, 2.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r20 = LeftArm
				.addOrReplaceChild("cube_r20",
						CubeListBuilder.create().texOffs(0, 64).addBox(0.0F, -2.0F, -1.0F, 4.0F, 6.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-1.0F, 0.0F, 2.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(48, 46)
						.addBox(2.0F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 46)
						.addBox(-3.0F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition RightLeg_r1 = RightLeg
				.addOrReplaceChild("RightLeg_r1",
						CubeListBuilder.create().texOffs(18, 42).addBox(-3.0F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition RightLeg_r2 = RightLeg
				.addOrReplaceChild("RightLeg_r2",
						CubeListBuilder.create().texOffs(28, 46).addBox(-3.0F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(54, 4)
						.addBox(2.0F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 51)
						.addBox(-3.0F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg_r1 = LeftLeg
				.addOrReplaceChild("LeftLeg_r1",
						CubeListBuilder.create().texOffs(50, 17).addBox(2.0F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition LeftLeg_r2 = LeftLeg.addOrReplaceChild("LeftLeg_r2",
				CubeListBuilder.create().texOffs(0, 51).addBox(2.0F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition RightFoot = partdefinition.addOrReplaceChild("RightFoot",
				CubeListBuilder.create().texOffs(42, 66)
						.addBox(-2.0F, 9.0F, -3.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 0)
						.addBox(-2.0F, 9.0F, 2.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition cube_r21 = RightFoot.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(32, 66).addBox(-2.0F, -4.0F, 0.0F, 4.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 13.0F, 0.0F, 0.0F, -1.5708F, 1.5708F));

		PartDefinition cube_r22 = RightFoot.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(44, 4).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 12.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r23 = RightFoot.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(66, 39).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 12.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition LeftFoot = partdefinition.addOrReplaceChild("LeftFoot", CubeListBuilder.create().texOffs(60, 24)
				.addBox(-3.0F, 9.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition cube_r24 = LeftFoot.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(54, 42)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-3.0F, -3.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r25 = LeftFoot
				.addOrReplaceChild("cube_r25",
						CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -2.0F, 1.0F, 3.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 12.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r26 = LeftFoot.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(48, 59).addBox(-3.0F, -3.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightFoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftFoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftFoot.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightFoot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
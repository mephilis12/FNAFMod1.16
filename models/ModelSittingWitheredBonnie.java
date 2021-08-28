// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelSittingWitheredBonnie extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer Head;
	private final ModelRenderer RightEar;
	private final ModelRenderer RightTop;
	private final ModelRenderer LeftEar;
	private final ModelRenderer LeftTop;
	private final ModelRenderer Jaw;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg;

	public ModelSittingWitheredBonnie() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 24.0F, 5.0F);
		Body.setTextureOffset(32, 76).addBox(-1.0F, -14.0F, -0.5F, 2.0F, 12.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(103, 78).addBox(-3.0F, -12.0F, -0.5F, 6.0F, 7.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(31, 70).addBox(1.0F, -13.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(31, 70).addBox(-5.0F, -13.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(11, 86).addBox(-3.0F, -2.0F, -1.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(63, 0).addBox(4.0F, -14.2F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(63, 5).addBox(-7.0F, -14.2F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(50, 48).addBox(-2.5F, -13.0F, -4.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(100, 0).addBox(-4.0F, -13.0F, -3.0F, 8.0F, 10.0F, 6.0F, 0.0F, false);
		Body.setTextureOffset(36, 53).addBox(-4.0F, -2.0F, -3.0F, 8.0F, 2.0F, 6.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -14.0F, 0.0F);
		Body.addChild(Head);
		setRotationAngle(Head, 0.3927F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -9.0F, -2.0F, 8.0F, 7.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(3, 72).addBox(-3.0F, -8.0F, -1.0F, 6.0F, 5.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(3, 78).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);

		RightEar = new ModelRenderer(this);
		RightEar.setRotationPoint(-2.5F, -8.0F, 0.0F);
		Head.addChild(RightEar);
		setRotationAngle(RightEar, 0.2182F, 0.0F, 0.0F);
		RightEar.setTextureOffset(50, 69).addBox(-1.0F, -4.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		RightEar.setTextureOffset(60, 18).addBox(-1.5F, -4.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		RightTop = new ModelRenderer(this);
		RightTop.setRotationPoint(0.0F, -3.0F, 0.0F);
		RightEar.addChild(RightTop);
		setRotationAngle(RightTop, 0.3927F, 0.0F, 0.0F);
		RightTop.setTextureOffset(62, 69).addBox(-1.0F, -5.0F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		RightTop.setTextureOffset(60, 24).addBox(-1.5F, -6.0F, -1.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);

		LeftEar = new ModelRenderer(this);
		LeftEar.setRotationPoint(2.5F, -8.0F, 0.0F);
		Head.addChild(LeftEar);
		setRotationAngle(LeftEar, 0.0873F, 0.0F, 0.0F);
		LeftEar.setTextureOffset(50, 69).addBox(-1.0F, -4.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		LeftEar.setTextureOffset(60, 18).addBox(-1.5F, -4.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		LeftTop = new ModelRenderer(this);
		LeftTop.setRotationPoint(0.0F, -3.0F, 0.0F);
		LeftEar.addChild(LeftTop);
		setRotationAngle(LeftTop, 0.1745F, 0.0F, 0.0F);
		LeftTop.setTextureOffset(62, 69).addBox(-1.0F, -5.0F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		LeftTop.setTextureOffset(60, 24).addBox(-1.5F, -6.0F, -1.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);

		Jaw = new ModelRenderer(this);
		Jaw.setRotationPoint(0.0F, -1.0F, -1.0F);
		Head.addChild(Jaw);
		Jaw.setTextureOffset(16, 82).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 1.0F, 2.0F, -0.1F, false);
		Jaw.setTextureOffset(96, 16).addBox(-3.5F, -0.5F, -4.0F, 7.0F, 2.0F, 9.0F, -0.1F, false);
		Jaw.setTextureOffset(97, 27).addBox(-3.0F, -1.0F, -3.8F, 6.0F, 1.0F, 5.0F, -0.1F, false);
		Jaw.setTextureOffset(28, 73).addBox(-1.5F, -0.3912F, -1.9F, 3.0F, 1.0F, 1.0F, -0.1F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, -11.0F, 0.0F);
		Body.addChild(LeftArm);
		LeftArm.setTextureOffset(76, 76).addBox(-0.5F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, -11.0F, 0.0F);
		Body.addChild(RightArm);
		setRotationAngle(RightArm, 0.0F, 0.0F, 0.0436F);
		RightArm.setTextureOffset(12, 30).addBox(-2.01F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(26, 30).addBox(-2.01F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, 0.1F, false);
		RightArm.setTextureOffset(63, 76).addBox(-1.5F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
		RightArm.setTextureOffset(0, 31).addBox(-2.01F, -2.0F, -1.5F, 3.0F, 13.0F, 3.0F, -0.2F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(2.0F, 1.0F, 0.0F);
		Body.addChild(LeftLeg);
		setRotationAngle(LeftLeg, -1.5708F, -0.1309F, 0.0F);
		LeftLeg.setTextureOffset(39, 76).addBox(-1.0F, 3.0F, -4.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
		LeftLeg.setTextureOffset(0, 46).addBox(-2.0F, 3.0F, -5.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);
		LeftLeg.setTextureOffset(87, 45).addBox(-2.0F, 3.0F, -5.0F, 4.0F, 13.0F, 4.0F, 0.1F, false);
		LeftLeg.setTextureOffset(88, 75).addBox(-1.5F, 3.0F, -4.5F, 3.0F, 13.0F, 3.0F, -0.2F, false);
		LeftLeg.setTextureOffset(72, 47).addBox(-2.5F, 14.1F, -5.5F, 5.0F, 2.0F, 2.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-2.0F, 1.0F, 0.0F);
		Body.addChild(RightLeg);
		setRotationAngle(RightLeg, -1.5708F, 0.1309F, 0.0F);
		RightLeg.setTextureOffset(88, 75).addBox(-1.5F, 3.0F, -4.5F, 3.0F, 13.0F, 3.0F, -0.2F, false);
		RightLeg.setTextureOffset(47, 76).addBox(-1.0F, 3.0F, -4.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
		RightLeg.setTextureOffset(20, 47).addBox(-2.5F, 14.1F, -5.5F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		RightLeg.setTextureOffset(32, 12).addBox(-2.0F, 3.0F, -5.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
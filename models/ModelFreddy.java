// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelFreddy extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer Head;
	private final ModelRenderer Jaw;
	private final ModelRenderer RightArm;
	private final ModelRenderer Microphone;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public ModelFreddy() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 11.0F, 0.0F);
		Body.setTextureOffset(63, 0).addBox(4.0F, -14.2F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(63, 5).addBox(-7.0F, -14.2F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(50, 48).addBox(-2.5F, -13.0F, -4.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(4, 14).addBox(-4.0F, -13.0F, -3.0F, 8.0F, 10.0F, 6.0F, 0.0F, false);
		Body.setTextureOffset(36, 53).addBox(-4.0F, -2.0F, -3.0F, 8.0F, 2.0F, 6.0F, 0.0F, false);
		Body.setTextureOffset(32, 76).addBox(-1.0F, -14.0F, -0.5F, 2.0F, 12.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(31, 70).addBox(1.0F, -12.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(37, 70).addBox(-3.0F, -12.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(11, 86).addBox(-3.0F, -2.0F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -14.0F, 0.0F);
		Body.addChild(Head);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 6.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(38, 5).addBox(-4.5F, -4.0F, -4.3F, 9.0F, 2.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(40, 0).addBox(-4.0F, -2.0F, 1.0F, 8.0F, 1.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(50, 11).addBox(-3.0F, -4.0F, -5.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(58, 15).addBox(-1.0F, -4.5F, -5.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(48, 18).addBox(-2.0F, -9.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(52, 24).addBox(-1.5F, -11.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(56, 30).addBox(3.0F, -10.0F, -1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(56, 35).addBox(-6.0F, -10.0F, -1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(3, 72).addBox(-3.0F, -7.0F, -1.0F, 6.0F, 4.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(3, 78).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(21, 72).addBox(1.0F, -6.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(21, 68).addBox(0.5F, -6.1F, -2.1F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(21, 68).addBox(-3.5F, -6.1F, -2.1F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(21, 75).addBox(-3.0F, -6.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(28, 73).addBox(-1.5F, -2.6F, -2.9F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(16, 79).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);

		Jaw = new ModelRenderer(this);
		Jaw.setRotationPoint(0.0F, -1.0F, -1.0F);
		Head.addChild(Jaw);
		Jaw.setTextureOffset(16, 82).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		Jaw.setTextureOffset(40, 39).addBox(-3.5F, -0.5F, -4.0F, 7.0F, 2.0F, 5.0F, 0.0F, false);
		Jaw.setTextureOffset(34, 49).addBox(-3.0F, -1.0F, -3.8F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		Jaw.setTextureOffset(28, 73).addBox(-1.5F, -0.3912F, -1.9F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, -11.0F, 0.0F);
		Body.addChild(RightArm);
		RightArm.setTextureOffset(26, 30).addBox(-2.01F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(63, 76).addBox(-1.5F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		Microphone = new ModelRenderer(this);
		Microphone.setRotationPoint(0.0F, 9.0F, 0.0F);
		RightArm.addChild(Microphone);
		setRotationAngle(Microphone, 1.3526F, 0.0F, 0.0F);
		Microphone.setTextureOffset(112, 10).addBox(-2.0F, -6.0F, -1.4F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		Microphone.setTextureOffset(116, 0).addBox(-0.5F, 3.0F, -0.4F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Microphone.setTextureOffset(112, 0).addBox(-1.5F, -3.0F, -0.9F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, -11.0F, 0.0F);
		Body.addChild(LeftArm);
		LeftArm.setTextureOffset(12, 30).addBox(-0.99F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(55, 76).addBox(-0.5F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-2.0F, 1.0F, 0.0F);
		Body.addChild(RightLeg);
		RightLeg.setTextureOffset(47, 76).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
		RightLeg.setTextureOffset(20, 47).addBox(-2.5F, 10.1F, -2.5F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		RightLeg.setTextureOffset(32, 12).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(2.0F, 1.0F, 0.0F);
		Body.addChild(LeftLeg);
		LeftLeg.setTextureOffset(39, 76).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
		LeftLeg.setTextureOffset(0, 46).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);
		LeftLeg.setTextureOffset(20, 47).addBox(-2.5F, 10.1F, -2.5F, 5.0F, 2.0F, 2.0F, 0.0F, false);
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

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.RightArm.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}
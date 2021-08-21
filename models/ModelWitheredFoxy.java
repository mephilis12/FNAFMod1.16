// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelWitheredFoxy extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer Head;
	private final ModelRenderer Jaw;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg;

	public ModelWitheredFoxy() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 11.0F, 0.0F);
		Body.setTextureOffset(63, 0).addBox(4.0F, -14.2F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(63, 5).addBox(-7.0F, -14.2F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(100, 0).addBox(-4.0F, -13.0F, -3.0F, 8.0F, 10.0F, 6.0F, 0.0F, false);
		Body.setTextureOffset(36, 53).addBox(-4.0F, -2.0F, -3.0F, 8.0F, 2.0F, 6.0F, 0.0F, false);
		Body.setTextureOffset(31, 70).addBox(-5.0F, -13.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(31, 70).addBox(1.0F, -13.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(72, 78).addBox(-3.0F, -12.0F, -0.5F, 6.0F, 7.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(32, 76).addBox(-1.0F, -14.0F, -0.5F, 2.0F, 12.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(11, 86).addBox(-3.0F, -2.0F, -1.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -14.0F, 0.0F);
		Body.addChild(Head);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 7.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(3, 72).addBox(-3.0F, -8.0F, -1.0F, 6.0F, 4.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(42, 81).addBox(3.0F, -12.0F, -1.0F, 1.0F, 4.0F, 1.0F, -0.2F, false);
		Head.setTextureOffset(3, 78).addBox(-2.0F, -4.0F, -1.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(21, 72).addBox(1.0F, -7.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(21, 68).addBox(0.5F, -7.1F, -2.1F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(21, 68).addBox(-3.5F, -7.1F, -2.1F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(21, 75).addBox(-3.0F, -7.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(86, 87).addBox(-2.0F, -3.5F, -8.8F, 4.0F, 1.0F, 5.0F, -0.1F, false);
		Head.setTextureOffset(28, 73).addBox(-1.5F, -3.6F, -2.9F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(16, 79).addBox(-2.0F, -4.0F, -3.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(113, 64).addBox(-1.0F, -5.0F, -9.0F, 2.0F, 1.0F, 5.0F, 0.0F, false);
		Head.setTextureOffset(114, 42).addBox(-2.0F, -4.0F, -9.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(113, 54).addBox(-1.5F, -12.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(117, 51).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(63, 31).addBox(-3.0F, -7.0F, -4.5F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		Head.setTextureOffset(63, 18).addBox(-4.1F, -8.0F, -4.5F, 3.0F, 3.0F, 9.0F, 0.0F, false);
		Head.setTextureOffset(38, 99).addBox(4.0F, -4.0F, -3.0F, 2.0F, 1.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(38, 111).addBox(-6.0F, -4.0F, -3.0F, 2.0F, 1.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(38, 106).addBox(3.5F, -5.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(38, 118).addBox(-5.5F, -5.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(108, 119).addBox(-6.0F, -14.0F, -1.0F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(58, 15).addBox(-1.0F, -5.0F, -9.5F, 2.0F, 1.0F, 1.0F, 0.05F, false);
		Head.setTextureOffset(116, 119).addBox(3.0F, -14.0F, -1.0F, 3.0F, 5.0F, 1.0F, -0.1F, false);

		Jaw = new ModelRenderer(this);
		Jaw.setRotationPoint(0.0F, -1.0F, -1.0F);
		Head.addChild(Jaw);
		Jaw.setTextureOffset(16, 82).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 1.0F, 2.0F, -0.1F, false);
		Jaw.setTextureOffset(96, 16).addBox(-3.5F, -0.5F, -4.0F, 7.0F, 2.0F, 9.0F, -0.1F, false);
		Jaw.setTextureOffset(96, 18).addBox(-2.0F, -0.5F, -8.5F, 4.0F, 2.0F, 5.0F, -0.1F, false);
		Jaw.setTextureOffset(97, 27).addBox(-3.0F, -1.0F, -3.8F, 6.0F, 1.0F, 5.0F, -0.1F, false);
		Jaw.setTextureOffset(28, 73).addBox(-1.5F, -0.3912F, -1.9F, 3.0F, 1.0F, 1.0F, -0.1F, false);
		Jaw.setTextureOffset(86, 75).addBox(-1.5F, -1.0F, -7.4F, 3.0F, 1.0F, 4.0F, -0.1F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, -11.0F, 0.0F);
		Body.addChild(LeftArm);
		LeftArm.setTextureOffset(26, 30).addBox(-0.99F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(0, 29).addBox(-1.01F, -2.0F, -1.5F, 3.0F, 13.0F, 3.0F, -0.2F, false);
		LeftArm.setTextureOffset(0, 111).addBox(-1.01F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, 0.1F, false);
		LeftArm.setTextureOffset(55, 76).addBox(-0.5F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, -11.0F, 0.0F);
		Body.addChild(RightArm);
		RightArm.setTextureOffset(12, 30).addBox(-2.01F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(0, 0).addBox(-2.0F, 11.0F, 0.0F, 3.0F, 4.0F, 0.0F, 0.0F, false);
		RightArm.setTextureOffset(0, 111).addBox(-2.01F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, 0.1F, false);
		RightArm.setTextureOffset(0, 31).addBox(-2.01F, -2.0F, -1.5F, 3.0F, 13.0F, 3.0F, -0.2F, false);
		RightArm.setTextureOffset(63, 76).addBox(-1.5F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(2.0F, 1.0F, 0.0F);
		Body.addChild(LeftLeg);
		LeftLeg.setTextureOffset(0, 46).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);
		LeftLeg.setTextureOffset(39, 76).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
		LeftLeg.setTextureOffset(72, 47).addBox(-2.5F, 10.1F, -2.5F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		LeftLeg.setTextureOffset(87, 45).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.1F, false);
		LeftLeg.setTextureOffset(101, 75).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 13.0F, 3.0F, -0.2F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-2.0F, 1.0F, 0.0F);
		Body.addChild(RightLeg);
		RightLeg.setTextureOffset(32, 12).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(87, 45).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.1F, false);
		RightLeg.setTextureOffset(47, 76).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
		RightLeg.setTextureOffset(101, 75).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 13.0F, 3.0F, -0.2F, false);
		RightLeg.setTextureOffset(72, 47).addBox(-2.5F, 10.1F, -2.5F, 5.0F, 2.0F, 2.0F, 0.0F, false);
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
		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}
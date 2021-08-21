// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelToy_Foxy extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer Tail;
	private final ModelRenderer Head;
	private final ModelRenderer Jaw2;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg;

	public ModelToy_Foxy() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 11.0F, 0.0F);
		Body.setTextureOffset(50, 48).addBox(-2.5F, -13.0F, -4.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(4, 16).addBox(-4.0F, -14.0F, -3.0F, 8.0F, 12.0F, 6.0F, 0.0F, false);
		Body.setTextureOffset(36, 53).addBox(-4.0F, -2.0F, -3.0F, 8.0F, 2.0F, 6.0F, 0.0F, false);
		Body.setTextureOffset(32, 76).addBox(-1.0F, -14.0F, -0.5F, 2.0F, 12.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(31, 70).addBox(1.0F, -12.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(37, 70).addBox(-3.0F, -12.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(11, 86).addBox(-3.0F, -2.0F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, -2.0F, 3.0F);
		Body.addChild(Tail);
		setRotationAngle(Tail, 0.4363F, 0.0F, 0.0F);
		Tail.setTextureOffset(88, 81).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 9.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.3619F, -16.2285F, -0.0766F);
		Body.addChild(Head);
		Head.setTextureOffset(31, 46).addBox(-1.5F, -0.5F, -7.8F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(98, 52).addBox(-5.5F, -2.0F, -4.3F, 11.0F, 2.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(40, 0).addBox(-4.0F, 0.0F, 1.0F, 8.0F, 1.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(67, 39).addBox(-2.0F, -2.0F, -8.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(58, 15).addBox(-1.0F, -2.5F, -8.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(3, 72).addBox(-3.0F, -5.0F, -1.0F, 6.0F, 4.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(3, 78).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(21, 72).addBox(1.0F, -4.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(21, 68).addBox(0.5F, -4.1F, -2.1F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(21, 68).addBox(-3.5F, -4.1F, -2.1F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(21, 75).addBox(-3.0F, -4.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(28, 73).addBox(-1.5F, -0.6F, -2.9F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(16, 79).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(83, 59).addBox(3.0F, -10.0F, -1.0F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(75, 59).addBox(-6.0F, -10.0F, -1.0F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(42, 35).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(43, 39).addBox(-1.5F, -8.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		Jaw2 = new ModelRenderer(this);
		Jaw2.setRotationPoint(0.0F, 1.0F, -1.0F);
		Head.addChild(Jaw2);
		setRotationAngle(Jaw2, 0.0436F, 0.0F, 0.0F);
		Jaw2.setTextureOffset(16, 82).addBox(-2.0F, 0.0436F, -2.001F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		Jaw2.setTextureOffset(66, 49).addBox(-2.0F, 0.5F, -7.0F, 4.0F, 1.0F, 8.0F, 0.01F, false);
		Jaw2.setTextureOffset(31, 46).addBox(-1.5F, -0.2F, -6.8F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		Jaw2.setTextureOffset(28, 73).addBox(-1.5F, -0.3476F, -1.901F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, -11.0F, 0.0F);
		Body.addChild(LeftArm);
		LeftArm.setTextureOffset(114, 0).addBox(-0.99F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(116, 17).addBox(-1.0F, 2.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, -11.0F, 0.0F);
		Body.addChild(RightArm);
		RightArm.setTextureOffset(100, 0).addBox(-2.01F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(116, 17).addBox(-2.0F, 2.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		RightArm.setTextureOffset(14, 123).addBox(-3.0F, 11.0F, 0.0F, 4.0F, 5.0F, 0.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(2.0F, 1.0F, 0.0F);
		Body.addChild(LeftLeg);
		LeftLeg.setTextureOffset(116, 17).addBox(-1.5F, 4.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		LeftLeg.setTextureOffset(88, 16).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);
		LeftLeg.setTextureOffset(20, 47).addBox(-2.5F, 10.1F, -2.5F, 5.0F, 2.0F, 2.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-2.0F, 1.0F, 0.0F);
		Body.addChild(RightLeg);
		RightLeg.setTextureOffset(116, 17).addBox(-1.5F, 4.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		RightLeg.setTextureOffset(20, 47).addBox(-2.5F, 10.1F, -2.5F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		RightLeg.setTextureOffset(88, 33).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);
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
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.Tail.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}
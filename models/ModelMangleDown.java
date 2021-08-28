// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelMangleDown extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Tail;
	private final ModelRenderer LongArm;
	private final ModelRenderer LongArm2;
	private final ModelRenderer EndoArm;
	private final ModelRenderer EndoHead;
	private final ModelRenderer EndoJaw;
	private final ModelRenderer MangleArm;
	private final ModelRenderer MangleArm2;
	private final ModelRenderer Bowtie;
	private final ModelRenderer MangleHead;
	private final ModelRenderer Jaw;
	private final ModelRenderer RightArm4;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg;
	private final ModelRenderer BackLeg;

	public ModelMangleDown() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 24.0F, 0.0F);
		Body.setTextureOffset(32, 76).addBox(-1.0F, -14.0F, -0.5F, 2.0F, 12.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(72, 78).addBox(-3.0F, -12.0F, -0.5F, 6.0F, 7.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(31, 70).addBox(1.0F, -13.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(31, 70).addBox(-5.0F, -13.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(11, 86).addBox(-3.0F, -2.0F, -1.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);

		Body_r1 = new ModelRenderer(this);
		Body_r1.setRotationPoint(12.0F, -71.0F, 0.0F);
		Body.addChild(Body_r1);
		setRotationAngle(Body_r1, 3.1416F, 0.0F, 0.0F);
		Body_r1.setTextureOffset(12, 23).addBox(-13.5F, -58.0F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, -1.5F, 1.0F);
		Body.addChild(Tail);
		setRotationAngle(Tail, 0.1309F, 0.0F, 0.0F);
		Tail.setTextureOffset(0, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		Tail.setTextureOffset(0, 4).addBox(-1.0F, -0.5F, 3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		LongArm = new ModelRenderer(this);
		LongArm.setRotationPoint(4.5F, -13.0F, 0.0F);
		Body.addChild(LongArm);
		setRotationAngle(LongArm, -0.3054F, 0.0F, -0.2618F);
		LongArm.setTextureOffset(55, 76).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
		LongArm.setTextureOffset(0, 30).addBox(-1.51F, 0.0F, -1.5F, 3.0F, 13.0F, 3.0F, -0.2F, false);

		LongArm2 = new ModelRenderer(this);
		LongArm2.setRotationPoint(0.0F, 12.0F, 0.0F);
		LongArm.addChild(LongArm2);
		setRotationAngle(LongArm2, -1.0909F, 0.0F, 0.0F);
		LongArm2.setTextureOffset(55, 76).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
		LongArm2.setTextureOffset(0, 30).addBox(-1.51F, 0.0F, -1.5F, 3.0F, 13.0F, 3.0F, -0.2F, false);

		EndoArm = new ModelRenderer(this);
		EndoArm.setRotationPoint(-4.5F, -13.0F, 0.0F);
		Body.addChild(EndoArm);
		setRotationAngle(EndoArm, -2.0508F, 0.48F, -2.7489F);
		EndoArm.setTextureOffset(0, 30).addBox(-1.51F, 0.0F, -1.5F, 3.0F, 13.0F, 3.0F, -0.2F, false);
		EndoArm.setTextureOffset(63, 76).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		EndoHead = new ModelRenderer(this);
		EndoHead.setRotationPoint(0.5F, 12.0F, 0.0F);
		EndoArm.addChild(EndoHead);
		setRotationAngle(EndoHead, -1.0908F, 0.0873F, 2.7489F);
		EndoHead.setTextureOffset(3, 72).addBox(-3.0F, -7.0F, -1.0F, 6.0F, 4.0F, 2.0F, 0.0F, false);
		EndoHead.setTextureOffset(3, 78).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
		EndoHead.setTextureOffset(21, 72).addBox(1.0F, -6.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		EndoHead.setTextureOffset(28, 73).addBox(-1.5F, -2.6F, -2.9F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		EndoHead.setTextureOffset(16, 79).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);

		EndoJaw = new ModelRenderer(this);
		EndoJaw.setRotationPoint(0.0F, -1.0F, -1.0F);
		EndoHead.addChild(EndoJaw);
		EndoJaw.setTextureOffset(16, 82).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		EndoJaw.setTextureOffset(28, 73).addBox(-1.5F, -0.3912F, -1.9F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		MangleArm = new ModelRenderer(this);
		MangleArm.setRotationPoint(-2.5F, -10.0F, 0.0F);
		Body.addChild(MangleArm);
		setRotationAngle(MangleArm, -0.3054F, 0.0F, 0.3491F);
		MangleArm.setTextureOffset(0, 30).addBox(-1.51F, 0.0F, -1.5F, 3.0F, 13.0F, 3.0F, -0.2F, false);
		MangleArm.setTextureOffset(63, 76).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		MangleArm2 = new ModelRenderer(this);
		MangleArm2.setRotationPoint(0.0F, 11.0F, 0.0F);
		MangleArm.addChild(MangleArm2);
		setRotationAngle(MangleArm2, -0.6109F, 0.0F, 1.2654F);
		MangleArm2.setTextureOffset(0, 30).addBox(-1.51F, 0.0F, -1.5F, 3.0F, 13.0F, 3.0F, -0.2F, false);
		MangleArm2.setTextureOffset(63, 76).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		Bowtie = new ModelRenderer(this);
		Bowtie.setRotationPoint(15.5F, -11.0F, 0.0F);
		MangleArm2.addChild(Bowtie);
		setRotationAngle(Bowtie, 0.0F, 0.0F, -3.1416F);
		Bowtie.setTextureOffset(50, 48).addBox(13.0F, -19.0F, -3.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);

		MangleHead = new ModelRenderer(this);
		MangleHead.setRotationPoint(-0.1381F, 11.7715F, -0.0766F);
		MangleArm2.addChild(MangleHead);
		setRotationAngle(MangleHead, 0.2618F, 1.7017F, -1.5272F);
		MangleHead.setTextureOffset(34, 48).addBox(-1.5F, -2.5F, -7.8F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		MangleHead.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 6.0F, 8.0F, 0.0F, false);
		MangleHead.setTextureOffset(98, 0).addBox(-5.5F, -4.0F, -4.3F, 11.0F, 2.0F, 4.0F, 0.0F, false);
		MangleHead.setTextureOffset(40, 0).addBox(-4.0F, -2.0F, 1.0F, 8.0F, 1.0F, 3.0F, 0.0F, false);
		MangleHead.setTextureOffset(67, 39).addBox(-2.0F, -4.0F, -8.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		MangleHead.setTextureOffset(58, 15).addBox(-1.0F, -4.5F, -8.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		MangleHead.setTextureOffset(3, 72).addBox(-3.0F, -7.0F, -2.0F, 6.0F, 4.0F, 2.0F, 0.0F, false);
		MangleHead.setTextureOffset(3, 78).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
		MangleHead.setTextureOffset(21, 65).addBox(1.0F, -6.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		MangleHead.setTextureOffset(21, 68).addBox(0.5F, -6.1F, -3.1F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		MangleHead.setTextureOffset(21, 68).addBox(-3.5F, -6.1F, -3.1F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		MangleHead.setTextureOffset(21, 75).addBox(-3.0F, -6.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		MangleHead.setTextureOffset(28, 73).addBox(-1.5F, -2.6F, -3.9F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		MangleHead.setTextureOffset(16, 79).addBox(-2.0F, -3.0F, -4.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		MangleHead.setTextureOffset(83, 59).addBox(3.0F, -12.0F, -1.0F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		MangleHead.setTextureOffset(75, 59).addBox(-6.0F, -12.0F, -1.0F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		MangleHead.setTextureOffset(42, 35).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		MangleHead.setTextureOffset(43, 39).addBox(-1.5F, -10.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		Jaw = new ModelRenderer(this);
		Jaw.setRotationPoint(0.0F, -1.0F, -1.0F);
		MangleHead.addChild(Jaw);
		setRotationAngle(Jaw, 0.1745F, 0.0F, 0.0F);
		Jaw.setTextureOffset(16, 82).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		Jaw.setTextureOffset(66, 49).addBox(-2.0F, 0.5F, -7.0F, 4.0F, 1.0F, 8.0F, 0.01F, false);
		Jaw.setTextureOffset(34, 48).addBox(-1.5F, -0.2F, -6.8F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		Jaw.setTextureOffset(28, 73).addBox(-1.5F, -0.3912F, -2.9F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		RightArm4 = new ModelRenderer(this);
		RightArm4.setRotationPoint(-3.5F, -1.0F, 0.0F);
		Body.addChild(RightArm4);
		setRotationAngle(RightArm4, 0.5672F, 0.0F, 1.4835F);
		RightArm4.setTextureOffset(12, 30).addBox(-1.51F, -1.0F, -2.0F, 3.0F, 13.0F, 4.0F, 0.0F, false);
		RightArm4.setTextureOffset(0, 30).addBox(-1.51F, -1.0F, -1.5F, 3.0F, 13.0F, 3.0F, -0.2F, false);
		RightArm4.setTextureOffset(63, 76).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(3.0F, 0.0F, -3.0F);
		Body.addChild(LeftLeg);
		setRotationAngle(LeftLeg, -1.6144F, 0.0F, 0.0F);
		LeftLeg.setTextureOffset(39, 76).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
		LeftLeg.setTextureOffset(97, 47).addBox(-2.5F, 10.1F, -3.5F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		LeftLeg.setTextureOffset(112, 45).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 13.0F, 4.0F, 0.1F, false);
		LeftLeg.setTextureOffset(88, 75).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 13.0F, 3.0F, -0.2F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-2.0F, -1.0F, -3.0F);
		Body.addChild(RightLeg);
		setRotationAngle(RightLeg, -1.5708F, 0.0F, 0.0F);
		RightLeg.setTextureOffset(47, 76).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
		RightLeg.setTextureOffset(88, 75).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 13.0F, 3.0F, -0.2F, false);
		RightLeg.setTextureOffset(96, 64).addBox(-2.5F, 10.1F, -3.5F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		RightLeg.setTextureOffset(111, 62).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 13.0F, 4.0F, 0.1F, false);

		BackLeg = new ModelRenderer(this);
		BackLeg.setRotationPoint(3.0F, -1.0F, 1.0F);
		Body.addChild(BackLeg);
		setRotationAngle(BackLeg, -1.7017F, -2.9671F, 0.0F);
		BackLeg.setTextureOffset(47, 76).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
		BackLeg.setTextureOffset(88, 75).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 13.0F, 3.0F, -0.2F, false);
		BackLeg.setTextureOffset(97, 47).addBox(-2.5F, 10.1F, -2.5F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		BackLeg.setTextureOffset(112, 45).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.1F, false);
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
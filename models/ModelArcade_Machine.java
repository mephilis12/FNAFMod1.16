// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelArcade_Machine extends EntityModel<Entity> {
	private final ModelRenderer bb_main;

	public ModelArcade_Machine() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-7.0F, -15.0F, -6.0F, 14.0F, 15.0F, 14.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 37).addBox(-7.0F, -27.0F, -2.0F, 14.0F, 12.0F, 10.0F, 0.0F, false);
		bb_main.setTextureOffset(74, 0).addBox(-7.0F, -31.0F, -5.0F, 14.0F, 4.0F, 13.0F, 0.0F, false);
		bb_main.setTextureOffset(62, 87).addBox(-7.0F, -27.0F, -6.0F, 14.0F, 12.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(62, 109).addBox(-7.0F, -27.0F, -6.0F, 14.0F, 12.0F, 4.0F, -0.1F, false);
		bb_main.setTextureOffset(0, 59).addBox(-7.0F, -16.0F, -4.0F, 14.0F, 1.0F, 12.0F, -0.1F, false);
		bb_main.setTextureOffset(0, 72).addBox(-7.0F, -16.8F, 0.0F, 14.0F, 1.0F, 8.0F, -0.1F, false);
		bb_main.setTextureOffset(92, 30).addBox(-7.0F, -15.0F, -8.0F, 14.0F, 4.0F, 4.0F, 0.1F, false);
		bb_main.setTextureOffset(58, 50).addBox(-7.0F, -27.0F, -3.0F, 14.0F, 12.0F, 11.0F, -0.1F, false);
		bb_main.setTextureOffset(80, 73).addBox(-7.0F, -32.0F, -3.0F, 14.0F, 1.0F, 10.0F, 0.0F, false);
		bb_main.setTextureOffset(85, 23).addBox(5.0F, -15.5F, -7.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(85, 23).addBox(5.0F, -15.5F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(85, 23).addBox(3.0F, -15.5F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(85, 23).addBox(3.0F, -15.5F, -7.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(90, 23).addBox(1.0F, -17.0F, -6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(85, 23).addBox(-2.0F, -15.5F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(85, 23).addBox(-4.0F, -15.5F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(85, 23).addBox(-4.0F, -15.5F, -7.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(85, 23).addBox(-2.0F, -15.5F, -7.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(85, 26).addBox(0.5F, -18.5F, -6.5F, 2.0F, 2.0F, 2.0F, -0.3F, false);
		bb_main.setTextureOffset(90, 23).addBox(-6.0F, -17.0F, -6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(85, 26).addBox(-6.5F, -18.5F, -6.5F, 2.0F, 2.0F, 2.0F, -0.3F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
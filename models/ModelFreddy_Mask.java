// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelFreddy_Mask extends EntityModel<Entity> {
	private final ModelRenderer Head;

	public ModelFreddy_Mask() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 6.0F, 8.0F, 0.51F, false);
		Head.setTextureOffset(4, 25).addBox(-4.5F, -4.0F, -4.3F, 9.0F, 2.0F, 3.0F, 0.5F, false);
		Head.setTextureOffset(6, 20).addBox(-4.0F, -1.0F, 1.0F, 8.0F, 1.0F, 3.0F, 0.51F, false);
		Head.setTextureOffset(16, 31).addBox(-3.0F, -3.5F, -5.5F, 6.0F, 2.0F, 1.0F, 0.1F, false);
		Head.setTextureOffset(24, 35).addBox(-1.0F, -4.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.1F, false);
		Head.setTextureOffset(22, 50).addBox(3.5F, -10.5F, -1.0F, 3.0F, 3.0F, 1.0F, 0.1F, false);
		Head.setTextureOffset(22, 55).addBox(-6.5F, -10.5F, -1.0F, 3.0F, 3.0F, 1.0F, 0.1F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
package net.mcreator.fnafmod.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.fnafmod.entity.ToyBonnieEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ToyBonnieRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ToyBonnieEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelToy_Bonnie(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("fnaf_mod:textures/toy_bonnie.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class ModelToy_Bonnie extends EntityModel<Entity> {
		private final ModelRenderer Body;
		private final ModelRenderer Head;
		private final ModelRenderer Jaw;
		private final ModelRenderer LeftEar;
		private final ModelRenderer LeftTop;
		private final ModelRenderer RightEar;
		private final ModelRenderer RightTop;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer RightLeg;
		public ModelToy_Bonnie() {
			textureWidth = 128;
			textureHeight = 128;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 11.0F, 0.0F);
			Body.setTextureOffset(50, 48).addBox(-2.5F, -13.0F, -4.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(4, 16).addBox(-4.0F, -14.0F, -3.0F, 8.0F, 12.0F, 6.0F, 0.0F, false);
			Body.setTextureOffset(36, 53).addBox(-4.0F, -2.0F, -3.0F, 8.0F, 2.0F, 6.0F, 0.0F, false);
			Body.setTextureOffset(0, 50).addBox(-1.0F, -2.0F, 3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(32, 76).addBox(-1.0F, -14.0F, -0.5F, 2.0F, 12.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(31, 70).addBox(1.0F, -12.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(37, 70).addBox(-3.0F, -12.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(11, 86).addBox(-3.0F, -2.0F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, -14.0F, 0.0F);
			Body.addChild(Head);
			Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			Head.setTextureOffset(0, 51).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.2F, false);
			Head.setTextureOffset(0, 34).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 3.0F, 8.0F, 0.2F, false);
			Head.setTextureOffset(50, 11).addBox(-2.0F, -4.0F, -5.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(58, 15).addBox(-1.0F, -4.5F, -5.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(21, 72).addBox(1.0F, -6.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(21, 68).addBox(0.5F, -6.1F, -3.1F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(21, 68).addBox(-3.5F, -6.1F, -3.1F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(21, 75).addBox(-3.0F, -6.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(28, 73).addBox(-1.5F, -2.6F, -4.9F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Jaw = new ModelRenderer(this);
			Jaw.setRotationPoint(0.0F, -1.0F, -1.0F);
			Head.addChild(Jaw);
			Jaw.setTextureOffset(40, 39).addBox(-2.5F, 0.0F, -4.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);
			Jaw.setTextureOffset(34, 49).addBox(-2.0F, -0.5F, -3.8F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			LeftEar = new ModelRenderer(this);
			LeftEar.setRotationPoint(2.5F, -8.0F, 0.0F);
			Head.addChild(LeftEar);
			LeftEar.setTextureOffset(50, 18).addBox(-1.5F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			LeftEar.setTextureOffset(44, 69).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			LeftTop = new ModelRenderer(this);
			LeftTop.setRotationPoint(0.0F, -3.0F, 0.0F);
			LeftEar.addChild(LeftTop);
			LeftTop.setTextureOffset(50, 24).addBox(-1.5F, -5.0F, -1.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);
			LeftTop.setTextureOffset(56, 69).addBox(-1.0F, -4.0F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			RightEar = new ModelRenderer(this);
			RightEar.setRotationPoint(-2.5F, -8.0F, 0.0F);
			Head.addChild(RightEar);
			RightEar.setTextureOffset(50, 69).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			RightEar.setTextureOffset(60, 18).addBox(-1.5F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			RightTop = new ModelRenderer(this);
			RightTop.setRotationPoint(0.0F, -3.0F, 0.0F);
			RightEar.addChild(RightTop);
			RightTop.setTextureOffset(62, 69).addBox(-1.0F, -4.0F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			RightTop.setTextureOffset(60, 24).addBox(-1.5F, -5.0F, -1.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);
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
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}

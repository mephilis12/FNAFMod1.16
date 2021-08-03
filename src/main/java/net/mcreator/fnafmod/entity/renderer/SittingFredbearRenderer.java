package net.mcreator.fnafmod.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.fnafmod.entity.SittingFredbearEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SittingFredbearRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SittingFredbearEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelsitting_fredbear(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("fnaf_mod:textures/fredbearsitting.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelsitting_fredbear extends EntityModel<Entity> {
		private final ModelRenderer Body;
		private final ModelRenderer Body_r1;
		private final ModelRenderer Head;
		private final ModelRenderer Jaw;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer RightLeg;
		public Modelsitting_fredbear() {
			textureWidth = 128;
			textureHeight = 128;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 26.0F, 0.0F);
			setRotationAngle(Body, 0.2618F, 0.0F, 0.0F);
			Body.setTextureOffset(63, 0).addBox(4.0F, -14.2F, 3.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(63, 5).addBox(-7.0F, -14.2F, 3.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(50, 48).addBox(-2.5F, -13.0F, 1.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(4, 14).addBox(-4.0F, -13.0F, 2.0F, 8.0F, 10.0F, 6.0F, 0.0F, false);
			Body.setTextureOffset(32, 76).addBox(-1.0F, -14.0F, 4.5F, 2.0F, 12.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(31, 70).addBox(1.0F, -12.0F, 4.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(37, 70).addBox(-3.0F, -12.0F, 4.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body_r1 = new ModelRenderer(this);
			Body_r1.setRotationPoint(0.0F, 0.0F, 5.0F);
			Body.addChild(Body_r1);
			setRotationAngle(Body_r1, -0.2618F, 0.0F, 0.0F);
			Body_r1.setTextureOffset(11, 86).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
			Body_r1.setTextureOffset(36, 53).addBox(-4.0F, -2.5F, -3.0F, 8.0F, 2.0F, 6.0F, 0.0F, false);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, -16.0F, 5.0F);
			Body.addChild(Head);
			setRotationAngle(Head, 0.0436F, 0.0F, 0.1745F);
			Head.setTextureOffset(0, 0).addBox(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, 0.0F, false);
			Head.setTextureOffset(38, 5).addBox(-4.5F, -2.0F, -4.3F, 9.0F, 2.0F, 3.0F, -0.2F, false);
			Head.setTextureOffset(40, 0).addBox(-4.0F, 0.0F, 1.0F, 8.0F, 1.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(50, 11).addBox(-3.0F, -2.0F, -5.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(58, 15).addBox(-1.0F, -2.5F, -5.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(48, 18).addBox(-2.0F, -7.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(52, 24).addBox(-1.5F, -9.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(56, 30).addBox(3.0F, -8.0F, -1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(56, 35).addBox(-6.0F, -8.0F, -1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(3, 72).addBox(-3.0F, -5.0F, -1.0F, 6.0F, 4.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(3, 78).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(21, 72).addBox(1.0F, -4.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(21, 68).addBox(0.5F, -4.1F, -2.1F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(21, 68).addBox(-3.5F, -4.1F, -2.1F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(21, 75).addBox(-3.0F, -4.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(28, 73).addBox(-1.5F, -0.6F, -2.9F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(16, 79).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
			Jaw = new ModelRenderer(this);
			Jaw.setRotationPoint(0.0F, 0.0F, -1.0F);
			Head.addChild(Jaw);
			setRotationAngle(Jaw, 0.3054F, 0.0F, -0.0873F);
			Jaw.setTextureOffset(16, 82).addBox(-2.0F, 1.5034F, -2.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
			Jaw.setTextureOffset(40, 39).addBox(-3.5F, 1.0034F, -4.2314F, 7.0F, 2.0F, 5.0F, 0.0F, false);
			Jaw.setTextureOffset(34, 49).addBox(-3.0F, 0.5034F, -4.0314F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			Jaw.setTextureOffset(28, 73).addBox(-1.5F, 1.1122F, -1.9F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, -11.0F, 5.0F);
			Body.addChild(LeftArm);
			setRotationAngle(LeftArm, -0.2618F, 0.0F, -0.1309F);
			LeftArm.setTextureOffset(12, 30).addBox(-0.99F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(55, 76).addBox(-0.5F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, -12.0F, 6.0F);
			Body.addChild(RightArm);
			setRotationAngle(RightArm, -0.2182F, 0.0F, 0.1309F);
			RightArm.setTextureOffset(26, 30).addBox(-2.01F, -1.0F, -3.0F, 3.0F, 13.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(63, 76).addBox(-1.5F, -1.0F, -2.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(2.0F, -0.9319F, 0.5176F);
			Body.addChild(LeftLeg);
			setRotationAngle(LeftLeg, -1.789F, -0.0873F, 0.0F);
			LeftLeg.setTextureOffset(39, 76).addBox(0.0824F, -1.8814F, -4.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 46).addBox(-0.9176F, -1.8814F, -5.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);
			LeftLeg.setTextureOffset(20, 47).addBox(-1.4176F, 9.2186F, -5.5F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-2.0F, -0.9319F, 0.5176F);
			Body.addChild(RightLeg);
			setRotationAngle(RightLeg, -1.8326F, 0.2182F, 0.0F);
			RightLeg.setTextureOffset(47, 76).addBox(-2.0824F, -1.8814F, -4.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
			RightLeg.setTextureOffset(20, 47).addBox(-3.5824F, 9.2186F, -5.5F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			RightLeg.setTextureOffset(32, 12).addBox(-3.0824F, -1.8814F, -5.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);
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
		}
	}
}

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

import net.mcreator.fnafmod.entity.BBEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BBRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BBEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelBB(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("fnaf_mod:textures/bb.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class ModelBB extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		public ModelBB() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 6.0F, 0.0F);
			Head.setTextureOffset(0, 0).addBox(-4.0F, -8.01F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			Head.setTextureOffset(32, 0).addBox(-4.0F, -8.01F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);
			Head.setTextureOffset(7, 33).addBox(-4.0F, -8.01F, -4.0F, 8.0F, 8.0F, 8.0F, 0.2F, false);
			Head.setTextureOffset(25, 30).addBox(1.0F, -5.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(52, 23).addBox(-3.0F, -2.5F, -3.9F, 6.0F, 1.0F, 0.0F, 0.0F, false);
			Head.setTextureOffset(52, 23).addBox(-3.0F, -1.0F, -3.7F, 6.0F, 1.0F, 0.0F, -0.2F, false);
			Head.setTextureOffset(0, 36).addBox(0.5F, -5.1F, -3.1F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 36).addBox(-3.5F, -5.1F, -3.1F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(17, 30).addBox(-3.0F, -5.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-0.5F, -10.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(47, 41).addBox(-1.5F, -10.0F, -1.5F, 3.0F, 0.0F, 3.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(16, 16).addBox(-4.0F, 6.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 8.0F, 0.0F);
			RightArm.setTextureOffset(40, 16).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 8.0F, 0.0F);
			LeftArm.setTextureOffset(32, 53).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 16.0F, 0.0F);
			RightLeg.setTextureOffset(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 16.0F, 0.0F);
			LeftLeg.setTextureOffset(16, 54).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
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

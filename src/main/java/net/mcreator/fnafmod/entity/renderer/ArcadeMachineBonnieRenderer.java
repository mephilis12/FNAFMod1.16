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

import net.mcreator.fnafmod.entity.ArcadeMachineBonnieEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ArcadeMachineBonnieRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ArcadeMachineBonnieEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelArcade_Machine(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("fnaf_mod:textures/arcade_machine.png");
					}
				};
			});
		}
	}

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
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}
}

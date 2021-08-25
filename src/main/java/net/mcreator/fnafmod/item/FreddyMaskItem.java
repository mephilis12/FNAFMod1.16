
package net.mcreator.fnafmod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.mcreator.fnafmod.procedures.FreddyMaskHelmetTickEventProcedure;
import net.mcreator.fnafmod.itemgroup.FNAFItemsItemGroup;
import net.mcreator.fnafmod.FnafModModElements;

import java.util.Map;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@FnafModModElements.ModElement.Tag
public class FreddyMaskItem extends FnafModModElements.ModElement {
	@ObjectHolder("fnaf_mod:freddy_mask_helmet")
	public static final Item helmet = null;
	@ObjectHolder("fnaf_mod:freddy_mask_chestplate")
	public static final Item body = null;
	@ObjectHolder("fnaf_mod:freddy_mask_leggings")
	public static final Item legs = null;
	@ObjectHolder("fnaf_mod:freddy_mask_boots")
	public static final Item boots = null;
	public FreddyMaskItem(FnafModModElements instance) {
		super(instance, 268);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 9;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "freddy_mask";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(FNAFItemsItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedHead = new ModelFreddy_Mask().Head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "fnaf_mod:textures/freddymask.png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				super.onArmorTick(itemstack, world, entity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					FreddyMaskHelmetTickEventProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("freddy_mask_helmet"));
	}
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
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}
}


package net.mcreator.fnafmod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.mcreator.fnafmod.itemgroup.FNAFItemsItemGroup;
import net.mcreator.fnafmod.FnafModModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@FnafModModElements.ModElement.Tag
public class SpringLockSuitItem extends FnafModModElements.ModElement {
	@ObjectHolder("fnaf_mod:spring_lock_suit_helmet")
	public static final Item helmet = null;
	@ObjectHolder("fnaf_mod:spring_lock_suit_chestplate")
	public static final Item body = null;
	@ObjectHolder("fnaf_mod:spring_lock_suit_leggings")
	public static final Item legs = null;
	@ObjectHolder("fnaf_mod:spring_lock_suit_boots")
	public static final Item boots = null;
	public SpringLockSuitItem(FnafModModElements instance) {
		super(instance, 138);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 0;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{0, 0, 0, 0}[slot.getIndex()];
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
				return "spring_lock_suit";
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
				armorModel.bipedHead = new ModelSpring_Bonnie_Suit().Helmet;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "fnaf_mod:textures/spring_bonnie_suit.png";
			}
		}.setRegistryName("spring_lock_suit_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(FNAFItemsItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedBody = new ModelSpring_Bonnie_Suit().Chestplate;
				armorModel.bipedLeftArm = new ModelSpring_Bonnie_Suit().LArm;
				armorModel.bipedRightArm = new ModelSpring_Bonnie_Suit().RArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "fnaf_mod:textures/spring_bonnie_suit.png";
			}
		}.setRegistryName("spring_lock_suit_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(FNAFItemsItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedLeftLeg = new ModelSpring_Bonnie_Suit().LLeg;
				armorModel.bipedRightLeg = new ModelSpring_Bonnie_Suit().RLeg;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "fnaf_mod:textures/spring_bonnie_suit.png";
			}
		}.setRegistryName("spring_lock_suit_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(FNAFItemsItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedLeftLeg = new ModelSpring_Bonnie_Suit().LBoot;
				armorModel.bipedRightLeg = new ModelSpring_Bonnie_Suit().RBoot;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "fnaf_mod:textures/spring_bonnie_suit.png";
			}
		}.setRegistryName("spring_lock_suit_boots"));
	}
	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class ModelSpring_Bonnie_Suit extends EntityModel<Entity> {
		private final ModelRenderer Helmet;
		private final ModelRenderer Jaw;
		private final ModelRenderer LeftEar;
		private final ModelRenderer LeftTop;
		private final ModelRenderer RightEar;
		private final ModelRenderer RightTop;
		private final ModelRenderer Chestplate;
		private final ModelRenderer LArm;
		private final ModelRenderer RArm;
		private final ModelRenderer LLeg;
		private final ModelRenderer RLeg;
		private final ModelRenderer LBoot;
		private final ModelRenderer RBoot;
		public ModelSpring_Bonnie_Suit() {
			textureWidth = 128;
			textureHeight = 128;
			Helmet = new ModelRenderer(this);
			Helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
			Helmet.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 6.0F, 8.0F, 0.51F, false);
			Helmet.setTextureOffset(40, 0).addBox(-4.0F, -2.0F, 1.0F, 8.0F, 1.0F, 3.0F, 0.1F, false);
			Helmet.setTextureOffset(50, 11).addBox(-2.0F, -3.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.1F, false);
			Helmet.setTextureOffset(58, 15).addBox(-1.0F, -3.5F, -5.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Helmet.setTextureOffset(38, 49).addBox(-1.5F, -2.3912F, -4.8F, 3.0F, 1.0F, 1.0F, 0.1F, false);
			Jaw = new ModelRenderer(this);
			Jaw.setRotationPoint(0.0F, -1.0F, 0.0F);
			Helmet.addChild(Jaw);
			setRotationAngle(Jaw, 0.1309F, 0.0F, 0.0F);
			Jaw.setTextureOffset(40, 39).addBox(-4.0F, -0.5F, -4.5F, 8.0F, 2.0F, 6.0F, 0.1F, false);
			Jaw.setTextureOffset(34, 49).addBox(-3.5F, -1.25F, -4.25F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			LeftEar = new ModelRenderer(this);
			LeftEar.setRotationPoint(2.5F, -8.0F, 0.0F);
			Helmet.addChild(LeftEar);
			LeftEar.setTextureOffset(50, 18).addBox(-1.5F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			LeftEar.setTextureOffset(100, 67).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			LeftTop = new ModelRenderer(this);
			LeftTop.setRotationPoint(0.0F, -3.0F, 0.0F);
			LeftEar.addChild(LeftTop);
			LeftTop.setTextureOffset(50, 24).addBox(-1.5F, -5.0F, -1.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);
			LeftTop.setTextureOffset(112, 67).addBox(-1.0F, -4.0F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			RightEar = new ModelRenderer(this);
			RightEar.setRotationPoint(-2.5F, -8.0F, 0.0F);
			Helmet.addChild(RightEar);
			RightEar.setTextureOffset(105, 67).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			RightEar.setTextureOffset(60, 18).addBox(-1.5F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			RightTop = new ModelRenderer(this);
			RightTop.setRotationPoint(0.0F, -3.0F, 0.0F);
			RightEar.addChild(RightTop);
			RightTop.setTextureOffset(118, 67).addBox(-1.0F, -4.0F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			RightTop.setTextureOffset(60, 24).addBox(-1.5F, -5.0F, -1.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);
			Chestplate = new ModelRenderer(this);
			Chestplate.setRotationPoint(0.0F, 0.0F, 0.0F);
			Chestplate.setTextureOffset(63, 0).addBox(4.0F, -1.2F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			Chestplate.setTextureOffset(63, 5).addBox(-8.0F, -1.2F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			Chestplate.setTextureOffset(50, 48).addBox(-2.5F, 0.0F, -4.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			Chestplate.setTextureOffset(4, 14).addBox(-4.0F, -1.0F, -3.0F, 8.0F, 12.0F, 6.0F, 0.26F, false);
			LArm = new ModelRenderer(this);
			LArm.setRotationPoint(5.0F, 1.0F, 0.0F);
			LArm.setTextureOffset(12, 31).addBox(-0.99F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.26F, false);
			RArm = new ModelRenderer(this);
			RArm.setRotationPoint(-5.0F, 1.0F, 0.0F);
			RArm.setTextureOffset(12, 31).addBox(-3.01F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.26F, false);
			LLeg = new ModelRenderer(this);
			LLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
			LLeg.setTextureOffset(0, 46).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.26F, false);
			RLeg = new ModelRenderer(this);
			RLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
			RLeg.setTextureOffset(0, 46).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.26F, false);
			LBoot = new ModelRenderer(this);
			LBoot.setRotationPoint(2.0F, 12.0F, 0.0F);
			LBoot.setTextureOffset(0, 59).addBox(-2.0F, 6.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.26F, false);
			LBoot.setTextureOffset(20, 47).addBox(-2.5F, 10.1F, -2.5F, 5.0F, 2.0F, 2.0F, 0.26F, false);
			RBoot = new ModelRenderer(this);
			RBoot.setRotationPoint(-2.0F, 12.0F, 0.0F);
			RBoot.setTextureOffset(0, 59).addBox(-2.0F, 6.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.26F, false);
			RBoot.setTextureOffset(20, 47).addBox(-2.5F, 10.1F, -2.5F, 5.0F, 2.0F, 2.0F, 0.26F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Helmet.render(matrixStack, buffer, packedLight, packedOverlay);
			Chestplate.render(matrixStack, buffer, packedLight, packedOverlay);
			LArm.render(matrixStack, buffer, packedLight, packedOverlay);
			RArm.render(matrixStack, buffer, packedLight, packedOverlay);
			LLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			RLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			LBoot.render(matrixStack, buffer, packedLight, packedOverlay);
			RBoot.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}
}

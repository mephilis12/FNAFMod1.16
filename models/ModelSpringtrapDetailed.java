// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelSpringtrapDetailed extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer torso;
	private final ModelRenderer right_arm;
	private final ModelRenderer lower_arm;
	private final ModelRenderer hand;
	private final ModelRenderer thumb;
	private final ModelRenderer fingers;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer left_arm;
	private final ModelRenderer lower_arm2;
	private final ModelRenderer hand2;
	private final ModelRenderer thumb2;
	private final ModelRenderer fingers2;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone;
	private final ModelRenderer hip_left;
	private final ModelRenderer hip_right;
	private final ModelRenderer neck;
	private final ModelRenderer head;
	private final ModelRenderer skull;
	private final ModelRenderer headwear;
	private final ModelRenderer skull_jaw;
	private final ModelRenderer lower_jaw;
	private final ModelRenderer right_ear;
	private final ModelRenderer upper_ear;
	private final ModelRenderer left_ear;
	private final ModelRenderer left_leg;
	private final ModelRenderer lower_leg;
	private final ModelRenderer foot;
	private final ModelRenderer flesh;
	private final ModelRenderer right_leg;
	private final ModelRenderer lower_leg2;
	private final ModelRenderer foot2;
	private final ModelRenderer flesh2;

	public ModelSpringtrapDetailed() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, -28.5F, 2.0F);
		body.addChild(torso);
		torso.setTextureOffset(67, 80).addBox(4.0F, -12.0F, -1.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		torso.setTextureOffset(67, 80).addBox(-7.0F, -12.0F, -1.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		torso.setTextureOffset(0, 37).addBox(-4.0F, -12.5F, -3.0F, 8.0F, 8.0F, 5.0F, 0.0F, false);
		torso.setTextureOffset(0, 0).addBox(-5.5F, -13.0F, -4.0F, 11.0F, 11.0F, 7.0F, 0.0F, false);
		torso.setTextureOffset(30, 12).addBox(-5.5F, -1.0F, -3.5F, 11.0F, 4.0F, 6.0F, 0.0F, false);
		torso.setTextureOffset(68, 0).addBox(-3.5F, -12.0F, -4.5F, 7.0F, 9.0F, 1.0F, 0.0F, false);
		torso.setTextureOffset(48, 22).addBox(-3.5F, -4.5F, -2.0F, 7.0F, 6.0F, 4.0F, 0.0F, false);
		torso.setTextureOffset(26, 42).addBox(-4.0F, -0.5F, -2.75F, 8.0F, 3.0F, 5.0F, 0.0F, false);
		torso.setTextureOffset(45, 50).addBox(2.0F, -4.5F, -2.6F, 1.0F, 6.0F, 0.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(7.0F, -10.5F, 0.5F);
		torso.addChild(right_arm);
		right_arm.setTextureOffset(0, 63).addBox(0.0F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(68, 28).addBox(-1.0F, -3.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(48, 32).addBox(0.0F, -0.5F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		right_arm.setTextureOffset(42, 22).addBox(-0.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		right_arm.setTextureOffset(58, 13).addBox(1.0F, 0.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(76, 50).addBox(0.5F, 1.5F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(82, 17).addBox(1.0F, 3.5F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		lower_arm = new ModelRenderer(this);
		lower_arm.setRotationPoint(2.5F, 7.5F, -2.0F);
		right_arm.addChild(lower_arm);
		lower_arm.setTextureOffset(68, 40).addBox(-1.5F, 0.5F, 0.5F, 3.0F, 6.0F, 4.0F, 0.0F, false);
		lower_arm.setTextureOffset(47, 42).addBox(-0.5F, 4.5F, 1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		lower_arm.setTextureOffset(0, 37).addBox(-0.5F, 0.0F, 1.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		lower_arm.setTextureOffset(79, 80).addBox(-1.0F, 1.0F, 1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		lower_arm.setTextureOffset(26, 41).addBox(1.1F, 1.0F, 1.5F, 0.0F, 5.0F, 1.0F, 0.0F, false);
		lower_arm.setTextureOffset(26, 41).addBox(-1.1F, 1.0F, 1.5F, 0.0F, 5.0F, 1.0F, 0.0F, false);
		lower_arm.setTextureOffset(64, 0).addBox(-0.5F, 1.0F, 0.9F, 1.0F, 5.0F, 0.0F, 0.0F, false);
		lower_arm.setTextureOffset(64, 0).addBox(-0.5F, 1.0F, 3.1F, 1.0F, 5.0F, 0.0F, 0.0F, false);

		hand = new ModelRenderer(this);
		hand.setRotationPoint(0.0F, 7.5F, 2.0F);
		lower_arm.addChild(hand);
		hand.setTextureOffset(78, 36).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 4.0F, 0.0F, false);
		hand.setTextureOffset(49, 81).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		hand.setTextureOffset(18, 33).addBox(0.7503F, -0.5829F, -0.6016F, 0.0F, 3.0F, 1.0F, 0.0F, false);

		thumb = new ModelRenderer(this);
		thumb.setRotationPoint(-9.5F, -24.0F, -2.0F);
		hand.addChild(thumb);
		thumb.setTextureOffset(62, 44).addBox(8.5F, 25.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		fingers = new ModelRenderer(this);
		fingers.setRotationPoint(0.5F, 3.0F, 1.0F);
		hand.addChild(fingers);
		setRotationAngle(fingers, 0.0F, 0.0F, 0.6981F);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-0.5F, 0.5F, 1.0F);
		fingers.addChild(bone2);
		bone2.setTextureOffset(0, 50).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.5F, 0.5F, 0.0F);
		fingers.addChild(bone3);
		bone3.setTextureOffset(56, 32).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-0.5F, 0.5F, -1.0F);
		fingers.addChild(bone4);
		bone4.setTextureOffset(0, 50).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-0.5F, 0.5F, -2.0F);
		fingers.addChild(bone5);
		bone5.setTextureOffset(50, 58).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-7.0F, -10.5F, 0.5F);
		torso.addChild(left_arm);
		left_arm.setTextureOffset(66, 13).addBox(-4.0F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(58, 13).addBox(-3.0F, 0.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(48, 32).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		left_arm.setTextureOffset(82, 17).addBox(-3.0F, 3.5F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(76, 50).addBox(-3.5F, 1.5F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(18, 33).addBox(-3.7497F, -0.5829F, -1.1016F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		left_arm.setTextureOffset(29, 5).addBox(-4.7497F, 2.4171F, 0.3984F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		left_arm.setTextureOffset(24, 18).addBox(-1.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		left_arm.setTextureOffset(45, 50).addBox(4.0F, 6.0F, -3.1F, 1.0F, 6.0F, 0.0F, 0.0F, false);

		lower_arm2 = new ModelRenderer(this);
		lower_arm2.setRotationPoint(-2.5F, 7.5F, -0.5F);
		left_arm.addChild(lower_arm2);
		lower_arm2.setTextureOffset(44, 69).addBox(-1.5F, 0.5F, -1.5F, 3.0F, 6.0F, 4.0F, 0.0F, false);
		lower_arm2.setTextureOffset(0, 81).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		lower_arm2.setTextureOffset(0, 37).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		lower_arm2.setTextureOffset(47, 42).addBox(-0.5F, 4.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		lower_arm2.setTextureOffset(0, 6).addBox(-0.2497F, 4.5171F, -1.1016F, 3.0F, 0.0F, 1.0F, 0.0F, false);

		hand2 = new ModelRenderer(this);
		hand2.setRotationPoint(0.0F, 7.5F, 0.0F);
		lower_arm2.addChild(hand2);
		hand2.setTextureOffset(78, 10).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 4.0F, 0.0F, false);
		hand2.setTextureOffset(82, 43).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		thumb2 = new ModelRenderer(this);
		thumb2.setRotationPoint(0.5F, 1.0F, -1.5F);
		hand2.addChild(thumb2);
		thumb2.setTextureOffset(28, 60).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		fingers2 = new ModelRenderer(this);
		fingers2.setRotationPoint(23.0F, -24.0F, -2.0F);
		hand2.addChild(fingers2);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-23.0F, 27.5F, 4.0F);
		fingers2.addChild(bone6);
		bone6.setTextureOffset(0, 50).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-23.0F, 27.5F, 3.0F);
		fingers2.addChild(bone7);
		bone7.setTextureOffset(56, 32).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-23.0F, 27.5F, 2.0F);
		fingers2.addChild(bone8);
		bone8.setTextureOffset(48, 22).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-23.0F, 27.5F, 1.0F);
		fingers2.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, 0.0F);
		bone9.setTextureOffset(56, 32).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.0F, -1.5F, 0.0F);
		left_arm.addChild(bone);
		bone.setTextureOffset(58, 70).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		hip_left = new ModelRenderer(this);
		hip_left.setRotationPoint(-3.0F, -3.5F, 0.0F);
		torso.addChild(hip_left);
		setRotationAngle(hip_left, 0.0F, 0.0F, 0.5236F);
		hip_left.setTextureOffset(82, 17).addBox(2.0F, 4.1962F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		hip_left.setTextureOffset(51, 42).addBox(1.7503F, 5.0511F, -1.1016F, 1.0F, 3.0F, 0.0F, 0.0F, false);

		hip_right = new ModelRenderer(this);
		hip_right.setRotationPoint(4.0F, -2.5F, 0.0F);
		torso.addChild(hip_right);
		setRotationAngle(hip_right, 0.0F, 0.0F, -0.5236F);
		hip_right.setTextureOffset(82, 17).addBox(-4.0F, 3.1962F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, 4.0F, -1.0F);
		torso.addChild(neck);
		setRotationAngle(neck, 0.2182F, 0.0F, 0.0F);
		neck.setTextureOffset(28, 68).addBox(-2.0F, -20.0733F, 1.8959F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		neck.setTextureOffset(13, 78).addBox(-1.5F, -21.0733F, 2.3959F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -15.5F, -1.0F);
		torso.addChild(head);
		head.setTextureOffset(49, 4).addBox(4.0F, -3.4F, -1.3F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(52, 7).addBox(4.0F, -3.4F, -5.3F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(45, 0).addBox(-5.0F, -3.4F, -5.3F, 1.0F, 2.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(46, 11).addBox(-3.1F, -1.9F, -5.7F, 6.0F, 1.0F, 0.0F, 0.0F, false);
		head.setTextureOffset(33, 50).addBox(-2.5F, -3.4F, -6.5F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 34).addBox(-4.0F, -3.4F, -5.75F, 8.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(24, 22).addBox(-4.0F, -3.4F, 2.7F, 8.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(90, 32).addBox(-4.5F, -8.4F, 3.25F, 9.0F, 5.0F, 0.0F, 0.0F, false);
		head.setTextureOffset(70, 23).addBox(-4.5F, -8.4F, -5.75F, 9.0F, 5.0F, 0.0F, 0.0F, false);
		head.setTextureOffset(20, 46).addBox(-4.5F, -8.4F, -5.75F, 0.0F, 5.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(27, 0).addBox(-4.5F, -8.4F, -5.75F, 9.0F, 0.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(27, 0).addBox(-4.5F, -3.4F, -5.75F, 9.0F, 0.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(15, 41).addBox(4.5F, -8.4F, -5.75F, 0.0F, 5.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(51, 42).addBox(1.2503F, -9.5829F, -5.1016F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		head.setTextureOffset(29, 5).addBox(-5.7497F, -4.5829F, -1.1016F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		head.setTextureOffset(29, 6).addBox(2.2503F, -7.5829F, -3.1016F, 3.0F, 1.0F, 0.0F, 0.0F, false);

		skull = new ModelRenderer(this);
		skull.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(skull);
		skull.setTextureOffset(24, 26).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 7.0F, 8.0F, 0.0F, false);

		headwear = new ModelRenderer(this);
		headwear.setRotationPoint(0.0F, 20.0F, -29.0F);
		skull.addChild(headwear);
		headwear.setTextureOffset(0, 18).addBox(-4.0F, -28.0F, 24.0F, 8.0F, 8.0F, 8.0F, 0.25F, false);

		skull_jaw = new ModelRenderer(this);
		skull_jaw.setRotationPoint(0.0F, 0.3F, -0.5F);
		skull.addChild(skull_jaw);
		setRotationAngle(skull_jaw, 0.0436F, 0.0F, 0.0F);
		skull_jaw.setTextureOffset(2, 98).addBox(-3.1107F, -1.8965F, -0.0468F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		skull_jaw.setTextureOffset(4, 92).addBox(-3.1107F, -0.8965F, -4.0468F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		skull_jaw.setTextureOffset(71, 81).addBox(3.4893F, -3.3965F, -1.5468F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		skull_jaw.setTextureOffset(70, 81).addBox(3.4893F, -3.3965F, -3.0468F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		skull_jaw.setTextureOffset(70, 81).addBox(-3.5107F, -3.3965F, -3.0468F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		skull_jaw.setTextureOffset(71, 81).addBox(-3.5107F, -3.3965F, -1.5468F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		lower_jaw = new ModelRenderer(this);
		lower_jaw.setRotationPoint(0.0F, -0.8F, 1.0333F);
		head.addChild(lower_jaw);
		setRotationAngle(lower_jaw, 0.3927F, 0.0F, 0.0F);
		lower_jaw.setTextureOffset(40, 20).addBox(-4.1F, -1.6183F, -6.477F, 0.0F, 1.0F, 5.0F, 0.0F, false);
		lower_jaw.setTextureOffset(36, 6).addBox(4.1F, -1.6183F, -6.477F, 0.0F, 1.0F, 5.0F, 0.0F, false);
		lower_jaw.setTextureOffset(58, 3).addBox(3.5F, -1.0183F, -6.977F, 1.0F, 2.0F, 8.0F, 0.0F, false);
		lower_jaw.setTextureOffset(74, 64).addBox(-3.5F, -1.0183F, -6.977F, 7.0F, 2.0F, 1.0F, 0.0F, false);
		lower_jaw.setTextureOffset(24, 25).addBox(-4.0F, -1.6183F, -6.477F, 8.0F, 1.0F, 0.0F, 0.0F, false);
		lower_jaw.setTextureOffset(58, 3).addBox(-4.5F, -1.0183F, -6.977F, 1.0F, 2.0F, 8.0F, 0.0F, false);
		lower_jaw.setTextureOffset(29, 5).addBox(-5.7497F, -0.3471F, -4.577F, 3.0F, 1.0F, 0.0F, 0.0F, false);

		right_ear = new ModelRenderer(this);
		right_ear.setRotationPoint(3.0F, -8.25F, -0.5F);
		head.addChild(right_ear);
		setRotationAngle(right_ear, 0.0F, 0.0F, 0.1745F);
		right_ear.setTextureOffset(0, 18).addBox(-1.6664F, -7.573F, -0.6596F, 3.0F, 7.0F, 1.0F, 0.0F, false);
		right_ear.setTextureOffset(66, 44).addBox(-1.4164F, -7.823F, -0.1596F, 1.0F, 5.0F, 0.0F, 0.0F, false);
		right_ear.setTextureOffset(66, 44).addBox(0.0836F, -7.823F, -0.1596F, 1.0F, 5.0F, 0.0F, 0.0F, false);
		right_ear.setTextureOffset(66, 44).addBox(0.0836F, -3.823F, -0.1596F, 1.0F, 5.0F, 0.0F, 0.0F, false);
		right_ear.setTextureOffset(66, 44).addBox(-1.4164F, -3.823F, -0.1596F, 1.0F, 5.0F, 0.0F, 0.0F, false);

		upper_ear = new ModelRenderer(this);
		upper_ear.setRotationPoint(-0.2029F, -7.7647F, -0.1F);
		right_ear.addChild(upper_ear);
		setRotationAngle(upper_ear, 0.3054F, 0.0F, 0.0F);
		upper_ear.setTextureOffset(0, 0).addBox(-1.4635F, -5.4738F, -0.5157F, 3.0F, 5.0F, 0.0F, 0.0F, false);
		upper_ear.setTextureOffset(66, 44).addBox(0.2865F, -5.0733F, -0.0393F, 1.0F, 5.0F, 0.0F, 0.0F, false);
		upper_ear.setTextureOffset(66, 44).addBox(-1.2135F, -5.0733F, -0.0393F, 1.0F, 5.0F, 0.0F, 0.0F, false);
		upper_ear.setTextureOffset(29, 0).addBox(-1.4635F, -5.4738F, 0.4843F, 3.0F, 5.0F, 0.0F, 0.0F, false);
		upper_ear.setTextureOffset(23, 21).addBox(-1.4635F, -5.4738F, -0.5157F, 3.0F, 0.0F, 1.0F, 0.0F, false);
		upper_ear.setTextureOffset(32, 59).addBox(-1.4635F, -5.4738F, -0.5157F, 0.0F, 5.0F, 1.0F, 0.0F, false);
		upper_ear.setTextureOffset(28, 41).addBox(1.5365F, -5.4738F, -0.5157F, 0.0F, 5.0F, 1.0F, 0.0F, false);

		left_ear = new ModelRenderer(this);
		left_ear.setRotationPoint(-3.0F, -8.5F, -0.6F);
		head.addChild(left_ear);
		setRotationAngle(left_ear, 0.0F, 0.0F, -0.1745F);
		left_ear.setTextureOffset(21, 34).addBox(0.2427F, -5.3382F, -0.0596F, 1.0F, 8.0F, 0.0F, 0.0F, false);
		left_ear.setTextureOffset(21, 34).addBox(-1.2573F, -5.3382F, -0.0596F, 1.0F, 8.0F, 0.0F, 0.0F, false);
		left_ear.setTextureOffset(51, 42).addBox(-1.3573F, -7.3382F, -0.1596F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		left_ear.setTextureOffset(83, 67).addBox(-1.6704F, -4.3525F, -0.5596F, 3.0F, 4.0F, 1.0F, 0.0F, false);
		left_ear.setTextureOffset(36, 9).addBox(-1.6704F, -5.3525F, -0.5596F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-4.0F, -25.0F, 2.0F);
		body.addChild(left_leg);
		setRotationAngle(left_leg, 0.0F, 0.0F, 0.0436F);
		left_leg.setTextureOffset(0, 50).addBox(-2.6799F, -0.6597F, -2.5F, 5.0F, 8.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(34, 56).addBox(-2.1581F, -0.1602F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(2, 76).addBox(-2.1581F, 8.3398F, -2.5F, 4.0F, 3.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(82, 17).addBox(-1.1581F, 4.8398F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		lower_leg = new ModelRenderer(this);
		lower_leg.setRotationPoint(-0.1198F, 9.8455F, 0.5F);
		left_leg.addChild(lower_leg);
		lower_leg.setTextureOffset(82, 10).addBox(-1.0383F, -1.0057F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		lower_leg.setTextureOffset(50, 58).addBox(-2.0383F, 1.9943F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		lower_leg.setTextureOffset(56, 0).addBox(-1.0383F, 5.9943F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		lower_leg.setTextureOffset(37, 79).addBox(-1.5383F, 9.9943F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		lower_leg.setTextureOffset(25, 77).addBox(-1.5601F, 2.4948F, -1.3F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		lower_leg.setTextureOffset(76, 50).addBox(-1.55F, 1.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		foot = new ModelRenderer(this);
		foot.setRotationPoint(0.1F, 12.0F, 0.0F);
		lower_leg.addChild(foot);
		setRotationAngle(foot, 0.0F, 0.0873F, -0.0436F);
		foot.setTextureOffset(90, 23).addBox(-2.2319F, 1.0908F, -4.7236F, 4.0F, 2.0F, 7.0F, 0.0F, false);

		flesh = new ModelRenderer(this);
		flesh.setRotationPoint(-0.2319F, -6.0092F, -1.7236F);
		foot.addChild(flesh);
		setRotationAngle(flesh, 0.2182F, 0.0F, 0.0F);
		flesh.setTextureOffset(0, 2).addBox(-1.5F, 6.3341F, -3.0151F, 0.0F, 1.0F, 3.0F, 0.0F, false);
		flesh.setTextureOffset(0, 2).addBox(-0.5F, 6.3341F, -3.0151F, 0.0F, 1.0F, 3.0F, 0.0F, false);
		flesh.setTextureOffset(0, 2).addBox(0.5F, 6.3341F, -3.0151F, 0.0F, 1.0F, 3.0F, 0.0F, false);
		flesh.setTextureOffset(0, 2).addBox(1.5F, 6.3341F, -3.0151F, 0.0F, 1.0F, 3.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(4.0F, -25.0F, 2.0F);
		body.addChild(right_leg);
		setRotationAngle(right_leg, 0.0F, 0.0F, -0.0436F);
		right_leg.setTextureOffset(14, 73).addBox(-1.8419F, 8.3398F, -2.5F, 4.0F, 3.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(47, 45).addBox(-2.3201F, -0.6597F, -2.5F, 5.0F, 8.0F, 5.0F, 0.0F, false);
		right_leg.setTextureOffset(56, 32).addBox(-1.8419F, -0.1602F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(82, 17).addBox(-0.8419F, 4.8398F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(18, 33).addBox(2.0138F, 7.2635F, -0.6016F, 0.0F, 3.0F, 1.0F, 0.0F, false);

		lower_leg2 = new ModelRenderer(this);
		lower_leg2.setRotationPoint(0.2198F, 9.8455F, 0.5F);
		right_leg.addChild(lower_leg2);
		lower_leg2.setTextureOffset(56, 0).addBox(-1.0617F, 5.9943F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		lower_leg2.setTextureOffset(16, 60).addBox(-2.0617F, 1.9943F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		lower_leg2.setTextureOffset(74, 70).addBox(-1.5399F, 2.4948F, -1.3F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		lower_leg2.setTextureOffset(55, 78).addBox(-1.5617F, 9.9943F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		lower_leg2.setTextureOffset(82, 10).addBox(-1.0617F, -1.0057F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		lower_leg2.setTextureOffset(76, 50).addBox(-1.55F, 1.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		foot2 = new ModelRenderer(this);
		foot2.setRotationPoint(-0.2F, 12.0F, 0.0F);
		lower_leg2.addChild(foot2);
		setRotationAngle(foot2, 0.0F, -0.0873F, 0.0436F);
		foot2.setTextureOffset(90, 14).addBox(-1.7681F, 1.0908F, -4.7236F, 4.0F, 2.0F, 7.0F, 0.0F, false);

		flesh2 = new ModelRenderer(this);
		flesh2.setRotationPoint(0.2319F, -6.0092F, -1.7236F);
		foot2.addChild(flesh2);
		setRotationAngle(flesh2, 0.2182F, 0.0F, 0.0F);
		flesh2.setTextureOffset(0, 2).addBox(-1.5F, 6.1341F, -4.0151F, 0.0F, 1.0F, 3.0F, 0.0F, false);
		flesh2.setTextureOffset(0, 2).addBox(-0.5F, 6.1341F, -4.0151F, 0.0F, 1.0F, 3.0F, 0.0F, false);
		flesh2.setTextureOffset(0, 2).addBox(0.5F, 6.1341F, -4.0151F, 0.0F, 1.0F, 3.0F, 0.0F, false);
		flesh2.setTextureOffset(0, 2).addBox(1.5F, 6.1341F, -4.0151F, 0.0F, 1.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}
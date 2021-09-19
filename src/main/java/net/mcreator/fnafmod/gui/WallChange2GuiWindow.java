
package net.mcreator.fnafmod.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.fnafmod.FnafModMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WallChange2GuiWindow extends ContainerScreen<WallChange2Gui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = WallChange2Gui.guistate;
	public WallChange2GuiWindow(WallChange2Gui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 169;
	}
	private static final ResourceLocation texture = new ResourceLocation("fnaf_mod:textures/wall_change_2.png");
	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Type A:", 6, 35, -12829636);
		this.font.drawString(ms, "One Room Face Rest Hall Faces", 15, 44, -12829636);
		this.font.drawString(ms, "Type B:", 6, 62, -12829636);
		this.font.drawString(ms, "One Hall Face Rest Room Faces", 15, 71, -12829636);
		this.font.drawString(ms, "Type C:", 6, 89, -12829636);
		this.font.drawString(ms, "Two Room and Hall Faces ", 15, 98, -12829636);
		this.font.drawString(ms, " Opposing Each Other", 24, 107, -12829636);
		this.font.drawString(ms, "Type D:", 6, 125, -12829636);
		this.font.drawString(ms, "Two Room and Hall Faces ", 15, 134, -12829636);
		this.font.drawString(ms, "Forming a Corner", 24, 143, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 15, this.guiTop + 8, 30, 20, new StringTextComponent("A"), e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new WallChange2Gui.ButtonPressedMessage(0, x, y, z));
				WallChange2Gui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 51, this.guiTop + 8, 30, 20, new StringTextComponent("B"), e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new WallChange2Gui.ButtonPressedMessage(1, x, y, z));
				WallChange2Gui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 96, this.guiTop + 8, 30, 20, new StringTextComponent("C"), e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new WallChange2Gui.ButtonPressedMessage(2, x, y, z));
				WallChange2Gui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 132, this.guiTop + 8, 30, 20, new StringTextComponent("D"), e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new WallChange2Gui.ButtonPressedMessage(3, x, y, z));
				WallChange2Gui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
	}
}

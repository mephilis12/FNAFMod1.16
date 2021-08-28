
package net.mcreator.fnafmod.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.fnafmod.FnafModModElements;

@FnafModModElements.ModElement.Tag
public class CelebratePainting extends FnafModModElements.ModElement {
	public CelebratePainting(FnafModModElements instance) {
		super(instance, 295);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(16, 32).setRegistryName("celebrate"));
	}
}

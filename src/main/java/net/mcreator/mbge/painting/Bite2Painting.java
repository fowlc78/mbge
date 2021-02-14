
package net.mcreator.mbge.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.mbge.MbgeModElements;

@MbgeModElements.ModElement.Tag
public class Bite2Painting extends MbgeModElements.ModElement {
	public Bite2Painting(MbgeModElements instance) {
		super(instance, 4);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(64, 64).setRegistryName("bite_2"));
	}
}

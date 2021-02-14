
package net.mcreator.mbge.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.mbge.MbgeModElements;

@MbgeModElements.ModElement.Tag
public class BourvilItem extends MbgeModElements.ModElement {
	@ObjectHolder("mbge:bourvil")
	public static final Item block = null;
	public BourvilItem(MbgeModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, MbgeModElements.sounds.get(new ResourceLocation("mbge:bourvil")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("bourvil");
		}
	}
}

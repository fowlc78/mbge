
package net.mcreator.mbge.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.mbge.MbgeModElements;

@MbgeModElements.ModElement.Tag
public class HamburgerItem extends MbgeModElements.ModElement {
	@ObjectHolder("mbge:hamburger")
	public static final Item block = null;
	public HamburgerItem(MbgeModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(8).saturation(2f).build()));
			setRegistryName("hamburger");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 0;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.NONE;
		}
	}
}

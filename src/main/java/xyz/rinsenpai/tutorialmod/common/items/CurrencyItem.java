package xyz.rinsenpai.tutorialmod.common.items;

import net.minecraft.item.Item;
import xyz.rinsenpai.tutorialmod.TutorialMod;

public class CurrencyItem extends Item {

	public CurrencyItem() {
		super(new Item.Properties()
				.tab(TutorialMod.TOKEN_TAB));
	}
}

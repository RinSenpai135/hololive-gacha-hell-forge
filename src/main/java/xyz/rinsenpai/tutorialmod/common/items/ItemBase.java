package xyz.rinsenpai.tutorialmod.common.items;

import net.minecraft.item.Item;
import xyz.rinsenpai.tutorialmod.TutorialMod;

public class ItemBase extends Item {

	public ItemBase() {
		super(new Item.Properties()
				.tab(TutorialMod.MAIN_MOD_TAB));
	}
}

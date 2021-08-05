package xyz.rinsenpai.hololivegachahell.common.items;

import net.minecraft.world.item.Item;
import xyz.rinsenpai.hololivegachahell.HololiveGachaHell;

public class ItemBase extends Item {

	public ItemBase() {
		super(new Item.Properties()
				.tab(HololiveGachaHell.MAIN_MOD_TAB));
	}
}

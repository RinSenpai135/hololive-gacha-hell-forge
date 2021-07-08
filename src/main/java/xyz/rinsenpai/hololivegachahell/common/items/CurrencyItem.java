package xyz.rinsenpai.hololivegachahell.common.items;

import net.minecraft.item.Item;
import xyz.rinsenpai.hololivegachahell.HololiveGachaHell;

public class CurrencyItem extends Item {

	public CurrencyItem() {
		super(new Item.Properties()
				.tab(HololiveGachaHell.TOKEN_TAB));
	}
}

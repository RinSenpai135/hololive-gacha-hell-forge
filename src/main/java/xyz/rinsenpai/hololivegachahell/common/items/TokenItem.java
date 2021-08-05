package xyz.rinsenpai.hololivegachahell.common.items;

import net.minecraft.world.item.Item;
import xyz.rinsenpai.hololivegachahell.HololiveGachaHell;

public class TokenItem extends Item {

	public TokenItem() {
		super(new Item.Properties()
				.tab(HololiveGachaHell.TOKEN_TAB));
	}
}

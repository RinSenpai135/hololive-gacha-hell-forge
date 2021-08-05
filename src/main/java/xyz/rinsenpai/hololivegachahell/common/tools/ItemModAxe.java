package xyz.rinsenpai.hololivegachahell.common.tools;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import xyz.rinsenpai.hololivegachahell.HololiveGachaHell;

public class ItemModAxe extends AxeItem {

	public ItemModAxe(Tier material, int attackDamage, float attackSpeed) {
		super(material, attackDamage, attackSpeed, new Item.Properties()
				.tab(HololiveGachaHell.MAIN_MOD_TAB));
	}

}

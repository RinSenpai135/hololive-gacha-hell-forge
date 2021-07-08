package xyz.rinsenpai.hololivegachahell.common.tools;

import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import xyz.rinsenpai.hololivegachahell.HololiveGachaHell;

public class ItemModHoe extends HoeItem {

	public ItemModHoe(IItemTier material, int attackDamage, float attackSpeed) {
		super(material, attackDamage, attackSpeed, new Item.Properties()
				.tab(HololiveGachaHell.MAIN_MOD_TAB));
	}

}

package xyz.rinsenpai.hololivegachahell.common.tools;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import xyz.rinsenpai.hololivegachahell.HololiveGachaHell;

public class ItemModSword extends SwordItem {

	public ItemModSword(IItemTier material, int attackDamage, float attackSpeed) {
		super(material, attackDamage, attackSpeed, new Item.Properties()
				.tab(HololiveGachaHell.MAIN_MOD_TAB));
	}

}

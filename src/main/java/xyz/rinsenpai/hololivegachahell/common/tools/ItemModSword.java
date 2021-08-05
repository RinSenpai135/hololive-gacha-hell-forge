package xyz.rinsenpai.hololivegachahell.common.tools;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import xyz.rinsenpai.hololivegachahell.HololiveGachaHell;

public class ItemModSword extends SwordItem {

	public ItemModSword(Tier material, int attackDamage, float attackSpeed) {
		super(material, attackDamage, attackSpeed, new Item.Properties()
				.tab(HololiveGachaHell.MAIN_MOD_TAB));
	}

}

package xyz.rinsenpai.hololivegachahell.common.tools;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import xyz.rinsenpai.hololivegachahell.HololiveGachaHell;

public class ItemModShovel extends ShovelItem {

	public ItemModShovel(Tier material, int attackDamage, float attackSpeed) {
		super(material, attackDamage, attackSpeed, new Item.Properties()
				.tab(HololiveGachaHell.MAIN_MOD_TAB));
	}

}

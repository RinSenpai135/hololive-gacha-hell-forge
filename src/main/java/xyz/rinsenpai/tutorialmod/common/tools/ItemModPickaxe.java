package xyz.rinsenpai.tutorialmod.common.tools;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import xyz.rinsenpai.tutorialmod.TutorialMod;

public class ItemModPickaxe extends PickaxeItem {

	public ItemModPickaxe(IItemTier material, int attackDamage, float attackSpeed) {
		super(material, attackDamage, attackSpeed, new Item.Properties()
				.tab(TutorialMod.MAIN_MOD_TAB));
	}

}

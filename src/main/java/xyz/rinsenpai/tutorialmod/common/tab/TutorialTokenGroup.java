package xyz.rinsenpai.tutorialmod.common.tab;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import xyz.rinsenpai.tutorialmod.core.init.ItemInit;

public class TutorialTokenGroup extends ItemGroup {

	public TutorialTokenGroup(String label) {
		super(label);
	}

	@Override
	public ItemStack makeIcon() {
		return ItemInit.REROLL_COIN.get().getDefaultInstance();
	}
}

package xyz.rinsenpai.hololivegachahell.common.tab;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import xyz.rinsenpai.hololivegachahell.core.init.ItemInit;

public class HghTokenGroup extends CreativeModeTab {

	public HghTokenGroup(String label) {
		super(label);
	}

	@Override
	public ItemStack makeIcon() {
		return ItemInit.REROLL_COIN.get().getDefaultInstance();
	}
}

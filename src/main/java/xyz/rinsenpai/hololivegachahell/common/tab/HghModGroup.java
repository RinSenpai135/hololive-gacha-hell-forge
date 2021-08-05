package xyz.rinsenpai.hololivegachahell.common.tab;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import xyz.rinsenpai.hololivegachahell.core.init.ItemInit;

public class HghModGroup extends CreativeModeTab {

	public HghModGroup(String label) {
		super(label);
	}

	@Override
	public ItemStack makeIcon() {
		return ItemInit.MYSTIC_ORB.get().getDefaultInstance();
	}
}

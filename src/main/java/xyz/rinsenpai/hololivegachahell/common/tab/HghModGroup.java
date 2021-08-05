package xyz.rinsenpai.hololivegachahell.common.tab;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import xyz.rinsenpai.hololivegachahell.core.init.ItemInit;

public class HghModGroup extends ItemGroup {

	public HghModGroup(String label) {
		super(label);
	}

	@Override
	public ItemStack makeIcon() {
		return ItemInit.MYSTIC_ORB.get().getDefaultInstance();
	}
}

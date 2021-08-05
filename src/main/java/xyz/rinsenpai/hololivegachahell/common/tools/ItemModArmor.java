package xyz.rinsenpai.hololivegachahell.common.tools;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import xyz.rinsenpai.hololivegachahell.HololiveGachaHell;

public class ItemModArmor extends ArmorItem {

	public ItemModArmor(ArmorMaterial material, EquipmentSlot equipmentSlot) {
		super(material, equipmentSlot, new Item.Properties()
				.tab(HololiveGachaHell.MAIN_MOD_TAB));
	}
}

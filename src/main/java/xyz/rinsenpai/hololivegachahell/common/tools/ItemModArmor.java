package xyz.rinsenpai.hololivegachahell.common.tools;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import xyz.rinsenpai.hololivegachahell.HololiveGachaHell;

public class ItemModArmor extends ArmorItem {

	public ItemModArmor(IArmorMaterial material, EquipmentSlotType equipmentSlot) {
		super(material, equipmentSlot, new Item.Properties()
				.tab(HololiveGachaHell.MAIN_MOD_TAB));
	}
}

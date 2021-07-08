package xyz.rinsenpai.tutorialmod.common.tools;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import xyz.rinsenpai.tutorialmod.TutorialMod;

public class ItemModArmor extends ArmorItem {

	public ItemModArmor(IArmorMaterial material, EquipmentSlotType equipmentSlot) {
		super(material, equipmentSlot, new Item.Properties()
				.tab(TutorialMod.MAIN_MOD_TAB));
	}
}

package xyz.rinsenpai.hololivegachahell.core.enums;

import java.util.function.Supplier;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import xyz.rinsenpai.hololivegachahell.core.init.ItemInit;

public enum ModArmorTier implements ArmorMaterial {
	
	TITANIUM("tutorial:titanium", 22, new int[]{3, 6, 6, 2}, 12, SoundEvents.ARMOR_EQUIP_IRON, 1.0f, 0.0f, () -> { return Ingredient.of(ItemInit.TITANIUM_INGOT.get());});
	
	private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
   	private final String name;
   	private final int durabilityMultiplier;
   	private final int[] slotProtections;
   	private final int enchantmentValue;
   	private final SoundEvent sound;
   	private final float toughness;
   	private final float knockbackResistance;
   	private final LazyLoadedValue<Ingredient> repairIngredient;

   	private ModArmorTier(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
   		this.name = name;
   		this.durabilityMultiplier = durabilityMultiplier;
   		this.slotProtections = slotProtections;
   		this.enchantmentValue = enchantmentValue;
   		this.sound = sound;
   		this.toughness = toughness;
   		this.knockbackResistance = knockbackResistance;
   		this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
   	}

	@Override
	public int getDurabilityForSlot(EquipmentSlot slotType) { return HEALTH_PER_SLOT[slotType.getIndex()] * this.durabilityMultiplier; }

	@Override
	public int getDefenseForSlot(EquipmentSlot slotType) { return this.slotProtections[slotType.getIndex()]; }

	@Override
	public int getEnchantmentValue() { return this.enchantmentValue; }

	@Override
	public SoundEvent getEquipSound() {	return this.sound; }

	@Override
	public Ingredient getRepairIngredient() { return this.repairIngredient.get(); }

	@Override
	public String getName() { return this.name; }

	@Override
	public float getToughness() { return this.toughness; }

	@Override
	public float getKnockbackResistance() {	return this.knockbackResistance; }

}

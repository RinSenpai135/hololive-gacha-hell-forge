package xyz.rinsenpai.tutorialmod.core.init;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.rinsenpai.tutorialmod.TutorialMod;
import xyz.rinsenpai.tutorialmod.common.items.CurrencyItem;
import xyz.rinsenpai.tutorialmod.common.items.ItemBase;
import xyz.rinsenpai.tutorialmod.common.items.TokenItem;
import xyz.rinsenpai.tutorialmod.common.tools.ItemModArmor;
import xyz.rinsenpai.tutorialmod.common.tools.ItemModAxe;
import xyz.rinsenpai.tutorialmod.common.tools.ItemModHoe;
import xyz.rinsenpai.tutorialmod.common.tools.ItemModPickaxe;
import xyz.rinsenpai.tutorialmod.common.tools.ItemModShovel;
import xyz.rinsenpai.tutorialmod.common.tools.ItemModSword;
import xyz.rinsenpai.tutorialmod.core.enums.ModArmorTier;
import xyz.rinsenpai.tutorialmod.core.enums.ModToolTier;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);
	
	// NORMAL ITEMS
	public static final RegistryObject<Item> TITANIUM_SHARD = ITEMS.register("titanium_shard", () -> new ItemBase());
	public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", () -> new ItemBase());
	public static final RegistryObject<Item> MYSTIC_SHARD = ITEMS.register("mystic_shard", () -> new ItemBase());

	// GACHA HELL
	public static final RegistryObject<Item> MYSTIC_ORB = ITEMS.register("mystic_orb", () -> new CurrencyItem());
	public static final RegistryObject<Item> REROLL_COIN = ITEMS.register("reroll_coin", () -> new CurrencyItem());
	
	public static final RegistryObject<Item> TOKEN_SORA = ITEMS.register("token_sora", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_MIKO = ITEMS.register("token_miko", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_SUISEI = ITEMS.register("token_suisei", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_ROBOCO = ITEMS.register("token_roboco", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_AZKI = ITEMS.register("token_azki", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_FUBUKI = ITEMS.register("token_fubuki", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_AKI = ITEMS.register("token_aki", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_MEL = ITEMS.register("token_mel", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_MATSURI = ITEMS.register("token_matsuri", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_HAACHAMA = ITEMS.register("token_haachama", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_SHION = ITEMS.register("token_shion", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_AQUA = ITEMS.register("token_aqua", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_CHOCO = ITEMS.register("token_choco", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_SUBARU = ITEMS.register("token_subaru", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_AYAME = ITEMS.register("token_ayame", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_MIO = ITEMS.register("token_mio", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_OKAYU = ITEMS.register("token_okayu", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_KORONE = ITEMS.register("token_korone", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_RUSHIA = ITEMS.register("token_rushia", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_NOEL = ITEMS.register("token_noel", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_FLARE = ITEMS.register("token_flare", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_PEKORA = ITEMS.register("token_pekora", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_MARINE = ITEMS.register("token_marine", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_KANATA = ITEMS.register("token_kanata", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_COCO = ITEMS.register("token_coco", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_TOWA = ITEMS.register("token_towa", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_LUNA = ITEMS.register("token_luna", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_WATAME = ITEMS.register("token_watame", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_LAMY = ITEMS.register("token_lamy", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_NENE = ITEMS.register("token_nene", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_BOTAN = ITEMS.register("token_botan", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_POLKA = ITEMS.register("token_polka", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_IOFI = ITEMS.register("token_iofi", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_MOONA = ITEMS.register("token_moona", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_RISU = ITEMS.register("token_risu", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_OLLIE = ITEMS.register("token_ollie", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_ANYA = ITEMS.register("token_anya", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_REINE = ITEMS.register("token_reine", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_INA = ITEMS.register("token_ina", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_CALLIOPE = ITEMS.register("token_calliope", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_AMELIA = ITEMS.register("token_amelia", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_KIARA = ITEMS.register("token_kiara", () -> new TokenItem());
	public static final RegistryObject<Item> TOKEN_GURA = ITEMS.register("token_gura", () -> new TokenItem());
	//public static final RegistryObject<Item> TOKEN_EXAMPLE = ITEMS.register("token_example", () -> new TokenItem());

	public static final RegistryObject<Item> FIRST_GEN_ITEM = ITEMS.register("first_gen_group", () -> new ItemBase());
	public static final RegistryObject<Item> SECOND_GEN_ITEM = ITEMS.register("second_gen_group", () -> new ItemBase());
	public static final RegistryObject<Item> THIRD_GEN_ITEM = ITEMS.register("hololive_fantasy_group", () -> new ItemBase());
	public static final RegistryObject<Item> FOURTH_GEN_ITEM = ITEMS.register("fourth_gen_group", () -> new ItemBase());
	public static final RegistryObject<Item> FIFTH_GEN_ITEM = ITEMS.register("fifth_gen_group", () -> new ItemBase());
	public static final RegistryObject<Item> GAMER_GEN_ITEM = ITEMS.register("gamers_group", () -> new ItemBase());
	public static final RegistryObject<Item> ID1_GEN_ITEM = ITEMS.register("indonesia_gen_one_group", () -> new ItemBase());
	public static final RegistryObject<Item> ID2_GEN_ITEM = ITEMS.register("indonesia_gen_two_group", () -> new ItemBase());
	public static final RegistryObject<Item> ENGLISH_GEN_ITEM = ITEMS.register("myth_group", () -> new ItemBase());
	
	// BLOCK ITEMS
	public static final RegistryObject<BlockItem> MYSTIC_SHARD_ORE_ITEM = ITEMS.register("mystic_shard_ore",
			() -> new BlockItem(BlockInit.MYSTIC_SHARD_ORE.get(), new Item.Properties().tab(TutorialMod.MAIN_MOD_TAB)));
	public static final RegistryObject<BlockItem> TITANIUM_ORE_ITEM = ITEMS.register("titanium_ore",
			() -> new BlockItem(BlockInit.TITANIUM_ORE.get(), new Item.Properties().tab(TutorialMod.MAIN_MOD_TAB)));
	public static final RegistryObject<BlockItem> TITANIUM_BLOCK_ITEM = ITEMS.register("titanium_block",
			() -> new BlockItem(BlockInit.TITANIUM_BLOCK.get(), new Item.Properties().tab(TutorialMod.MAIN_MOD_TAB)));
	public static final RegistryObject<BlockItem> GACHA_BLOCK_ITEM = ITEMS.register("gacha_block",
			() -> new BlockItem(BlockInit.GACHA_BLOCK.get(), new Item.Properties().tab(TutorialMod.MAIN_MOD_TAB)));
	
	// TOOLS
	public static final RegistryObject<PickaxeItem> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
			() -> new ItemModPickaxe(ModToolTier.TITANIUM, 1, -3.0f));
	public static final RegistryObject<AxeItem> TITANIUM_AXE = ITEMS.register("titanium_axe",
			() -> new ItemModAxe(ModToolTier.TITANIUM, 5, -3.0f));
	public static final RegistryObject<SwordItem> TITANIUM_SWORD = ITEMS.register("titanium_sword",
			() -> new ItemModSword(ModToolTier.TITANIUM, 3, -2.4f));
	public static final RegistryObject<ShovelItem> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel",
			() -> new ItemModShovel(ModToolTier.TITANIUM, 0, -2.4f));
	public static final RegistryObject<HoeItem> TITANIUM_HOE = ITEMS.register("titanium_hoe",
			() -> new ItemModHoe(ModToolTier.TITANIUM, -2, 0.0f));
	
	// REGISTERING ARMORS
	public static final RegistryObject<ArmorItem> TITANIUM_HELMET = ITEMS.register("titanium_helmet", 
			() -> new ItemModArmor(ModArmorTier.TITANIUM, EquipmentSlotType.HEAD));
	public static final RegistryObject<ArmorItem> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate", 
			() -> new ItemModArmor(ModArmorTier.TITANIUM, EquipmentSlotType.CHEST));
	public static final RegistryObject<ArmorItem> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings", 
			() -> new ItemModArmor(ModArmorTier.TITANIUM, EquipmentSlotType.LEGS));
	public static final RegistryObject<ArmorItem> TITANIUM_BOOTS = ITEMS.register("titanium_boots", 
			() -> new ItemModArmor(ModArmorTier.TITANIUM, EquipmentSlotType.FEET));

}

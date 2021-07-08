package xyz.rinsenpai.hololivegachahell.core.init;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.rinsenpai.hololivegachahell.HololiveGachaHell;
import xyz.rinsenpai.hololivegachahell.common.blocks.GachaBlock;
import xyz.rinsenpai.hololivegachahell.common.blocks.MetalBlockBase;
import xyz.rinsenpai.hololivegachahell.common.blocks.MysticShardOre;
import xyz.rinsenpai.hololivegachahell.common.blocks.TitaniumOre;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, HololiveGachaHell.MOD_ID);
	
	// REGISTERING BLOCKS
	public static final RegistryObject<Block> TITANIUM_ORE = BLOCKS.register("titanium_ore", () -> new TitaniumOre());
	public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block", () -> new MetalBlockBase());
	public static final RegistryObject<Block> MYSTIC_SHARD_ORE = BLOCKS.register("mystic_shard_ore", () -> new MysticShardOre());
	public static final RegistryObject<Block> GACHA_BLOCK = BLOCKS.register("gacha_block", () -> new GachaBlock());

}

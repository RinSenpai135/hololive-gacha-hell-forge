package xyz.rinsenpai.hololivegachahell.core.init;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.rinsenpai.hololivegachahell.HololiveGachaHell;

public class TileEntityTypeInit {
	
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, HololiveGachaHell.MOD_ID);

}

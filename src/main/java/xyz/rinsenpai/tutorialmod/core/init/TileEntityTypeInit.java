package xyz.rinsenpai.tutorialmod.core.init;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.rinsenpai.tutorialmod.TutorialMod;

public class TileEntityTypeInit {
	
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, TutorialMod.MOD_ID);

}

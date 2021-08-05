package xyz.rinsenpai.hololivegachahell.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class StoneTierOre extends Block {

	public StoneTierOre() {
		super(Block.Properties
				.of(Material.STONE)
				.strength(2.0f, 3.0f)
				.harvestTool(ToolType.PICKAXE)
				.harvestLevel(1)
				.sound(SoundType.STONE)
				.requiresCorrectToolForDrops()
		);
	}

}

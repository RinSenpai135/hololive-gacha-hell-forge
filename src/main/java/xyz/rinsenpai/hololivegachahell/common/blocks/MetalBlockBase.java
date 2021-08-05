package xyz.rinsenpai.hololivegachahell.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MetalBlockBase extends Block {

	public MetalBlockBase() {
		super(Block.Properties
				.of(Material.METAL)
				.strength(3.5f, 4.0f)
				.harvestTool(ToolType.PICKAXE)
				.harvestLevel(2)
				.sound(SoundType.METAL)
				.requiresCorrectToolForDrops()
		);
	}
}

package xyz.rinsenpai.hololivegachahell.common.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
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

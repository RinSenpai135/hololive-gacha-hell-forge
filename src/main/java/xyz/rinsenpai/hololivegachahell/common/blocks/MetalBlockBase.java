package xyz.rinsenpai.hololivegachahell.common.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class MetalBlockBase extends Block {

	public MetalBlockBase() {
		super(Block.Properties
				.of(Material.METAL)
				.strength(3.5f, 4.0f)
				.harvestTool(net.minecraftforge.common.ToolType.PICKAXE)
				.harvestLevel(2)
				.destroyTime(1.0f)
				.sound(SoundType.METAL)
				.requiresCorrectToolForDrops()
		);
	}
}

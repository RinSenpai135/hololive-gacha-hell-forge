package xyz.rinsenpai.hololivegachahell.common.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
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

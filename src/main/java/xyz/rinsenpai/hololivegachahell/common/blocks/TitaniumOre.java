package xyz.rinsenpai.hololivegachahell.common.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.ToolType;

public class TitaniumOre extends Block {

	public TitaniumOre() {
		super(Block.Properties
				.of(Material.STONE)
				.strength(3.0f, 3.5f)
				.harvestTool(ToolType.PICKAXE)
				.harvestLevel(2)
				.sound(SoundType.STONE)
				.requiresCorrectToolForDrops()
		);
	}
}

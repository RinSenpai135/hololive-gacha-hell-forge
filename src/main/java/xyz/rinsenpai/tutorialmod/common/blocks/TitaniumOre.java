package xyz.rinsenpai.tutorialmod.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
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

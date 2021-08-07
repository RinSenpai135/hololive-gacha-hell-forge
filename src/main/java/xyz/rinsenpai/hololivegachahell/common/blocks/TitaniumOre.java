package xyz.rinsenpai.hololivegachahell.common.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class TitaniumOre extends Block {

	public TitaniumOre() {
		super(BlockBehaviour.Properties
				.of(Material.STONE)
				.strength(3.0f, 3.5f)
				.harvestTool(net.minecraftforge.common.ToolType.PICKAXE)
				.harvestLevel(2)
				.destroyTime(1.0f)
				.sound(SoundType.STONE)
				.requiresCorrectToolForDrops()
		);
	}
}

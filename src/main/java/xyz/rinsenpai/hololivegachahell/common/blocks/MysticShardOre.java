package xyz.rinsenpai.hololivegachahell.common.blocks;

import java.util.Random;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.util.Mth;
import net.minecraftforge.common.ToolType;

public class MysticShardOre extends OreBlock {

	public MysticShardOre() {
		super(Block.Properties
				.of(Material.STONE)
				.strength(2.0f, 3.0f)
				.harvestTool(ToolType.PICKAXE)
				.harvestLevel(1)
				.sound(SoundType.STONE)
				.requiresCorrectToolForDrops()
		);
	}
	
	public int xpOnDrop(Random random) {
		return Mth.nextInt(random, 3, 7);
	}

}

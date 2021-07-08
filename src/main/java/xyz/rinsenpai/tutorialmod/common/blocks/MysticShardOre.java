package xyz.rinsenpai.tutorialmod.common.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.MathHelper;
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
		return MathHelper.nextInt(random, 3, 7);
	}

}

package xyz.rinsenpai.hololivegachahell.common.blocks;

import java.util.Random;

import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.util.Mth;

public class MysticShardOre extends OreBlock {

	public MysticShardOre() {
		super(BlockBehaviour.Properties
				.of(Material.STONE)
				.strength(2.0f, 3.0f)
				.harvestTool(net.minecraftforge.common.ToolType.PICKAXE)
				.harvestLevel(2)
				.destroyTime(1.0f)
				.sound(SoundType.STONE)
				.requiresCorrectToolForDrops()
		);
	}
	
	public int xpOnDrop(Random random) {
		return Mth.nextInt(random, 3, 7);
	}

}

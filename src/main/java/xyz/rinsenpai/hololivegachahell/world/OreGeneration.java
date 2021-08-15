package xyz.rinsenpai.hololivegachahell.world;

import net.minecraft.world.level.block.state.BlockState;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import xyz.rinsenpai.hololivegachahell.core.init.BlockInit;

public class OreGeneration {

	public static void generateOres(final BiomeLoadingEvent event) {
		if(!((event.getCategory().equals(Biome.BiomeCategory.THEEND)) || (event.getCategory().equals(Biome.BiomeCategory.NETHER)))) {
			generateOre(event.getGeneration(), OreConfiguration.Predicates.NATURAL_STONE, BlockInit.MYSTIC_SHARD_ORE.get().defaultBlockState(), 4, 5, 16, 4);
			generateOre(event.getGeneration(), OreConfiguration.Predicates.NATURAL_STONE, BlockInit.TITANIUM_ORE.get().defaultBlockState(), 8, 5, 24, 8);
		}
		
		if(event.getCategory().equals(Biome.BiomeCategory.NETHER)) {
			
		}
		
		if(event.getCategory().equals(Biome.BiomeCategory.THEEND)) {
			
		}
	}
	
	private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int maxHeight, int perChunk) {
		settings.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, 
				Feature.ORE.configured(new OreConfiguration(fillerType, state, veinSize)).rangeUniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(maxHeight))
				.squared().count(perChunk));
	}
}

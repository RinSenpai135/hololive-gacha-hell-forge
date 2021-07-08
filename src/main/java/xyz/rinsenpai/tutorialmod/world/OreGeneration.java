package xyz.rinsenpai.tutorialmod.world;

import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import xyz.rinsenpai.tutorialmod.core.init.BlockInit;

public class OreGeneration {

	public static void generateOres(final BiomeLoadingEvent event) {
		if(!((event.getCategory().equals(Biome.Category.THEEND)) || (event.getCategory().equals(Biome.Category.NETHER)))) {
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.MYSTIC_SHARD_ORE.get().defaultBlockState(), 4, 1, 20, 10);
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.TITANIUM_ORE.get().defaultBlockState(), 4, 1, 24, 14);
		}
		
		if(event.getCategory().equals(Biome.Category.NETHER)) {
			
		}
		
		if(event.getCategory().equals(Biome.Category.THEEND)) {
			
		}
	}
	
	private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int maxHeight, int perChunk) {
		settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
				Feature.ORE.configured(new OreFeatureConfig(fillerType, state, veinSize))
				.decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
				.squared().count(perChunk));
	}
}

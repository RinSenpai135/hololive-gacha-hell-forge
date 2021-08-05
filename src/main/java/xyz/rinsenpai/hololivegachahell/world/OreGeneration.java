package xyz.rinsenpai.hololivegachahell.world;

import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.WorldGenerationContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.placement.FeatureDecorator;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.heightproviders.HeightProvider;
import net.minecraft.world.level.levelgen.heightproviders.HeightProviderType;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import xyz.rinsenpai.hololivegachahell.core.init.BlockInit;

public class OreGeneration {

	public static void generateOres(final BiomeLoadingEvent event) {
		if(!((event.getCategory().equals(Biome.BiomeCategory.THEEND)) || (event.getCategory().equals(Biome.BiomeCategory.NETHER)))) {
			generateOre(event.getGeneration(), OreConfiguration.Predicates.NATURAL_STONE, BlockInit.MYSTIC_SHARD_ORE.get().defaultBlockState(), 4, 1, 20, 10);
			generateOre(event.getGeneration(), OreConfiguration.Predicates.NATURAL_STONE, BlockInit.TITANIUM_ORE.get().defaultBlockState(), 4, 1, 24, 14);
		}
		
		if(event.getCategory().equals(Biome.BiomeCategory.NETHER)) {
			
		}
		
		if(event.getCategory().equals(Biome.BiomeCategory.THEEND)) {
			
		}
	}
	
	private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int maxHeight, int perChunk) {
		settings.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, 
				Feature.ORE.configured(new OreConfiguration(fillerType, state, veinSize))
				.decorated(FeatureDecorator.RANGE.configured(new RangeDecoratorConfiguration(new HeightProvider() {
					
					@Override
					public int sample(Random arg0, WorldGenerationContext arg1) {
						return 0;
					}
					
					@Override
					public HeightProviderType<?> getType() {
						// TODO Auto-generated method stub
						return null;
					}
				})))
				.squared().count(perChunk));
	}
}

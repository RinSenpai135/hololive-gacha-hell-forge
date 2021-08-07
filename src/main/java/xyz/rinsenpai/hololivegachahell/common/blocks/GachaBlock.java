package xyz.rinsenpai.hololivegachahell.common.blocks;

import java.util.ArrayList;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.rinsenpai.hololivegachahell.common.items.CurrencyItem;
import xyz.rinsenpai.hololivegachahell.common.items.TokenItem;

public class GachaBlock extends Block {
	
	public GachaBlock() {
		super(Block.Properties
				.of(Material.METAL)
				.strength(2.5f, 3.5f)
				.harvestTool(ToolType.PICKAXE)
				.harvestLevel(1)
				.destroyTime(1.0f)
				.sound(SoundType.METAL)
				.requiresCorrectToolForDrops()
		);
	}

	public static ArrayList<TokenItem> gachaRewardList() {
		ArrayList<TokenItem> gachaList = new ArrayList<TokenItem>();
		for(Item item : ForgeRegistries.ITEMS) {
			if(item instanceof TokenItem) {
				gachaList.add((TokenItem) item);
			}
		}
		return gachaList;
	}
	
	public static ArrayList<CurrencyItem> gachaCurrencyList() {
		ArrayList<CurrencyItem> currencyList = new ArrayList<CurrencyItem>();
		for(Item item : ForgeRegistries.ITEMS) {
			if(item instanceof CurrencyItem) {
				currencyList.add((CurrencyItem) item);
			}
		}
		return currencyList;
	}
	
	public static Item randomGachaReward(ArrayList<TokenItem> list) {
		int listObjectCount = list.size();
		double randomValue = (Math.random()*listObjectCount);
		int finalValue = Integer.valueOf((int) Math.round(randomValue));
		if(finalValue >= listObjectCount) {
			finalValue = listObjectCount-1;
		}
		//TutorialMod.LOGGER.info("Size: "+listObjectCount+" | Randomizer: "+finalValue+" | Result: "+list.get(finalValue));
		return list.get(finalValue).asItem();
	}
	
	public static void giveItem(Player player, Item item) {
		player.getInventory().add(new ItemStack(item));
	}
}

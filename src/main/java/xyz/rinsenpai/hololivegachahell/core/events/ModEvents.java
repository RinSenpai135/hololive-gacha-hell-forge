package xyz.rinsenpai.hololivegachahell.core.events;

import java.util.ArrayList;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.entity.passive.RabbitEntity;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteractSpecific;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import xyz.rinsenpai.hololivegachahell.common.blocks.GachaBlock;
import xyz.rinsenpai.hololivegachahell.common.items.CurrencyItem;
import xyz.rinsenpai.hololivegachahell.common.items.TokenItem;
import xyz.rinsenpai.hololivegachahell.core.init.BlockInit;
import xyz.rinsenpai.hololivegachahell.core.init.ItemInit;

@EventBusSubscriber(value = Dist.DEDICATED_SERVER, modid = "hololivegachahell")
public class ModEvents {

	@SubscribeEvent
	public static void onGachaBlockRightClick(PlayerInteractEvent.RightClickBlock event) {
		Hand hand = event.getHand();
		PlayerEntity player = event.getPlayer();
		ItemStack itemstack = player.getItemInHand(hand);
		World world = event.getWorld();
		BlockPos pos = event.getPos();
		BlockState state = world.getBlockState(pos);
		ArrayList<TokenItem> rewardList = GachaBlock.gachaRewardList();
		ArrayList<CurrencyItem> currencyList = GachaBlock.gachaCurrencyList();
		//TutorialMod.LOGGER.info(GachaBlock.gachaCurrencyList());
		//TutorialMod.LOGGER.info(GachaBlock.gachaRewardList());
		if(currencyList.contains(itemstack.getItem())) {
			if(state == BlockInit.GACHA_BLOCK.get().defaultBlockState()) {
				if(!world.isClientSide) {
					Item reward = GachaBlock.randomGachaReward(rewardList);
					if(player.inventory.getFreeSlot() == -1) {
						player.drop(reward.getDefaultInstance(), false);
					}
					else {
						GachaBlock.giveItem(player, reward);
					}
					if(!player.abilities.instabuild) {
						itemstack.shrink(1);
					}
				}
			}
		}
	}
	
	@SubscribeEvent
	public static void useTokenOnEntities(EntityInteractSpecific event) {
		Hand hand = event.getHand();
		PlayerEntity player = event.getPlayer();
		ItemStack itemstack = player.getItemInHand(hand);
		Entity target = event.getTarget();
		World world = event.getWorld();
		if(!world.isClientSide) {
			if(itemstack.getItem() == ItemInit.TOKEN_GURA.get()) {
				if(player.isInWaterOrRain()) {
					player.playSound(new SoundEvent(new ResourceLocation("hololivegachahell","gura")), 1.0f, 1.0f);
				}
			}
			if(itemstack.getItem() == ItemInit.TOKEN_KORONE.get()) {
				if(target instanceof WolfEntity && target.isAlliedTo(player)) {
					target.playSound(new SoundEvent(new ResourceLocation("hololivegachahell","korone")), 1.0f, 1.0f);
				}
			}
			if(itemstack.getItem() == ItemInit.TOKEN_MIO.get()) {
				if(target instanceof WolfEntity) {
					target.playSound(new SoundEvent(new ResourceLocation("hololivegachahell","mio")), 1.0f, 1.0f);
				}
			}
			if(itemstack.getItem() == ItemInit.TOKEN_SUBARU.get()) {
				if(target instanceof ChickenEntity) {
					target.playSound(new SoundEvent(new ResourceLocation("hololivegachahell","subaru")), 1.0f, 1.0f);
				}
			}
			if(itemstack.getItem() == ItemInit.TOKEN_KIARA.get()) {
				target.playSound(new SoundEvent(new ResourceLocation("hololivegachahell","kiara")), 1.0f, 1.0f);
			}
			if(itemstack.getItem() == ItemInit.TOKEN_MATSURI.get()) {
				player.playSound(new SoundEvent(new ResourceLocation("hololivegachahell","matsuri")), 1.0f, 1.0f);
			}
			if(itemstack.getItem() == ItemInit.TOKEN_MARINE.get()) {
				player.playSound(new SoundEvent(new ResourceLocation("hololivegachahell","marine")), 1.0f, 1.0f);
			}
			if(itemstack.getItem() == ItemInit.TOKEN_OKAYU.get()) {
				if(target instanceof CatEntity) {
					target.playSound(new SoundEvent(new ResourceLocation("hololivegachahell","okayu")), 1.0f, 1.0f);
				}
			}
			if(itemstack.getItem() == ItemInit.TOKEN_PEKORA.get()) {
				if(target instanceof RabbitEntity) {
					target.playSound(new SoundEvent(new ResourceLocation("hololivegachahell","pekora")), 1.0f, 1.0f);
				}
			}
			if(itemstack.getItem() == ItemInit.TOKEN_INA.get()) {
				if(target instanceof SquidEntity) {
					target.playSound(new SoundEvent(new ResourceLocation("hololivegachahell","ina")), 1.0f, 1.0f);
				}
			}
			if(itemstack.getItem() == ItemInit.TOKEN_FUBUKI.get()) {
				if(target instanceof FoxEntity) {
					target.playSound(new SoundEvent(new ResourceLocation("hololivegachahell","fubuki")), 1.0f, 1.0f);
				}
			}
		}
	}
}

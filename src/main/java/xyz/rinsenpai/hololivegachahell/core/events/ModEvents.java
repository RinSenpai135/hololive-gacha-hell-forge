package xyz.rinsenpai.hololivegachahell.core.events;

import java.util.ArrayList;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.entity.animal.Rabbit;
import net.minecraft.world.entity.animal.Squid;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.InteractionHand;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteractSpecific;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import xyz.rinsenpai.hololivegachahell.HololiveGachaHell;
import xyz.rinsenpai.hololivegachahell.common.blocks.GachaBlock;
import xyz.rinsenpai.hololivegachahell.common.items.CurrencyItem;
import xyz.rinsenpai.hololivegachahell.common.items.TokenItem;
import xyz.rinsenpai.hololivegachahell.core.init.BlockInit;
import xyz.rinsenpai.hololivegachahell.core.init.ItemInit;

@EventBusSubscriber(value = Dist.DEDICATED_SERVER, modid = HololiveGachaHell.MOD_ID)
public class ModEvents {

	@SubscribeEvent
	public static void onGachaBlockRightClick(PlayerInteractEvent.RightClickBlock event) {
		InteractionHand hand = event.getHand();
		Player player = event.getPlayer();
		ItemStack itemstack = player.getItemInHand(hand);
		Level world = event.getWorld();
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
					if(player.getInventory().getFreeSlot() == -1) {
						player.drop(reward.getDefaultInstance(), false);
					}
					else {
						GachaBlock.giveItem(player, reward);
					}
					if(!player.getAbilities().instabuild) {
						itemstack.shrink(1);
					}
				}
			}
		}
	}
	
	@SubscribeEvent
	public static void useTokenOnEntities(EntityInteractSpecific event) {
		InteractionHand hand = event.getHand();
		Player player = event.getPlayer();
		ItemStack itemstack = player.getItemInHand(hand);
		Entity target = event.getTarget();
		Level world = event.getWorld();
		if(!world.isClientSide) {
			if(itemstack.getItem() == ItemInit.TOKEN_GURA.get()) {
				if(player.isInWaterOrRain()) {
					player.playSound(new SoundEvent(new ResourceLocation("hololivegachahell","gura")), 1.0f, 1.0f);
				}
			}
			if(itemstack.getItem() == ItemInit.TOKEN_KORONE.get()) {
				if(target instanceof Wolf && target.isAlliedTo(player)) {
					target.playSound(new SoundEvent(new ResourceLocation("hololivegachahell","korone")), 1.0f, 1.0f);
				}
			}
			if(itemstack.getItem() == ItemInit.TOKEN_MIO.get()) {
				if(target instanceof Wolf) {
					target.playSound(new SoundEvent(new ResourceLocation("hololivegachahell","mio")), 1.0f, 1.0f);
				}
			}
			if(itemstack.getItem() == ItemInit.TOKEN_SUBARU.get()) {
				if(target instanceof Chicken) {
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
				if(target instanceof Cat) {
					target.playSound(new SoundEvent(new ResourceLocation("hololivegachahell","okayu")), 1.0f, 1.0f);
				}
			}
			if(itemstack.getItem() == ItemInit.TOKEN_PEKORA.get()) {
				if(target instanceof Rabbit) {
					target.playSound(new SoundEvent(new ResourceLocation("hololivegachahell","pekora")), 1.0f, 1.0f);
				}
			}
			if(itemstack.getItem() == ItemInit.TOKEN_INA.get()) {
				if(target instanceof Squid) {
					target.playSound(new SoundEvent(new ResourceLocation("hololivegachahell","ina")), 1.0f, 1.0f);
				}
			}
			if(itemstack.getItem() == ItemInit.TOKEN_FUBUKI.get()) {
				if(target instanceof Fox) {
					target.playSound(new SoundEvent(new ResourceLocation("hololivegachahell","fubuki")), 1.0f, 1.0f);
				}
			}
		}
	}
	
	@SubscribeEvent
	public void onEntityDeath(LivingDeathEvent event) {
		System.out.println("a");
		Entity entity = event.getEntity();
		Level world = entity.level;
		if(!world.isClientSide) {
			System.out.println("b");
			if(entity instanceof Cat) {
				System.out.println("c");
				ServerPlayer player = ((Cat) entity).getLoveCause();
				if(entity.getCustomName().toString() == "Nekonomicon" && entity.isAlliedTo(player)) {
					System.out.println("d");
					player.playSound(new SoundEvent(new ResourceLocation("hololivegachahell","ina")), 1.0f, 1.0f);
				}
			}
		}
	}
}

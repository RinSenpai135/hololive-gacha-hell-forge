package xyz.rinsenpai.hololivegachahell;

import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import xyz.rinsenpai.hololivegachahell.common.tab.TutorialGroup;
import xyz.rinsenpai.hololivegachahell.common.tab.TutorialTokenGroup;
import xyz.rinsenpai.hololivegachahell.core.events.ModEvents;
import xyz.rinsenpai.hololivegachahell.core.init.BlockInit;
import xyz.rinsenpai.hololivegachahell.core.init.ItemInit;
import xyz.rinsenpai.hololivegachahell.world.OreGeneration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("hololivegachahell")
public class HololiveGachaHell
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "tutorial";
    public static final ItemGroup MAIN_MOD_TAB = new TutorialGroup("tutorial");
    public static final ItemGroup TOKEN_TAB = new TutorialTokenGroup("tokens");

    public HololiveGachaHell() {
    	
        // Register the setup method for modloading
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(this::doClientStuff);
        
        // Register mod data
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        
        // Events
        MinecraftForge.EVENT_BUS.addListener(EventPriority.NORMAL, OreGeneration::generateOres);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.NORMAL, ModEvents::onGachaBlockRightClick);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.NORMAL, ModEvents::useTokenOnEntities);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().options);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        
    }
}

package com.sq3xd.brgb;

import com.mojang.logging.LogUtils;
import com.sq3xd.brgb.block.ModBlocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(BRGBMod.MOD_ID)
public class BRGBMod
{
    public static final String MOD_ID = "brgb";

    private static final Logger LOGGER = LogUtils.getLogger();

    public BRGBMod()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onServerStarted(ServerStartingEvent event) {
        LOGGER.info("Successfully started server with RGB Block mod!");
    }
}
package com.example.mymod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = MyMod.MOD_ID, name = "My Mod", version = "1.0.0")
public class MyMod {
    public static final String MOD_ID = "mymod";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        LOGGER.info("Hello from My Mod on 1.12.2!");
    }
}

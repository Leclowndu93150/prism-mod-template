package com.example.mymod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyMod {
    public static final String MOD_ID = "mymod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        LOGGER.info("Hello from My Mod!");
    }
}

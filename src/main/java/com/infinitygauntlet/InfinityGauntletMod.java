package com.infinitygauntlet;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InfinityGauntletMod implements ModInitializer {

    public static final String MOD_ID = "infinitygauntlet";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("[Infinity Gauntlet] Phase 1 loading: registering gauntlet + 6 stones...");
        ModItems.initialize();
        LOGGER.info("[Infinity Gauntlet] Phase 1 loaded successfully.");
    }
}

package com.mythicclient;

import net.fabricmc.api.ClientModInitializer;
import meteordevelopment.meteorclient.MeteorClient;
import com.mythicclient.performance.KryptonInitializer;

public class MythicClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        MeteorClient.FONT = "cyberpunk"; // use neon font
        KryptonInitializer.init();       // launch performance patch
        // Apply custom theme
        MeteorClient.getInstance().themeManager.load("cyberpunk");
    }
}

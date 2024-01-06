package com.unongmilk;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

public class Main extends JavaPlugin {
    HashMap<UUID, Ability> ability = new HashMap<>();
    @Override
    public void onEnable() {
        getLogger().info("Minecraft Ability War Enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("Minecraft Ability War Disabled");
    }
}

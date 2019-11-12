package me.lipsticks;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        this.getServer().getPluginManager().registerEvents(new BlockLog(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

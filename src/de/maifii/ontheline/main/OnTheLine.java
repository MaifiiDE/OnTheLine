package de.maifii.ontheline.main;

import de.maifii.ontheline.commands.TestCommand;
import de.maifii.ontheline.listeners.TimeListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class OnTheLine extends JavaPlugin {

    private static OnTheLine instance;

    @Override
    public void onEnable() {
        this.register();

        instance = this;
    }

    public void register() {
        PluginManager pluginManager = Bukkit.getPluginManager();


        getCommand("test").setExecutor(new TestCommand());
    }

    @Override
    public void onDisable() {
        
    }

    public static OnTheLine getInstance() {
        return instance;
    }
}

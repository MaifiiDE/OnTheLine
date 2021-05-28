package de.maifii.ontheline.main;

import de.maifii.ontheline.commands.TestCommand;
import de.maifii.ontheline.listeners.ProtectListener;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
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
        pluginManager.registerEvents((Listener)new ProtectListener(), (Plugin)this);

        getCommand("test").setExecutor(new TestCommand());
    }

    @Override
    public void onDisable() {
        
    }

    public static OnTheLine getInstance() {
        return instance;
    }
}

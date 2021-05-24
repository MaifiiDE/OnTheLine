package de.maifii.ontheline.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class TimeListener implements Listener {

    @EventHandler
    public void onTimeChange(WeatherChangeEvent event) {
        event.setCancelled(true);
    }
}

package dev.tobys.aqualand.Other;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class RemoveDeathMessage implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent e)
    {
        e.setDeathMessage(null);
    }

}

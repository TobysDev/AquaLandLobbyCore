package dev.tobys.aqualand.Join;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinMessage implements Listener {

    @EventHandler
    public void  onJoin(PlayerJoinEvent e) {

        Player player = e.getPlayer();

        if (player.hasPlayedBefore()){
            e.setJoinMessage(null);
        }else{
            e.setJoinMessage(null);
        }
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e){

        Player player = e.getPlayer();

        e.setQuitMessage(null);
    }


}

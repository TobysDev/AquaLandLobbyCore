package dev.tobys.aqualand.Chat;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PrefixOwner implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent e){
        if(e.getPlayer().getName().equals("Tobys__")){
            Player p = e.getPlayer();
            e.setFormat(ChatColor.GRAY + "[" + ChatColor.GREEN + "Developer" + ChatColor.GRAY + "] " + p.getDisplayName() + ChatColor.GRAY + ": " + ChatColor.WHITE + e.getMessage());
        }
    }
}


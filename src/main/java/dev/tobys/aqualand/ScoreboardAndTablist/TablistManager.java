package dev.tobys.aqualand.ScoreboardAndTablist;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class TablistManager implements Listener {

    public void setPlayerList(Player player) {

        player.setPlayerListHeader(ChatColor.AQUA + "AquaLand");
        player.setPlayerListFooter("Welcome" + "/n Server");
    }
}
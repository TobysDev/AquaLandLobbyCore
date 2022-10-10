package dev.tobys.aqualand.Join;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ChatWelcome implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent join) {

        Player player = join.getPlayer();

        player.sendMessage(ChatColor.WHITE + "            " + ChatColor.AQUA + ChatColor.BOLD + "" + "AquaLand" + ChatColor.WHITE + "            ");
        player.sendMessage(ChatColor.WHITE + "      Najlepší herni zážitok");
        player.sendMessage(ChatColor.WHITE + " Aktuálny počet hracou na serveri je" + ChatColor.AQUA + "" + Bukkit.getOnlinePlayers().size() + ChatColor.GRAY + "/" + ChatColor.AQUA + "" + Bukkit.getMaxPlayers());
    }
}
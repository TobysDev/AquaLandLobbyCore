package dev.tobys.aqualand.Command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Store implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equals("store")) {
            Player player = (Player)sender;
            player.sendMessage(ChatColor.YELLOW + "Store" + ChatColor.DARK_GRAY + " ❘ " + ChatColor.GRAY + "store.aqua.com");
            return true;
        }
        return false;
    }

}
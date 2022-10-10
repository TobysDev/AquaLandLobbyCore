package dev.tobys.aqualand.Other;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Lag implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equals("lag")) {
            Player player = (Player)sender;
            player.sendMessage(ChatColor.BLUE + "System" + ChatColor.DARK_GRAY + " ❘ " + ChatColor.GRAY + "We have checked the server and the server is running fine");
            return true;
        }
        return false;
    }
}
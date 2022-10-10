package dev.tobys.aqualand.Other;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ServerInfo implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equals("server")) {
            Player player = (Player)sender;
            player.sendMessage(ChatColor.BLUE + "System" + ChatColor.DARK_GRAY + " ❘ " + ChatColor.GRAY + "You are currently in the " + ChatColor.UNDERLINE + ChatColor.BLUE + "Lobby");
            return true;
        }
        return false;
    }
}

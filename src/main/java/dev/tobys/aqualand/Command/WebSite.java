package dev.tobys.aqualand.Command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WebSite implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equals("web")) {
            Player player = (Player)sender;
            player.sendMessage(ChatColor.BLUE+ "Website" + ChatColor.DARK_GRAY + " ❘ " + ChatColor.GRAY + "aqualand.com");
            return true;
        }
        return false;
    }

}
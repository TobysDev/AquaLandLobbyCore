package dev.tobys.aqualand.LobbyOther;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equals("heal")) {
            Player player = (Player)sender;
            player.sendMessage(ChatColor.BLUE + "System" + ChatColor.DARK_GRAY + " ❘ " + ChatColor.GRAY + "You have been healed");
            player.setHealth(20);
            return true;
        }
        return false;
    }
}

package dev.tobys.aqualand.Chat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ClearChat implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("clearchat")) {
            if (sender instanceof Player && !sender.hasPermission("clearchat.admin")) {
                sender.sendMessage(ChatColor.RED + "You're not allowed to do this!");
                return true;
            }

            for (int i = 0; i < 500; i++) {
                Bukkit.broadcastMessage("");
            }

            Bukkit.broadcastMessage(ChatColor.BLUE + "System" + ChatColor.DARK_GRAY + " ❘ " + ChatColor.GRAY + "The chat has been cleared");

        }
        return true;
    }
}
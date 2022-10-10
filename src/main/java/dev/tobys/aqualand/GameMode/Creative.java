package dev.tobys.aqualand.GameMode;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Creative implements CommandExecutor {

 @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("GameodeCreative.admin")){
                player.sendMessage(ChatColor.BLUE + "System" + ChatColor.DARK_GRAY + " ❘ " + ChatColor.GRAY + "You have changed gamemode to " + ChatColor.UNDERLINE + ChatColor.GREEN + "Creative");
                player.setGameMode(GameMode.CREATIVE);
                player.setInvulnerable(true);
            }else {
                player.sendMessage(ChatColor.RED + "You're not allowed to do this!");
            }
        }

        return true;
    }
}
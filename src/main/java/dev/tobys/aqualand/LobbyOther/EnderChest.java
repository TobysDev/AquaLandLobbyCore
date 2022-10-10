package dev.tobys.aqualand.LobbyOther;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderChest implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equals("enderchest")) {
            Player player = (Player)sender;
            player.openInventory(player.getEnderChest());
            return true;
        }
        return false;
    }
}

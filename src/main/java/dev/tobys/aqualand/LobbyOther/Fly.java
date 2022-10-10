package dev.tobys.aqualand.LobbyOther;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player)sender;

        if(!p.hasPermission("lobbyfly.use")) {
            p.sendMessage("§cYou cannot use this command.");
        } else {
            if(p.getAllowFlight()) {
                p.sendMessage("§cFly deactivated!");
                p.setAllowFlight(false);
            } else {
                p.sendMessage("§aFly activated!");
                p.setAllowFlight(true);
            }
        }
        return true;
    }
}

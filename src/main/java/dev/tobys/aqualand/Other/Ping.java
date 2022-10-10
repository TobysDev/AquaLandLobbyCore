package dev.tobys.aqualand.Other;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

    public class Ping implements CommandExecutor {

        @Override
        public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            if(command.getName().equals("ping")) {
                Player player = (Player)sender;
                player.sendMessage("§c§l!§8 • §r§7Tvoj aktuálny ping je " + player.getPing() + "ms");
                return true;
            }
            return false;
        }
    }

package dev.tobys.aqualand.LobbyOther;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WorkBench implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equals("workbench")) {
            Player player = (Player)sender;
            player.openWorkbench(null, true);
            return true;
        }
        return false;
    }
}

package dev.tobys.aqualand.GUI.Menu;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GUIMoveItem implements Listener {

    @EventHandler
    public void clickEvent(InventoryClickEvent e){

        //Check to see if its the GUI menu
        if(e.getView().getTitle().equalsIgnoreCase(ChatColor.DARK_GRAY + "Server Selector")){
            Player player = (Player) e.getWhoClicked();
            //Determine what they selected and what to do
            switch(e.getCurrentItem().getType()){
                case GRASS_BLOCK:
                    player.closeInventory();
                    player.sendMessage(ChatColor.BLUE + "System" + ChatColor.DARK_GRAY + " ❘ " + ChatColor.GRAY + "Connecting to server " + ChatColor.GREEN + ChatColor.UNDERLINE + "Survival");
                    break;
                case OAK_SAPLING:
                    player.closeInventory();
                    player.sendMessage(ChatColor.BLUE + "System" + ChatColor.DARK_GRAY + " ❘ " + ChatColor.GRAY + "Connecting to server " + ChatColor.BLUE + ChatColor.UNDERLINE + "Oneblock");
                    break;
                case STONE:
                    player.closeInventory();
                    player.sendMessage(ChatColor.BLUE + "System" + ChatColor.DARK_GRAY + " ❘ " + ChatColor.GRAY + "Current under " + ChatColor.RED + ChatColor.UNDERLINE + "maintenance");
                    break;
            }


            e.setCancelled(true); //So they cant take the items
        }

    }

}

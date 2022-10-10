package dev.tobys.aqualand.Join;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;

public class ItemJoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Bukkit.getServer().getScheduler().scheduleAsyncDelayedTask((Plugin) this, new Runnable(){
            public void run(){
                e.getPlayer().getInventory().setItem(2, getSelector());
            }
        }, 20);
    }

    public ItemStack getSelector(){
        ItemStack ServerSelector = new ItemStack(Material.COMPASS);
        ItemMeta ServerSelectorMeta = ServerSelector.getItemMeta();

        ServerSelectorMeta.setDisplayName(ChatColor.GRAY + "»" + ChatColor.DARK_GREEN + "»" + ChatColor.GRAY + "»" + ChatColor.GREEN + " Server Selector " + ChatColor.GRAY + "«" + ChatColor.DARK_GREEN + "«" + ChatColor.GRAY + "«");
        ArrayList<String> LoreList = new ArrayList<String>();
        LoreList.add(ChatColor.GRAY + "» Select The Server You");
        LoreList.add(ChatColor.GRAY + "  Wish To Play On");

        ServerSelectorMeta.setLore(LoreList);
        ServerSelector.setItemMeta(ServerSelectorMeta);

        return ServerSelector;
    }

}

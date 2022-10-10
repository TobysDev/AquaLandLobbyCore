package dev.tobys.aqualand.GUI.Menu;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GUICommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            Inventory serverselector = Bukkit.createInventory(player, 27, ChatColor.DARK_GRAY + "Server Selector");

            //Menu Options(Items)
            ItemStack Survival = new ItemStack(Material.GRASS_BLOCK); // Survival
            ItemStack Skyblock =  new ItemStack(Material.OAK_SAPLING); // Skyblock
            ItemStack Oneblock = new ItemStack(Material.STONE); // Oneblock

            //Edit the items
            ItemMeta Survival_meta = Survival.getItemMeta();
            Survival_meta.setDisplayName(ChatColor.GREEN + "Survival");
            ArrayList<String> Survival_lore = new ArrayList<>();
            Survival_lore.add(ChatColor.GRAY + "Let's play survival");
            Survival_meta.setLore(Survival_lore);
            Survival.setItemMeta(Survival_meta);
            serverselector.setItem(11, Survival);

            ItemMeta Skyblock_meta = Skyblock.getItemMeta();
            Skyblock_meta.setDisplayName(ChatColor.BLUE + "Skyblock");
            ArrayList<String> Skyblock_lore = new ArrayList<>();
            Skyblock_lore.add(ChatColor.GRAY + "Let's play skyblock");
            Skyblock_meta.setLore(Skyblock_lore);
            Skyblock.setItemMeta(Skyblock_meta);
            serverselector.setItem(13, Skyblock);

            ItemMeta Oneblock_meta = Oneblock.getItemMeta();
            Oneblock_meta.setDisplayName(ChatColor.RED + (ChatColor.STRIKETHROUGH + "Oneblock"));
            ArrayList<String> Oneblock_lore = new ArrayList<>();
            Oneblock_lore.add(ChatColor.RED + "Maintenance");
            Oneblock_meta.setLore(Oneblock_lore);
            Oneblock.setItemMeta(Oneblock_meta);
            serverselector.setItem(15, Oneblock);

            player.openInventory(serverselector);

        }

        return true;
    }
}

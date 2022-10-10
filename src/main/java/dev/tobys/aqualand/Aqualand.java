package dev.tobys.aqualand;

import dev.tobys.aqualand.Chat.ClearChat;
import dev.tobys.aqualand.Command.Discord;
import dev.tobys.aqualand.Command.Store;
import dev.tobys.aqualand.Command.WebSite;
import dev.tobys.aqualand.GUI.Menu.GUICommand;
import dev.tobys.aqualand.GUI.Menu.GUIMoveItem;
import dev.tobys.aqualand.GameMode.Adventure;
import dev.tobys.aqualand.GameMode.Creative;
import dev.tobys.aqualand.GameMode.Spectator;
import dev.tobys.aqualand.GameMode.Survival;
import dev.tobys.aqualand.Join.ChatWelcome;
import dev.tobys.aqualand.Join.ItemJoin;
import dev.tobys.aqualand.Join.JoinMessage;
import dev.tobys.aqualand.LobbyOther.EnderChest;
import dev.tobys.aqualand.LobbyOther.Feed;
import dev.tobys.aqualand.LobbyOther.Heal;
import dev.tobys.aqualand.LobbyOther.WorkBench;
import dev.tobys.aqualand.Other.*;
import dev.tobys.aqualand.ScoreboardAndTablist.TablistManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Aqualand extends JavaPlugin {

    @Override
    public void onEnable() {

        // Plugin startup logic
        this.getLogger().info("AquaLand Lobby System - Enabled");

        // Register Listeners
        getServer().getPluginManager().registerEvents(new ChatWelcome(), this);
        getServer().getPluginManager().registerEvents(new JoinMessage(), this);
        getServer().getPluginManager().registerEvents(new RemoveDeathMessage(), this);
        getServer().getPluginManager().registerEvents(new GUIMoveItem(), this);
        getServer().getPluginManager().registerEvents(new ItemJoin(), this);
        getServer().getPluginManager().registerEvents(new TablistManager(), this);


        // Command
        getCommand("menu").setExecutor(new GUICommand());
        getCommand("ping").setExecutor(new Ping());
        getCommand("server").setExecutor(new ServerInfo());
        getCommand("lag").setExecutor(new Lag());
        getCommand("feed").setExecutor(new Feed());
        getCommand("heal").setExecutor(new Heal());
        getCommand("enderchest").setExecutor(new EnderChest());
        getCommand("workbench").setExecutor(new WorkBench());


        // Command Message
        getCommand("discord").setExecutor(new Discord());
        getCommand("store").setExecutor(new Store());
        getCommand("web").setExecutor(new WebSite());

        // Command Gamemode
        getCommand("gmc").setExecutor(new Creative());
        getCommand("gma").setExecutor(new Adventure());
        getCommand("gmsp").setExecutor(new Spectator());
        getCommand("gms").setExecutor(new Survival());

        // Chat
        getCommand("clearchat").setExecutor(new ClearChat());

    }
    }



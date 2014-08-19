package me.snotro.FrostCORE;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new FrostChat(), this);
    }

    @Override
    public void onDisable(){
    }

    // Things to give on Login.
    @EventHandler
    public void giveItems(PlayerJoinEvent e){

    }




}




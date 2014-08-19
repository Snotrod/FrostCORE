package me.snotro.FrostCORE;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class FrostChat implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e){
        Player player = e.getPlayer();
        if (player.isOp()){
            e.setFormat((ChatColor.BLUE + "" + ChatColor.BOLD + "OWNER") + ChatColor.WHITE + " %s" + ChatColor.AQUA + " >>" + ChatColor.GRAY + " %s");
        }

        else if(player.hasPermission("Frost.Chat.Admin")){
            e.setFormat((ChatColor.RED + "" + ChatColor.BOLD + "ADMIN") + ChatColor.WHITE + "%s" + ChatColor.AQUA + ">>" + ChatColor.GRAY + "%s");
        }

        else if (player.hasPermission("Frost.Chat.Normal")){
            e.setFormat(ChatColor.GRAY + "%s " + ChatColor.AQUA + " >> " + ChatColor.GRAY + " %s");
        }
    }

}

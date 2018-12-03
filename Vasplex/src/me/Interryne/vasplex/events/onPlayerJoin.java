package me.Interryne.vasplex.events;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitRunnable;

import me.Interryne.vasplex.main.Main;
import net.md_5.bungee.api.ChatColor;

public class onPlayerJoin implements Listener {
	
	@EventHandler
	
	public void playerJoin(PlayerJoinEvent e) {
		
		boolean beta = false;
		 
		new BukkitRunnable(){
            int counter = 3; //TODO: In seconds
            @Override
            public void run() {
                    counter --;

                    if(counter == 0) {
                    	
                    	if(beta == true) {
                    		e.getPlayer().sendMessage(ChatColor.RED + "Vasplex - USING A BETA VERSION OF THIS PLUGIN, " + Main.getInstance().getDescription().getVersion() + " HOTFIX");
                    	}
                    
                    	e.getPlayer().sendMessage(ChatColor.GREEN + "Check out server updates using the " + ChatColor.GOLD + "/changelog " + ChatColor.GREEN + "command!");
                    
                    cancel();
                    }
            }
       
        }.runTaskTimer(Main.getInstance(), 0, 20);;
		
		
		
	}

}

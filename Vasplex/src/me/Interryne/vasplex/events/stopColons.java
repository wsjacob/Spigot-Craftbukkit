package me.Interryne.vasplex.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import net.md_5.bungee.api.ChatColor;

public class stopColons implements Listener {
	
@EventHandler
	
	public void noColons(PlayerCommandPreprocessEvent e) {

			if(e.getMessage().startsWith("/") && e.getMessage().contains(":")) {
				if(e.getMessage().startsWith("//")) {
					e.setCancelled(false);
					return;
				}else {
					e.setCancelled(true);
					e.getPlayer().sendMessage(ChatColor.RED + "You are not allowed to do this!");
				}
				
			}
		
	}

}

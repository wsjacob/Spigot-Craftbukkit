package me.Interryne.vasplex.events.lockdown;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import me.Interryne.vasplex.main.Main;
import net.md_5.bungee.api.ChatColor;

public class cancelCommands implements Listener {
	
@EventHandler
	
	public void stopCommands(PlayerCommandPreprocessEvent e) {
		if(Main.lockdownEnabled == true) {
			if(e.getMessage().startsWith("/")) {
				e.setCancelled(true);
				e.getPlayer().sendMessage(ChatColor.RED + "Server is currently in lockdown!");
			}
		}
	}

}

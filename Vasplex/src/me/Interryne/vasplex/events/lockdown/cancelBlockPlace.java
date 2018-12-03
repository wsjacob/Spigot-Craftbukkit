package me.Interryne.vasplex.events.lockdown;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import me.Interryne.vasplex.main.Main;
import net.md_5.bungee.api.ChatColor;

public class cancelBlockPlace implements Listener {
	
	@EventHandler
	
	public void stopBlocksPlace(BlockPlaceEvent  e) {
		if(Main.lockdownEnabled == true) {
			e.setCancelled(true);
			e.getPlayer().sendMessage(ChatColor.RED + "Server is currently in lockdown!");
		}
	}

}

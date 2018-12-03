package me.Interryne.vasplex.events.lockdown;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import me.Interryne.vasplex.main.Main;
import net.md_5.bungee.api.ChatColor;

public class cancelBlockBreak implements Listener {
	
	@EventHandler
	
	public void stopBlocksBreak(BlockBreakEvent e) {
		if(Main.lockdownEnabled == true) {
			e.setCancelled(true);
			e.getPlayer().sendMessage(ChatColor.RED + "Server is currently in lockdown!");
		}
	}

}

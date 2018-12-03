package me.Interryne.vasplex.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PotionSplashEvent;

public class noPotions implements Listener {
	
	@EventHandler
	
	public void onPotionThrow(PotionSplashEvent e) {

			e.setCancelled(true);
			
			
			
	}

}

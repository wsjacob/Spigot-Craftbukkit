package me.Interryne.vasplex.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import me.Interryne.vasplex.main.Main;

public class playerChatEvent implements Listener {
	
	@EventHandler
	
	public void onChatEvent(AsyncPlayerChatEvent e) {
		
		Player p = e.getPlayer();
		
		String message = e.getMessage().toLowerCase();
		
		if(message.contains("fuck")) {
			
			e.setCancelled(true);
			p.sendMessage(" ");
			p.sendMessage(Main.badLanguage);
			p.sendMessage(" ");
			
		}else if(message.contains("shit")) {
			
			e.setCancelled(true);
			p.sendMessage(" ");
			p.sendMessage(Main.badLanguage);
			p.sendMessage(" ");
			
		}else if(message.contains("whore")) {
			
			e.setCancelled(true);
			p.sendMessage(" ");
			p.sendMessage(Main.badLanguage);
			p.sendMessage(" ");
			
		}else if(message.contains("slut")) {
			
			e.setCancelled(true);
			p.sendMessage(" ");
			p.sendMessage(Main.badLanguage);
			p.sendMessage(" ");
			
		}else if(message.contains("penis")) {
			
			e.setCancelled(true);
			p.sendMessage(" ");
			p.sendMessage(Main.badLanguage);
			p.sendMessage(" ");
			
		}else if(message.contains("vagina")) {
			
			e.setCancelled(true);
			p.sendMessage(" ");
			p.sendMessage(Main.badLanguage);
			p.sendMessage(" ");
			
		}else if(message.contains("gook")) {
			
			e.setCancelled(true);
			p.sendMessage(" ");
			p.sendMessage(Main.badLanguage);
			p.sendMessage(" ");
			
		}else if(message.contains("kyke")) {
			
			e.setCancelled(true);
			p.sendMessage(" ");
			p.sendMessage(Main.badLanguage);
			p.sendMessage(" ");
			
		}else if(message.contains("retard")) {
			
			e.setCancelled(true);
			p.sendMessage(" ");
			p.sendMessage(Main.badLanguage);
			p.sendMessage(" ");
			
		}else if(message.contains("nigga")) {
			
			e.setCancelled(true);
			p.sendMessage(" ");
			p.sendMessage(Main.badLanguage);
			p.sendMessage(" ");
			
		}else if(message.contains("bitch")) {
			
			e.setCancelled(true);
			p.sendMessage(" ");
			p.sendMessage(Main.badLanguage);
			p.sendMessage(" ");
			
		}else if(message.contains("cunt")) {
			
			e.setCancelled(true);
			p.sendMessage(" ");
			p.sendMessage(Main.badLanguage);
			p.sendMessage(" ");
			
		}else if(message.contains("twat")) {
			
			e.setCancelled(true);
			p.sendMessage(" ");
			p.sendMessage(Main.badLanguage);
			p.sendMessage(" ");
			
		}else if(message.contains("fagg")) {
			
			e.setCancelled(true);
			p.sendMessage(" ");
			p.sendMessage(Main.badLanguage);
			p.sendMessage(" ");
			
		}else if(message.contains("cock")) {
			e.setCancelled(true);
			p.sendMessage(" ");
			p.sendMessage(Main.badLanguage);
			p.sendMessage(" ");
		}else if(message.contains("dick")) {
			e.setCancelled(true);
			p.sendMessage(" ");
			p.sendMessage(Main.badLanguage);
			p.sendMessage(" ");
		}else if(message.contains("douch")) {
			e.setCancelled(true);
			p.sendMessage(" ");
			p.sendMessage(Main.badLanguage);
			p.sendMessage(" ");
		}else if(message.contains("fingering")) {
			e.setCancelled(true);
			p.sendMessage(" ");
			p.sendMessage(Main.badLanguage);
			p.sendMessage(" ");
		}else if(message.contains("jacking")) {
			e.setCancelled(true);
			p.sendMessage(" ");
			p.sendMessage(Main.badLanguage);
			p.sendMessage(" ");
		}else if(message.contains("milf")) {
			e.setCancelled(true);
			p.sendMessage(" ");
			p.sendMessage(Main.badLanguage);
			p.sendMessage(" ");
		}else if(message.contains("wanker")) {
			e.setCancelled(true);
			p.sendMessage(" ");
			p.sendMessage(Main.badLanguage);
			p.sendMessage(" ");
		}else if(message.contains("asshole")) {
			e.setCancelled(true);
			p.sendMessage(" ");
			p.sendMessage(Main.badLanguage);
			p.sendMessage(" ");
		
		}else if(message.contains("nazi")) {
			e.setCancelled(true);
			p.sendMessage(" ");
			p.sendMessage(Main.badLanguage);
			p.sendMessage(" ");
		}
			
			
			
	}

}

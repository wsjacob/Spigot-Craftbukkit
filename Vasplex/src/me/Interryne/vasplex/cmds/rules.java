package me.Interryne.vasplex.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class rules implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(command.getName().equalsIgnoreCase("rules")) {
			
			if(sender instanceof Player) {
				
				Player p = (Player) sender;
				
				p.sendMessage(vpversion.line);
				
				p.sendMessage(ChatColor.GRAY + "[1] " + ChatColor.RED + "No discrimination or racism.");
				p.sendMessage(ChatColor.GRAY + "[2] " + ChatColor.RED + "No NSFW or Pornographic Content.");
				p.sendMessage(ChatColor.GRAY + "[3] " + ChatColor.RED + "Show respect for everyone.");
				p.sendMessage(ChatColor.GRAY + "[4] " + ChatColor.RED + "No excessive spam.");
				p.sendMessage(ChatColor.GRAY + "[5] " + ChatColor.RED + "Swearing is not allowed on the discord or minecraft (or signs).");
				p.sendMessage(ChatColor.GRAY + "[6] " + ChatColor.RED + "Keep conversations in the correct text channel.");
				p.sendMessage(ChatColor.GRAY + "[7] " + ChatColor.RED + "No DoX or DDoS threats.");
				p.sendMessage(ChatColor.GRAY + "[8] " + ChatColor.RED + "Respect what staff tell you.");
				p.sendMessage(ChatColor.GRAY + "[9] " + ChatColor.RED + "No illegal/offensive builds.");
				p.sendMessage(ChatColor.GRAY + "[10] " + ChatColor.RED + "No illegal/offensive signs.");
				
				
				p.sendMessage(vpversion.line);
			}
		}
		
		return false;
	}
	
	

}

package me.Interryne.vasplex.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class play implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		
		if(command.getName().equalsIgnoreCase("play")) {
			
			if(sender instanceof Player) {
				
				Player p = (Player) sender;
				
				p.sendMessage(vpversion.line);
				
				p.sendMessage(ChatColor.GREEN + "Do /help to view commands!");
				
				p.sendMessage(vpversion.line);
				
			}
		}
		return false;
	}

}

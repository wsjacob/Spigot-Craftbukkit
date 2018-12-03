package me.Interryne.vasplex.cmds.fun;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class colorlist implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		
		if(command.getName().equalsIgnoreCase("colorlist")) {
			
			if(sender instanceof Player) {
				
				Player p = (Player) sender;
				
				p.sendMessage(ChatColor.RED + "These colors can be used with /dyearmor <color>, avaliable for premium members!");
				p.sendMessage(ChatColor.GRAY + "black, red, green, brown, blue, purple, gray, lightgray, pink, cyan, lightgreen, yellow, lightblue, magenta, orange, and white.");
			
			}
		}
		return false;
	}

}

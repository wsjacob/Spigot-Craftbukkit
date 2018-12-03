package me.Interryne.vasplex.cmds.fun;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class wp implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		
		if(command.getName().equalsIgnoreCase("wp")) {
			
			if(sender instanceof Player) {
				
				Player p = (Player) sender;
				
				p.chat(ChatColor.GREEN + "Well played!");
			
			}
		}
		return false;
	}

}

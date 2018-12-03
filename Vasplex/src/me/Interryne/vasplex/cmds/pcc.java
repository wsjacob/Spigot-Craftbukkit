package me.Interryne.vasplex.cmds;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Interryne.vasplex.main.Main;

public class pcc implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		
		if(command.getName().equalsIgnoreCase("pcc")) {
			
			if(sender instanceof Player) {
				
				Player p = (Player) sender;
				
				if(p.hasPermission("vasplex.premium")) {
					
					int count = 1;
			        while (count < 1005) {
			        	p.sendMessage("\n");
			            count++;
			        }
			        
			        p.sendMessage(ChatColor.GREEN + "You cleared your personal chat!");
					
				}else {
					
					p.sendMessage(Main.no_permission_donor);
					
				}
			
			}
		}
		return false;
	}

}

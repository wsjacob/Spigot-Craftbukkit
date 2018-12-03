package me.Interryne.vasplex.cmds.staff;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Interryne.vasplex.main.Main;
import net.md_5.bungee.api.ChatColor;

public class clearchat implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(command.getName().equalsIgnoreCase("cc")) {
			
			if(sender instanceof Player) {
				
				Player p = (Player) sender;
				
				if(p.hasPermission("vasplex.staff")) {
					
				for(Player allplayers : Bukkit.getOnlinePlayers()) {
					
					int count = 1;
			        while (count < 1005) {
			        	allplayers.sendMessage("\n");
			            count++;
			        }
			        
			        allplayers.sendMessage(ChatColor.YELLOW + "Chat cleared by a staff member!");
				}
				
			}else {
				p.sendMessage(Main.no_permission);
			}
				
			}
			
		}
		
		return false;
	}

}

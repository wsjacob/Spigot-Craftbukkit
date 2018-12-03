package me.Interryne.vasplex.cmds.staff;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Interryne.vasplex.main.Main;
import net.md_5.bungee.api.ChatColor;

public class testquickmathsenabled implements CommandExecutor {
	


	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(command.getName().equalsIgnoreCase("testquickmathsenabled")) {
			
			if(sender instanceof Player) {
				
				Player p = (Player) sender;
				
				if(p.hasPermission("vasplex.staff")) {
					
				if(Main.quickMathsEnabled == true) {
					p.sendMessage(ChatColor.GREEN + "QuickMaths is currently on!");
				}else {
					p.sendMessage(ChatColor.GREEN + "QuickMaths is currently off!");
				}
				
			}else {
				p.sendMessage(Main.no_permission);
			}
				
			}
			
		}
		
		return false;
	}

}

package me.Interryne.vasplex.cmds;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Interryne.vasplex.main.Main;
import net.md_5.bungee.api.ChatColor;

public class id implements CommandExecutor {

	@SuppressWarnings({"deprecation"})
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(command.getName().equalsIgnoreCase("id")) {
			
			if(sender instanceof Player) {
				
				Player p = (Player) sender;
				
				if(p.hasPermission("vasplex.premium")) {
					
				if(args.length == 0) {
					
					p.sendMessage(ChatColor.RED + "/id <number>");
					
				}else if(args.length == 1) {
					
					try {
						int getMaterialID = Integer.parseInt(args[0]);
						
						try {
						
						Material MaterialName = Material.getMaterial(getMaterialID);
						
						p.sendMessage(ChatColor.LIGHT_PURPLE + "Found item " + MaterialName.toString() + " with ID " + getMaterialID);
						
						}catch (Exception e) {
							p.sendMessage(ChatColor.RED + "Could not find material with ID " + getMaterialID);
							return false;
						}
						
					}catch (Exception e) {
						p.sendMessage(ChatColor.RED + "Your argument (2) was not a number! > " + args[0]);
						return false;
					}
					
				}else {
					p.sendMessage(ChatColor.RED + "/id <number>");
				}
				
			}else {
				p.sendMessage(Main.no_permission_donor);
			}
				
			}
			
		}
		
		return false;
	}
}

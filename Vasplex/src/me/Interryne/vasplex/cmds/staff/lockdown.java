package me.Interryne.vasplex.cmds.staff;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import me.Interryne.vasplex.main.Main;
import net.md_5.bungee.api.ChatColor;


public class lockdown implements CommandExecutor {

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		
		if(command.getName().equalsIgnoreCase("lockdown")) {
			
			
			
			if(sender instanceof Player) {
				
				Player p = (Player) sender;
				
				if(p.getUniqueId().equals("1eefdec1-67e9-46e1-91fb-8fae5914c651") || p.getUniqueId().equals("516d3f67-cc27-4671-aa6b-b13ab11f2376") || p.getUniqueId().equals("6485d425-0ba3-4604-92f7-f1f9ce3357e4")) {
					
					if(Main.lockdownEnabled == false) {
						Main.lockdownEnabled = true;
						Bukkit.getServer().broadcastMessage(ChatColor.DARK_RED.toString() + ChatColor.BOLD.toString() + "Server is on lockdown. All commands, block placing and breaking is now disabled.");
					}else {
						Main.lockdownEnabled = false;
						Bukkit.getServer().broadcastMessage(ChatColor.DARK_RED.toString() + ChatColor.BOLD.toString() + "Lockdown has been turned off.");
					}
					
				}else {
					p.sendMessage(ChatColor.RED + "Must be an server administrator to use this command.");
				}	
			}else if(sender instanceof ConsoleCommandSender){
				
				if(Main.lockdownEnabled == false) {
					Main.lockdownEnabled = true;
					Bukkit.getServer().broadcastMessage(ChatColor.DARK_RED.toString() + ChatColor.BOLD.toString() + "Server is on lockdown. All commands, block placing and breaking is now disabled.");
				}else {
					Main.lockdownEnabled = false;
					Bukkit.getServer().broadcastMessage(ChatColor.DARK_RED.toString() + ChatColor.BOLD.toString() + "Lockdown has been turned off.");
				}
				
			}else {
				sender.sendMessage(ChatColor.RED + "Must be an server administrator to use this command.");
			}
		}
		return false;
	}
	
	

}

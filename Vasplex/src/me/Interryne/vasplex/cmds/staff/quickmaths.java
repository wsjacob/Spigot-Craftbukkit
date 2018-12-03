package me.Interryne.vasplex.cmds.staff;

import java.util.Random;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Interryne.vasplex.cmds.vpversion;
import me.Interryne.vasplex.main.Main;
import net.md_5.bungee.api.ChatColor;

public class quickmaths implements CommandExecutor {
	
	
	public static int n;
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		
		if(command.getName().equalsIgnoreCase("quickmaths")) {
			
			if(sender instanceof Player) {
				
				
				Player p = (Player) sender;
				
				if(p.hasPermission("vasplex.staff")) {
					
					if(Main.quickMathsEnabled == false) {
						
						Main.quickMathsEnabled = true;
						
						p.getServer().broadcastMessage(vpversion.line);
						
						p.getServer().broadcastMessage(ChatColor.LIGHT_PURPLE.toString() + ChatColor.BOLD.toString() + "QUICK MATHS!!! ");
						p.getServer().broadcastMessage(ChatColor.GRAY.toString() + ChatColor.ITALIC.toString() + "First to answer gets a diamond!");
						
						Random rand = new Random();

						n = rand.nextInt(13) + 1;
						//17 is the maximum and the 1 is our minimum.
						
						
						if(n == 1) {
							
							p.getServer().broadcastMessage(" ");
							p.getServer().broadcastMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "9 * (10+5)");
							p.getServer().broadcastMessage(" ");
							
						}else if(n == 2) {
							
							p.getServer().broadcastMessage(" ");
							p.getServer().broadcastMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "16 + 8");
							p.getServer().broadcastMessage(" ");
							
						}else if(n == 3) {
							
							p.getServer().broadcastMessage(" ");
							p.getServer().broadcastMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "7 * 8");
							p.getServer().broadcastMessage(" ");
							
						}else if(n == 4) {
							
							p.getServer().broadcastMessage(" ");
							p.getServer().broadcastMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "6 + (3 * 9) - 3");
							p.getServer().broadcastMessage(" ");
							
						}else if(n == 5) {
							
							p.getServer().broadcastMessage(" ");
							p.getServer().broadcastMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "7 + 7 - 2");
							p.getServer().broadcastMessage(" ");
							
							
						}else if(n == 6) {
							
							p.getServer().broadcastMessage(" ");
							p.getServer().broadcastMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "10 / 10 - 10 + 20 * 10");
							p.getServer().broadcastMessage(" ");
							
						}else if(n == 7) {
							
							p.getServer().broadcastMessage(" ");
							p.getServer().broadcastMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "8 / 2 + 10");
							p.getServer().broadcastMessage(" ");
							
						}else if(n == 8) {
							
							p.getServer().broadcastMessage(" ");
							p.getServer().broadcastMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "8^2");
							p.getServer().broadcastMessage(" ");
							
						}else if(n == 9) {
							
							p.getServer().broadcastMessage(" ");
							p.getServer().broadcastMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "8 + 8 - (5 * 4) + 100");
							p.getServer().broadcastMessage(" ");
							
						}else if(n == 10) {
							
							p.getServer().broadcastMessage(" ");
							p.getServer().broadcastMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "1024 + 512");
							p.getServer().broadcastMessage(" ");
							
						}else if(n == 11) {
							
							p.getServer().broadcastMessage(" ");
							p.getServer().broadcastMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "5 + (5 - 5) - 2");
							p.getServer().broadcastMessage(" ");
						}else if(n == 12) {
							
							p.getServer().broadcastMessage(" ");
							p.getServer().broadcastMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "1 + -1");
							p.getServer().broadcastMessage(" ");
							
			
						}else if(n == 13){
							
							p.getServer().broadcastMessage(" ");
							p.getServer().broadcastMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "25 * 3");
							p.getServer().broadcastMessage(" ");
							
							
						}else {
							p.getServer().broadcastMessage(ChatColor.DARK_GREEN + "Could not get any quick mafs? D: Try agane!");
						}
						
						
						p.getServer().broadcastMessage(vpversion.line);
						
						
						
					}else if(Main.quickMathsEnabled == true) {
						Main.quickMathsEnabled = false;
						
						p.sendMessage(ChatColor.RED.toString() + ChatColor.BOLD.toString() + "QuickMaths, which was enabled, is now disabled!");
						p.getServer().broadcastMessage(ChatColor.LIGHT_PURPLE.toString() + ChatColor.BOLD.toString() + p.getName() + " disabled quickmaths!");
					}
					
				}else {
					p.sendMessage(Main.no_permission);
				}
			
				}
					
				}
				
				
		return false;
	}

}

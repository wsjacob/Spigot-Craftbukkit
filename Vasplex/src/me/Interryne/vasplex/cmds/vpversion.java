package me.Interryne.vasplex.cmds;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Interryne.vasplex.main.Main;
import net.md_5.bungee.api.ChatColor;

public class vpversion implements CommandExecutor {
	
	private Main plugin;
	 
	public vpversion (Main mainInstance) {
	this.plugin = mainInstance;
	}
	
	public static final String line = ChatColor.DARK_GRAY.toString() + ChatColor.STRIKETHROUGH.toString() + "-----------------------------------";

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(command.getName().equalsIgnoreCase("vpversion")) {
			
			if(sender instanceof Player) {
				
				Player p = (Player) sender;
				
				p.sendMessage(line);

				
				String getVersion = plugin.getDescription().getVersion();
				
				p.sendMessage(ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Using Vasplex ->");
				p.sendMessage(ChatColor.RED + "Version: " + getVersion);
				p.sendMessage(ChatColor.RED + "Author: " + "Interryne");
				p.sendMessage(ChatColor.RED + "Stable: " + Main.Stable);
				
			    p.sendMessage(line);
				
			}
		}
		return false;
	}
}

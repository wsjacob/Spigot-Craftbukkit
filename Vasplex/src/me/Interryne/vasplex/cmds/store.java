package me.Interryne.vasplex.cmds;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Interryne.vasplex.main.Main;

public class store implements CommandExecutor {

	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		
		if(command.getName().equalsIgnoreCase("store")) {
			
			if(sender instanceof Player) {
				
				Player p = (Player) sender;
				
				p.sendMessage(vpversion.line);
				
				p.sendMessage(ChatColor.GRAY + "Donate and support our server at:");
				
				p.sendMessage(Main.Server_Store);
				
				p.sendMessage(vpversion.line);
				
				
			}
		}
		return false;
	}

}

package me.Interryne.vasplex.cmds.fun;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class lol implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		
		if(command.getName().equalsIgnoreCase("lol")) {
			
			if(sender instanceof Player) {
				
				Player p = (Player) sender;
				
				p.sendMessage(ChatColor.DARK_AQUA + "Story takes place on 11/19/18");
				p.sendMessage(ChatColor.DARK_AQUA + "Hello, " + p.getName() + " let me tell you of a grand story. On the date listed above, AdequateIdentity crashed the creative server every time he joined. This is not even a joke it is real and it made us have to delete everything off of the creative server.");
				
			}
		}
		return false;
	}

}

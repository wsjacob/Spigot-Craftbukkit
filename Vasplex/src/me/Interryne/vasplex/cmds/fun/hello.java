package me.Interryne.vasplex.cmds.fun;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class hello implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		
		if(command.getName().equalsIgnoreCase("hello")) {
			
			if(sender instanceof Player) {
				
				Player p = (Player) sender;
				
				p.sendMessage("hello.");
			
			}
		}
		return false;
	}

}

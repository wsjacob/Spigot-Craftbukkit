package me.Interryne.vasplex.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Interryne.vasplex.main.Main;

public class ip implements CommandExecutor {

	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		
		if(command.getName().equalsIgnoreCase("ip")) {
			
			if(sender instanceof Player) {
				
				Player p = (Player) sender;
				
				p.sendMessage(vpversion.line);
				
				p.sendMessage(Main.Server_IP);
				
				p.sendMessage(vpversion.line);
				
				
			}
		}
		return false;
	}

}

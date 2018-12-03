package me.Interryne.vasplex.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Interryne.vasplex.main.Main;

public class changelog implements CommandExecutor {
	
	public static String changeLogVersion = "§7Vasplex-Core verison: " + "§e" + Main.getInstance().getDescription().getVersion();
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(command.getName().equalsIgnoreCase("changelog")) {
			
			if(sender instanceof Player) {
				
				Player p = (Player) sender;
				
				
				
				p.sendMessage(Main.changeLogHeader);
				p.sendMessage(changeLogVersion);
				p.sendMessage(Main.chLine1);
				p.sendMessage(Main.chLine2);
				p.sendMessage(Main.chLine3);
				p.sendMessage(Main.chLine4);
				p.sendMessage(Main.chLine5);
				p.sendMessage(Main.chLine6);
			}
		}
		
		return false;
	}

}

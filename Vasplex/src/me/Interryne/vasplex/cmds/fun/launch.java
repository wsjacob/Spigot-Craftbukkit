package me.Interryne.vasplex.cmds.fun;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Interryne.vasplex.main.Main;
import net.md_5.bungee.api.ChatColor;

public class launch implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		
		if(command.getName().equalsIgnoreCase("launch")) {
			
			if(sender instanceof Player) {
				
				Player p = (Player) sender;
				
				org.bukkit.World world = p.getWorld();
				
				if(p.hasPermission("vasplex.premium")) {
					
					Location loc = p.getLocation();
					
					world.createExplosion(loc, 1.0F, false);
					p.setHealth(20);
					p.sendMessage(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "LAUNCHED!!!");
					
				}else {
					p.sendMessage(Main.no_permission_donor);
				}
			
			}
		}
		return false;
	}

}

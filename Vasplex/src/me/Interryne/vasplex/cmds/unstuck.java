package me.Interryne.vasplex.cmds;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;


public class unstuck implements CommandExecutor {

	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		
		if(command.getName().equalsIgnoreCase("unstuck")) {
			
			if(sender instanceof Player) {
				
				Player p = (Player) sender;
				
				final double oldX = p.getLocation().getX();
				final double oldY = p.getLocation().getY();
				final double oldZ = p.getLocation().getZ();
				
				final float yaw = p.getLocation().getYaw();
				final float pitch = p.getLocation().getPitch();
				
				World w = p.getWorld();
				
				Location unstuck = new Location(w, oldX, oldY + 35, oldZ);
				unstuck.setY(yaw);
				unstuck.setPitch(pitch);
				
				p.teleport(unstuck);
				p.sendMessage(ChatColor.YELLOW + "Moving you to a different location...");
			}
		}
		return false;
	}

}

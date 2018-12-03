package me.Interryne.vasplex.cmds.staff;

import java.lang.reflect.InvocationTargetException;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Interryne.vasplex.main.Main;
import me.Interryne.vasplex.utils.Lag;
import net.md_5.bungee.api.ChatColor;

public class checkworldhealth implements CommandExecutor {

	public int pingPlayer(Player who) {
		//TODO: Taken from bukkit fourms! Thanks <3
        try {
            //Building the version of the server in such a form we can use it in NMS code.
            String bukkitversion = Bukkit.getServer().getClass().getPackage()
                    .getName().substring(23);
            //Getting craftplayer to cast later on
            Class<?> craftPlayer = Class.forName("org.bukkit.craftbukkit."
                    + bukkitversion + ".entity.CraftPlayer");
            //Invoking method getHandle() for the craftplayer we build above, and now we have a EntityPlayer
            Object handle = craftPlayer.getMethod("getHandle").invoke(who);
            //Getting field "ping" that holds player's ping obviously
            Integer ping = (Integer) handle.getClass().getDeclaredField("ping").get(handle);
            //Returning the ping
            return ping.intValue();
        } catch (ClassNotFoundException | IllegalAccessException
                | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException
                | NoSuchFieldException e) {
            //Handle exceptions however you like, i chose to return value of -1; since player's ping can't be -1.
            return -1;
        }
    }

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(command.getName().equalsIgnoreCase("checkworldhealth")) {
			if(sender instanceof Player) {
				
				Player p = (Player) sender;
				
				if(!(p.hasPermission("vasplex.staff"))) {
					
					p.sendMessage(Main.no_permission);
					
				}else {
				
			    double tps = Lag.getTPS();
			    double lag = Math.round((1.0D - tps / 20.0D) * 100.0D);
			    
			    
				
			    
			    double roundedTPS = Math.round(Lag.getTPS() * 100.0) / 100.0;
			    
				p.sendMessage("§aWorld Performance:");
				p.sendMessage("§3TPS §8| §c" + roundedTPS);
				p.sendMessage("§3Lag Perecent §8| §c" + lag + "%");
				p.sendMessage("§3Players Online §8| §c" + Bukkit.getServer().getOnlinePlayers().size());
				p.sendMessage("§3Average Ping §8| §c" + pingPlayer(p.getPlayer()));
				p.sendMessage("§3Time (In Ticks) §8| §c" + p.getWorld().getTime());
				p.sendMessage("§3World Name §8| §c" + p.getWorld().getName());
				p.sendMessage("§3World Type §8| §c" + p.getWorld().getWorldType());
				p.sendMessage("§3Total Entities Alive §8| §c" + p.getWorld().getLivingEntities().size());
				
				
				try {
				if(Lag.getTPS() >= 19.75) {
					
					p.sendMessage("§2World Health §8| §a§lGreat!");
					
				}else if(Lag.getTPS() < 19.75 && Lag.getTPS() > 19) {
					
					p.sendMessage("§2World Health §8| §6§lAverage!");
					
				}else if(Lag.getTPS() < 19) {
					
					p.sendMessage("§2World Health §8| §c§lPoor!");
					
				}else {
					p.sendMessage("§2World Health §8| §4Could not obtain!" );
				}
				
				}catch(Exception e) {
					p.sendMessage(ChatColor.GREEN + "An error occured! Report this!");
					p.sendMessage(e.getMessage());
				}
				}
			}else {
				sender.sendMessage("You must be a player!");
			}
		}
		return false;
	}

}

package me.Interryne.vasplex.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class help implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		
		if(command.getName().equalsIgnoreCase("help")) {
			
			if(sender instanceof Player) {
				
				Player p = (Player) sender;
				
				if(args.length == 0) {
					
					p.sendMessage(vpversion.line);
					
					p.sendMessage(ChatColor.YELLOW + "Help " + ChatColor.GRAY + "-> " + ChatColor.GOLD + "Page 1/5");
					p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/plot auto " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Claim a free plot.");
					p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/plot claim " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Claim the plot you are standing on.");
					p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/plot home " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Go to your plot.");
					p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/plot dispose " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Delete your plot.");
					p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/plot clear " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Clear your plot.");
					p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/msg " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Private message a player.");
					p.sendMessage(vpversion.line);
					
				}else if(args.length == 1) {
					
					if(args[0].equalsIgnoreCase("1")) {
						p.sendMessage(vpversion.line);
						p.sendMessage(ChatColor.YELLOW + "Help " + ChatColor.GRAY + "-> " + ChatColor.GOLD + "Page 1/5");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/plot auto " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Claim a free plot.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/plot claim " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Claim the plot you are standing on.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/plot home " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Go to your plot.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/plot dispose " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Delete your plot.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/plot clear " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Clear your plot.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/msg " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Private message a player.");
						p.sendMessage(vpversion.line);
						
					}else if(args[0].equalsIgnoreCase("2")) {
						p.sendMessage(vpversion.line);
						p.sendMessage(ChatColor.YELLOW + "Help " + ChatColor.GRAY + "-> " + ChatColor.GOLD + "Page 2/5");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/sethome " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Set your home at your location.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/home " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Go to your sethome.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/spawn " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Go to the spawn point.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/skull " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Get the head of a player.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/discord " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Get the link to join the discord.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/ignore " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Ignore a player's tpa and chat msgs.");
						p.sendMessage(vpversion.line);
					}else if(args[0].equalsIgnoreCase("3")) {
						
						p.sendMessage(vpversion.line);
						p.sendMessage(ChatColor.YELLOW + "Help " + ChatColor.GRAY + "-> " + ChatColor.GOLD + "Page 3/5");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/ci " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Clear your inventory.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/plot deny " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Denys a player from being on your plot.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/plot add " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Allows a player to build when the plot owner is online.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/plot info " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Get the information on the current plot.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/plot kick " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Kick someone off your plot.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/plot trust " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Allow a player to build when the owner is offline.");
						p.sendMessage(vpversion.line);
					}else if(args[0].equalsIgnoreCase("4")) {
						
						p.sendMessage(vpversion.line);
						p.sendMessage(ChatColor.YELLOW + "Help " + ChatColor.GRAY + "-> " + ChatColor.GOLD + "Page 4/5");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/plot middle " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Go to the middle of your plot.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/plot untrust " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Deny a trusted person to build on your plot.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/tpaccept " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Accept a teleport request.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/tpdeny " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Deny a teleport request.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/tpa " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Request to teleport to someone.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/tpahere " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Request to teleport someone to you.");
						p.sendMessage(vpversion.line);
						
					}else if(args[0].equalsIgnoreCase("5")){
						p.sendMessage(vpversion.line);
						p.sendMessage(ChatColor.YELLOW + "Help " + ChatColor.GRAY + "-> " + ChatColor.GOLD + "Page 5/5");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/afk " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Turn your player into an AFK state.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/rules " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "View the server rules.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/ip " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "View the server ip.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/unstuck " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Teleport out of a stuck situation.");
						p.sendMessage(vpversion.line);
					}else if(args[0].equalsIgnoreCase("premium")){
						p.sendMessage(vpversion.line);
						p.sendMessage(ChatColor.YELLOW + "Help " + ChatColor.GRAY + "-> " + ChatColor.GOLD + "Page [PREMIUM]");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/hat " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Wear a block on your head.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/premium " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Open a GUI full of exclusive features!");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/pcc " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Clear your chat.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/dyearmor " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Dye the armor in your hand.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/gamemode " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Change your gamemode.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/give " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Give yourself an item.");
						p.sendMessage(ChatColor.DARK_GRAY + "* " + ChatColor.DARK_AQUA + "/id " + ChatColor.GRAY + "-> " + ChatColor.YELLOW + "Get a name of an item by putting in an id.");
						p.sendMessage(vpversion.line);
					}else {
						p.sendMessage(ChatColor.RED + "Help page dosen't exist, use /help [1-5]");
						p.sendMessage(ChatColor.RED + "To view premium commands, do /help premium.");
					}
					
				}else {
					p.sendMessage(ChatColor.RED + "Invalid Page, /help [1-5]");
					p.sendMessage(ChatColor.RED + "To view premium commands, do /help premium.");
				}
				
				
				
				
			}
		}
		return false;
	}

}

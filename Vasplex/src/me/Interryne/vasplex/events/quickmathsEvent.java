package me.Interryne.vasplex.events;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.Interryne.vasplex.cmds.staff.quickmaths;
import me.Interryne.vasplex.main.Main;
import net.md_5.bungee.api.ChatColor;

public class quickmathsEvent implements Listener {
	
	
	
	@EventHandler
	 
	public void onChatEventDuringQuickMaths(AsyncPlayerChatEvent e) {
		
		if(Main.quickMathsEnabled == true) {
			
			ItemStack diamond = new ItemStack(Material.DIAMOND, 1);
			ItemMeta meta = diamond.getItemMeta();

	        meta.setDisplayName(ChatColor.GOLD.toString() + ChatColor.BOLD.toString() + "QuickMaths reward!");
	        
	        ArrayList < String > meta_l = new ArrayList < String > ();
	        meta_l.add(ChatColor.GRAY + "Earned from winning a game of quickmaths!");
	        meta.setLore(meta_l);
	        
	        diamond.setItemMeta(meta);
			
			if(quickmaths.n == 1) {
				//TODO: Answer is 135.
				
				if(e.getMessage().equals("135")) {
					Bukkit.getServer().broadcastMessage(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "" + e.getPlayer().getName() + " got the correct answer! It was 135!");
					e.getPlayer().getInventory().addItem(diamond);
					
					e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ORB_PICKUP, 100, 100);
					
					e.setMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "135");
					
					Main.quickMathsEnabled = false;
				}else {
					if(!e.getMessage().startsWith("/")) {
						e.getPlayer().sendMessage(ChatColor.LIGHT_PURPLE + "QuickMaths " + ChatColor.DARK_GRAY.toString() + ChatColor.BOLD.toString() + "> " + ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Wrong answer! Try again!");
					}
					
				}
				
				
			}else if(quickmaths.n == 2) {
				//TODO: Answer is 24.
				
				if(e.getMessage().equals("24")) {
					Bukkit.getServer().broadcastMessage(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "" + e.getPlayer().getName() + " got the correct answer! It was 24!");
					
					e.getPlayer().getInventory().addItem(diamond);
					
					e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ORB_PICKUP, 100, 100);
					
					e.setMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "24");
					
					Main.quickMathsEnabled = false;
				}else {
					if(!e.getMessage().startsWith("/")) {
						e.getPlayer().sendMessage(ChatColor.LIGHT_PURPLE + "QuickMaths " + ChatColor.DARK_GRAY.toString() + ChatColor.BOLD.toString() + "> " + ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Wrong answer! Try again!");
					}
					
				}
				
				
			}else if(quickmaths.n == 3) {
				//TODO: Answer is 56.
				
				if(e.getMessage().equals("56")) {
					Bukkit.getServer().broadcastMessage(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "" + e.getPlayer().getName() + " got the correct answer! It was 56!");
					
					e.getPlayer().getInventory().addItem(diamond);
					
					e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ORB_PICKUP, 100, 100);
					
					e.setMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "56");
					
					Main.quickMathsEnabled = false;
				}else {
					if(!e.getMessage().startsWith("/")) {
						e.getPlayer().sendMessage(ChatColor.LIGHT_PURPLE + "QuickMaths " + ChatColor.DARK_GRAY.toString() + ChatColor.BOLD.toString() + "> " + ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Wrong answer! Try again!");
					}
					
				}
				
				
			}else if(quickmaths.n == 4) {
				//TODO: Answer is 30.
				
				if(e.getMessage().equals("30")) {
					Bukkit.getServer().broadcastMessage(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "" + e.getPlayer().getName() + " got the correct answer! It was 30!");
					
					e.getPlayer().getInventory().addItem(diamond);
					
					e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ORB_PICKUP, 100, 100);
					
					e.setMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "30");
					
					Main.quickMathsEnabled = false;
				}else {
					if(!e.getMessage().startsWith("/")) {
						e.getPlayer().sendMessage(ChatColor.LIGHT_PURPLE + "QuickMaths " + ChatColor.DARK_GRAY.toString() + ChatColor.BOLD.toString() + "> " + ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Wrong answer! Try again!");
					}
					
				}
				
				
			}else if(quickmaths.n == 5) {
				//TODO: Answer is 12.
				
				if(e.getMessage().equals("12")) {
					Bukkit.getServer().broadcastMessage(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "" + e.getPlayer().getName() + " got the correct answer! It was 12!");
					
					
					
					e.getPlayer().getInventory().addItem(diamond);
					
					e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ORB_PICKUP, 100, 100);
					
					e.setMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "12");
					
					Main.quickMathsEnabled = false;
				}else {
					if(!e.getMessage().startsWith("/")) {
						e.getPlayer().sendMessage(ChatColor.LIGHT_PURPLE + "QuickMaths " + ChatColor.DARK_GRAY.toString() + ChatColor.BOLD.toString() + "> " + ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Wrong answer! Try again!");
					}
					
				}
				
				
			}else if(quickmaths.n == 6) {
				//TODO: Answer is 191.
				
				if(e.getMessage().equals("191")) {
					Bukkit.getServer().broadcastMessage(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "" + e.getPlayer().getName() + " got the correct answer! It was 191!");
					
					
					e.getPlayer().getInventory().addItem(diamond);
					
					e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ORB_PICKUP, 100, 100);
					
					e.setMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "191");
					
					Main.quickMathsEnabled = false;
				}else {
					if(!e.getMessage().startsWith("/")) {
						e.getPlayer().sendMessage(ChatColor.LIGHT_PURPLE + "QuickMaths " + ChatColor.DARK_GRAY.toString() + ChatColor.BOLD.toString() + "> " + ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Wrong answer! Try again!");
					}
					
				}
				
				
			}else if(quickmaths.n == 7) {
				//TODO: Answer is 14.
				
				if(e.getMessage().equals("14")) {
					Bukkit.getServer().broadcastMessage(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "" + e.getPlayer().getName() + " got the correct answer! It was 14!");
					
					
					
					e.getPlayer().getInventory().addItem(diamond);
					
					e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ORB_PICKUP, 100, 100);
					
					e.setMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "14");
					
					Main.quickMathsEnabled = false;
				}else {
					if(!e.getMessage().startsWith("/")) {
						e.getPlayer().sendMessage(ChatColor.LIGHT_PURPLE + "QuickMaths " + ChatColor.DARK_GRAY.toString() + ChatColor.BOLD.toString() + "> " + ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Wrong answer! Try again!");
					}
					
				}
				
				
			}else if(quickmaths.n == 8) {
				//TODO: Answer is 64
				
				if(e.getMessage().equals("64")) {
					Bukkit.getServer().broadcastMessage(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "" + e.getPlayer().getName() + " got the correct answer! It was 64!");
					
					
					
					e.getPlayer().getInventory().addItem(diamond);
					
					e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ORB_PICKUP, 100, 100);
					
					e.setMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "64");
					
					Main.quickMathsEnabled = false;
				}else {
					if(!e.getMessage().startsWith("/")) {
						e.getPlayer().sendMessage(ChatColor.LIGHT_PURPLE + "QuickMaths " + ChatColor.DARK_GRAY.toString() + ChatColor.BOLD.toString() + "> " + ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Wrong answer! Try again!");
					}
					
				}
				
				
			}else if(quickmaths.n == 9) {
				//TODO: Answer is 96.
				
				if(e.getMessage().equals("96")) {
					Bukkit.getServer().broadcastMessage(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "" + e.getPlayer().getName() + " got the correct answer! It was 96!");
					
					
					
					e.setMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "96");
					
					e.getPlayer().getInventory().addItem(diamond);
					
					e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ORB_PICKUP, 100, 100);
					
					Main.quickMathsEnabled = false;
				}else {
					if(!e.getMessage().startsWith("/")) {
						e.getPlayer().sendMessage(ChatColor.LIGHT_PURPLE + "QuickMaths " + ChatColor.DARK_GRAY.toString() + ChatColor.BOLD.toString() + "> " + ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Wrong answer! Try again!");
					}
					
				}
				
				
			}else if(quickmaths.n == 10) {
				//TODO: Answer is 1536.
				
				if(e.getMessage().equals("1536")) {
					Bukkit.getServer().broadcastMessage(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "" + e.getPlayer().getName() + " got the correct answer! It was 1536!");
					
					
					
					e.setMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "1536");
					
					e.getPlayer().getInventory().addItem(diamond);
					
					e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ORB_PICKUP, 100, 100);
					
					Main.quickMathsEnabled = false;
				}else {
					if(!e.getMessage().startsWith("/")) {
						e.getPlayer().sendMessage(ChatColor.LIGHT_PURPLE + "QuickMaths " + ChatColor.DARK_GRAY.toString() + ChatColor.BOLD.toString() + "> " + ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Wrong answer! Try again!");
					}
					
				}
				
			}else if(quickmaths.n == 11) {
				
				if(e.getMessage().equals("3")) {
					Bukkit.getServer().broadcastMessage(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "" + e.getPlayer().getName() + " got the correct answer! It was 3!");
					
					
					
					e.setMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "3");
					
					e.getPlayer().getInventory().addItem(diamond);
					
					e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ORB_PICKUP, 100, 100);
					
					Main.quickMathsEnabled = false;
				}else {
					if(!e.getMessage().startsWith("/")) {
						e.getPlayer().sendMessage(ChatColor.LIGHT_PURPLE + "QuickMaths " + ChatColor.DARK_GRAY.toString() + ChatColor.BOLD.toString() + "> " + ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Wrong answer! Try again!");
					}
					
				}
				
			}else if(quickmaths.n == 12) {
				
				if(e.getMessage().equals("0")) {
					Bukkit.getServer().broadcastMessage(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "" + e.getPlayer().getName() + " got the correct answer! It was 0!");
					
					
					e.setMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "0");
					
					e.getPlayer().getInventory().addItem(diamond);
					
					e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ORB_PICKUP, 100, 100);
					
					Main.quickMathsEnabled = false;
				
			}else {
				if(!e.getMessage().startsWith("/")) {
					e.getPlayer().sendMessage(ChatColor.LIGHT_PURPLE + "QuickMaths " + ChatColor.DARK_GRAY.toString() + ChatColor.BOLD.toString() + "> " + ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Wrong answer! Try again!");
				}
				
			}
				
				
		}else if(quickmaths.n == 13) {
			
			if(e.getMessage().equals("75")) {
				Bukkit.getServer().broadcastMessage(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "" + e.getPlayer().getName() + " got the correct answer! It was 75!");
				
				
				e.setMessage(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "75");
				
				e.getPlayer().getInventory().addItem(diamond);
				
				e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ORB_PICKUP, 100, 100);
				
				Main.quickMathsEnabled = false;
			
		}else {
			if(!e.getMessage().startsWith("/")) {
				e.getPlayer().sendMessage(ChatColor.LIGHT_PURPLE + "QuickMaths " + ChatColor.DARK_GRAY.toString() + ChatColor.BOLD.toString() + "> " + ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Wrong answer! Try again!");
			}
			
		}
			
		}
		
		
	} // is quick enabled
	} //check event

} //main class

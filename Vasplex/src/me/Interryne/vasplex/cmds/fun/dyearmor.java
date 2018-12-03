package me.Interryne.vasplex.cmds.fun;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import me.Interryne.vasplex.main.Main;
import net.md_5.bungee.api.ChatColor;

public class dyearmor implements CommandExecutor {
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		
		if(command.getName().equalsIgnoreCase("dyearmor")) {
			
			if(sender instanceof Player) {
				
				Player p = (Player) sender;
				
				if(p.hasPermission("vasplex.premium")) {
					
					if(args.length == 0) {
						
						p.sendMessage(ChatColor.RED + "Usage: /dyearmor <color>");
						p.sendMessage(ChatColor.RED + "Use /colorlist to view colors!");
						
					}else if(args.length == 1) {
						
						if(p.getItemInHand().getType().equals(Material.LEATHER_HELMET)) {

							p.getInventory().removeItem(p.getInventory().getItemInHand());
							
							if(args[0].equalsIgnoreCase("black")) {
								
								
								ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lhelmet.getItemMeta();
						          lch.setColor(Color.fromRGB(0, 0, 0));
						          lhelmet.setItemMeta(lch);
								
								p.getInventory().addItem(lhelmet);
								
							}else if(args[0].equalsIgnoreCase("red")) {
								
								ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lhelmet.getItemMeta();
						          lch.setColor(Color.fromRGB(255, 0, 0));
						          lhelmet.setItemMeta(lch);
						          
						          p.getInventory().addItem(lhelmet);
								
							}else if(args[0].equalsIgnoreCase("green")) {
								
								ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lhelmet.getItemMeta();
						          lch.setColor(Color.fromRGB(50, 165, 50));
						          lhelmet.setItemMeta(lch);
						          
						          p.getInventory().addItem(lhelmet);
								
							}else if(args[0].equalsIgnoreCase("brown")) {
								
								ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lhelmet.getItemMeta();
						          lch.setColor(Color.fromRGB(107, 81, 63));
						          lhelmet.setItemMeta(lch);
						          
						          p.getInventory().addItem(lhelmet);
								
							}else if(args[0].equalsIgnoreCase("blue")) {
								
								ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lhelmet.getItemMeta();
						          lch.setColor(Color.fromRGB(0, 171, 255));
						          lhelmet.setItemMeta(lch);
						          
						          p.getInventory().addItem(lhelmet);
								
							}else if(args[0].equalsIgnoreCase("purple")) {
								
								ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lhelmet.getItemMeta();
						          lch.setColor(Color.fromRGB(154, 0, 255));
						          lhelmet.setItemMeta(lch);
						          
						          p.getInventory().addItem(lhelmet);
								
							}else if(args[0].equalsIgnoreCase("gray")) {
								
								ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lhelmet.getItemMeta();
						          lch.setColor(Color.fromRGB(77, 77, 77));
						          lhelmet.setItemMeta(lch);
						          
						          p.getInventory().addItem(lhelmet);
								
							}else if(args[0].equalsIgnoreCase("lightgray")) {
								
								ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lhelmet.getItemMeta();
						          lch.setColor(Color.fromRGB(156, 153, 149));
						          lhelmet.setItemMeta(lch);
						          
						          p.getInventory().addItem(lhelmet);
								
							}else if(args[0].equalsIgnoreCase("pink")) {
								
								ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lhelmet.getItemMeta();
						          lch.setColor(Color.fromRGB(192, 21, 235));
						          lhelmet.setItemMeta(lch);
						          
						          p.getInventory().addItem(lhelmet);
								
							}else if(args[0].equalsIgnoreCase("cyan")) {
								
								ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lhelmet.getItemMeta();
						          lch.setColor(Color.fromRGB(45, 108, 124));
						          lhelmet.setItemMeta(lch);
						          
						          p.getInventory().addItem(lhelmet);
								
							}else if(args[0].equalsIgnoreCase("lightgreen")) {
								
								ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lhelmet.getItemMeta();
						          lch.setColor(Color.fromRGB(33, 247, 18));
						          lhelmet.setItemMeta(lch);
						          
						          p.getInventory().addItem(lhelmet);
								
							}else if(args[0].equalsIgnoreCase("yellow")) {
								
								ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lhelmet.getItemMeta();
						          lch.setColor(Color.fromRGB(217, 247, 18));
						          lhelmet.setItemMeta(lch);
						          
						          p.getInventory().addItem(lhelmet);
								
							}else if(args[0].equalsIgnoreCase("lightblue")) {
								
								ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lhelmet.getItemMeta();
						          lch.setColor(Color.fromRGB(33, 217, 223));
						          lhelmet.setItemMeta(lch);
						          
						          p.getInventory().addItem(lhelmet);
								
							}else if(args[0].equalsIgnoreCase("magenta")) {
								
								ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lhelmet.getItemMeta();
						          lch.setColor(Color.fromRGB(128, 33, 223));
						          lhelmet.setItemMeta(lch);
						          
						          p.getInventory().addItem(lhelmet);
								
							}else if(args[0].equalsIgnoreCase("orange")) {
								
								ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lhelmet.getItemMeta();
						          lch.setColor(Color.fromRGB(255, 171, 0));
						          lhelmet.setItemMeta(lch);
						          
						          p.getInventory().addItem(lhelmet);
								
							}else if(args[0].equalsIgnoreCase("white")) {
								
								ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lhelmet.getItemMeta();
						          lch.setColor(Color.fromRGB(255, 255, 255));
						          lhelmet.setItemMeta(lch);
						          
						          p.getInventory().addItem(lhelmet);
								
							}else {
								p.sendMessage(ChatColor.RED + "Invalid color!");
								p.sendMessage(ChatColor.RED + "Use /colorlist to view colors!");
							}
							
						}else if(p.getItemInHand().getType().equals(Material.LEATHER_CHESTPLATE)) {
							
							p.getInventory().removeItem(p.getInventory().getItemInHand());
							

								if(args[0].equalsIgnoreCase("black")) {
									
									ItemStack lchestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
							          LeatherArmorMeta lch = (LeatherArmorMeta)lchestplate.getItemMeta();
							          lch.setColor(Color.fromRGB(0, 0, 0));
							          lchestplate.setItemMeta(lch);
									
									p.getInventory().addItem(lchestplate);
									
								}else if(args[0].equalsIgnoreCase("red")) {
									
									ItemStack lchestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
							          LeatherArmorMeta lch = (LeatherArmorMeta)lchestplate.getItemMeta();
							          lch.setColor(Color.fromRGB(255, 0, 0));
							          lchestplate.setItemMeta(lch);
							          
							          p.getInventory().addItem(lchestplate);
									
								}else if(args[0].equalsIgnoreCase("green")) {
									
									ItemStack lchestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
							          LeatherArmorMeta lch = (LeatherArmorMeta)lchestplate.getItemMeta();
							          lch.setColor(Color.fromRGB(50, 165, 50));
							          lchestplate.setItemMeta(lch);
							          
							          p.getInventory().addItem(lchestplate);
									
								}else if(args[0].equalsIgnoreCase("brown")) {
									
									ItemStack lchestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
							          LeatherArmorMeta lch = (LeatherArmorMeta)lchestplate.getItemMeta();
							          lch.setColor(Color.fromRGB(107, 81, 63));
							          lchestplate.setItemMeta(lch);
							          
							          p.getInventory().addItem(lchestplate);
									
								}else if(args[0].equalsIgnoreCase("blue")) {
									
									ItemStack lchestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
							          LeatherArmorMeta lch = (LeatherArmorMeta)lchestplate.getItemMeta();
							          lch.setColor(Color.fromRGB(0, 171, 255));
							          lchestplate.setItemMeta(lch);
							          
							          p.getInventory().addItem(lchestplate);
									
								}else if(args[0].equalsIgnoreCase("purple")) {
									
									ItemStack lchestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
							          LeatherArmorMeta lch = (LeatherArmorMeta)lchestplate.getItemMeta();
							          lch.setColor(Color.fromRGB(154, 0, 255));
							          lchestplate.setItemMeta(lch);
							          
							          p.getInventory().addItem(lchestplate);
									
								}else if(args[0].equalsIgnoreCase("gray")) {
									
									ItemStack lchestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
							          LeatherArmorMeta lch = (LeatherArmorMeta)lchestplate.getItemMeta();
							          lch.setColor(Color.fromRGB(77, 77, 77));
							          lchestplate.setItemMeta(lch);
							          
							          p.getInventory().addItem(lchestplate);
									
								}else if(args[0].equalsIgnoreCase("lightgray")) {
									
									ItemStack lchestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
							          LeatherArmorMeta lch = (LeatherArmorMeta)lchestplate.getItemMeta();
							          lch.setColor(Color.fromRGB(156, 153, 149));
							          lchestplate.setItemMeta(lch);
							          
							          p.getInventory().addItem(lchestplate);
									
								}else if(args[0].equalsIgnoreCase("pink")) {
									
									ItemStack lchestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
							          LeatherArmorMeta lch = (LeatherArmorMeta)lchestplate.getItemMeta();
							          lch.setColor(Color.fromRGB(192, 21, 235));
							          lchestplate.setItemMeta(lch);
							          
							          p.getInventory().addItem(lchestplate);
									
								}else if(args[0].equalsIgnoreCase("cyan")) {
									
									ItemStack lchestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
							          LeatherArmorMeta lch = (LeatherArmorMeta)lchestplate.getItemMeta();
							          lch.setColor(Color.fromRGB(45, 108, 124));
							          lchestplate.setItemMeta(lch);
							          
							          p.getInventory().addItem(lchestplate);
									
								}else if(args[0].equalsIgnoreCase("lightgreen")) {
									
									ItemStack lchestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
							          LeatherArmorMeta lch = (LeatherArmorMeta)lchestplate.getItemMeta();
							          lch.setColor(Color.fromRGB(33, 247, 18));
							          lchestplate.setItemMeta(lch);
							          
							          p.getInventory().addItem(lchestplate);
									
								}else if(args[0].equalsIgnoreCase("yellow")) {
									
									ItemStack lchestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
							          LeatherArmorMeta lch = (LeatherArmorMeta)lchestplate.getItemMeta();
							          lch.setColor(Color.fromRGB(217, 247, 18));
							          lchestplate.setItemMeta(lch);
							          
							          p.getInventory().addItem(lchestplate);
									
								}else if(args[0].equalsIgnoreCase("lightblue")) {
									
									ItemStack lchestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
							          LeatherArmorMeta lch = (LeatherArmorMeta)lchestplate.getItemMeta();
							          lch.setColor(Color.fromRGB(33, 217, 223));
							          lchestplate.setItemMeta(lch);
							          
							          p.getInventory().addItem(lchestplate);
									
								}else if(args[0].equalsIgnoreCase("magenta")) {
									
									ItemStack lchestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
							          LeatherArmorMeta lch = (LeatherArmorMeta)lchestplate.getItemMeta();
							          lch.setColor(Color.fromRGB(128, 33, 223));
							          lchestplate.setItemMeta(lch);
							          
							          p.getInventory().addItem(lchestplate);
									
								}else if(args[0].equalsIgnoreCase("orange")) {
									
									ItemStack lchestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
							          LeatherArmorMeta lch = (LeatherArmorMeta)lchestplate.getItemMeta();
							          lch.setColor(Color.fromRGB(255, 171, 0));
							          lchestplate.setItemMeta(lch);
							          
							          p.getInventory().addItem(lchestplate);
									
								}else if(args[0].equalsIgnoreCase("white")) {
									
									ItemStack lchestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
							          LeatherArmorMeta lch = (LeatherArmorMeta)lchestplate.getItemMeta();
							          lch.setColor(Color.fromRGB(255, 255, 255));
							          lchestplate.setItemMeta(lch);
							          
							          p.getInventory().addItem(lchestplate);
									
								}else {
									p.sendMessage(ChatColor.RED + "Invalid color!");
									p.sendMessage(ChatColor.RED + "Use /colorlist to view colors!");
								}
							
							
							
						}else if(p.getItemInHand().getType().equals(Material.LEATHER_LEGGINGS)) {
							
							p.getInventory().removeItem(p.getInventory().getItemInHand());
							
							if(args[0].equalsIgnoreCase("black")) {
								
								ItemStack lleggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lleggings.getItemMeta();
						          lch.setColor(Color.fromRGB(0, 0, 0));
						          lleggings.setItemMeta(lch);
								
								p.getInventory().addItem(lleggings);
								
							}else if(args[0].equalsIgnoreCase("red")) {
								
								ItemStack lleggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lleggings.getItemMeta();
						          lch.setColor(Color.fromRGB(255, 0, 0));
						          lleggings.setItemMeta(lch);
						          
						          p.getInventory().addItem(lleggings);
								
							}else if(args[0].equalsIgnoreCase("green")) {
								
								ItemStack lleggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lleggings.getItemMeta();
						          lch.setColor(Color.fromRGB(50, 165, 50));
						          lleggings.setItemMeta(lch);
						          
						          p.getInventory().addItem(lleggings);
								
							}else if(args[0].equalsIgnoreCase("brown")) {
								
								ItemStack lleggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lleggings.getItemMeta();
						          lch.setColor(Color.fromRGB(107, 81, 63));
						          lleggings.setItemMeta(lch);
						          
						          p.getInventory().addItem(lleggings);
								
							}else if(args[0].equalsIgnoreCase("blue")) {
								
								ItemStack lleggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lleggings.getItemMeta();
						          lch.setColor(Color.fromRGB(0, 171, 255));
						          lleggings.setItemMeta(lch);
						          
						          p.getInventory().addItem(lleggings);
								
							}else if(args[0].equalsIgnoreCase("purple")) {
								
								ItemStack lleggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lleggings.getItemMeta();
						          lch.setColor(Color.fromRGB(154, 0, 255));
						          lleggings.setItemMeta(lch);
						          
						          p.getInventory().addItem(lleggings);
								
							}else if(args[0].equalsIgnoreCase("gray")) {
								
								ItemStack lleggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lleggings.getItemMeta();
						          lch.setColor(Color.fromRGB(77, 77, 77));
						          lleggings.setItemMeta(lch);
						          
						          p.getInventory().addItem(lleggings);
								
							}else if(args[0].equalsIgnoreCase("lightgray")) {
								
								ItemStack lleggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lleggings.getItemMeta();
						          lch.setColor(Color.fromRGB(156, 153, 149));
						          lleggings.setItemMeta(lch);
						          
						          p.getInventory().addItem(lleggings);
								
							}else if(args[0].equalsIgnoreCase("pink")) {
								
								ItemStack lleggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lleggings.getItemMeta();
						          lch.setColor(Color.fromRGB(192, 21, 235));
						          lleggings.setItemMeta(lch);
						          
						          p.getInventory().addItem(lleggings);
								
							}else if(args[0].equalsIgnoreCase("cyan")) {
								
								ItemStack lleggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lleggings.getItemMeta();
						          lch.setColor(Color.fromRGB(45, 108, 124));
						          lleggings.setItemMeta(lch);
						          
						          p.getInventory().addItem(lleggings);
								
							}else if(args[0].equalsIgnoreCase("lightgreen")) {
								
								ItemStack lleggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lleggings.getItemMeta();
						          lch.setColor(Color.fromRGB(33, 247, 18));
						          lleggings.setItemMeta(lch);
						          
						          p.getInventory().addItem(lleggings);
								
							}else if(args[0].equalsIgnoreCase("yellow")) {
								
								ItemStack lleggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lleggings.getItemMeta();
						          lch.setColor(Color.fromRGB(217, 247, 18));
						          lleggings.setItemMeta(lch);
						          
						          p.getInventory().addItem(lleggings);
								
							}else if(args[0].equalsIgnoreCase("lightblue")) {
								
								ItemStack lleggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lleggings.getItemMeta();
						          lch.setColor(Color.fromRGB(33, 217, 223));
						          lleggings.setItemMeta(lch);
						          
						          p.getInventory().addItem(lleggings);
								
							}else if(args[0].equalsIgnoreCase("magenta")) {
								
								ItemStack lleggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lleggings.getItemMeta();
						          lch.setColor(Color.fromRGB(128, 33, 223));
						          lleggings.setItemMeta(lch);
						          
						          p.getInventory().addItem(lleggings);
								
							}else if(args[0].equalsIgnoreCase("orange")) {
								
								ItemStack lleggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lleggings.getItemMeta();
						          lch.setColor(Color.fromRGB(255, 171, 0));
						          lleggings.setItemMeta(lch);
						          
						          p.getInventory().addItem(lleggings);
								
							}else if(args[0].equalsIgnoreCase("white")) {
								
								ItemStack lleggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lleggings.getItemMeta();
						          lch.setColor(Color.fromRGB(255, 255, 255));
						          lleggings.setItemMeta(lch);
						          
						          p.getInventory().addItem(lleggings);
								
							}else {
								p.sendMessage(ChatColor.RED + "Invalid color!");
								p.sendMessage(ChatColor.RED + "Use /colorlist to view colors!");
							}
							
						}else if(p.getItemInHand().getType().equals(Material.LEATHER_BOOTS)) {
							
							p.getInventory().removeItem(p.getInventory().getItemInHand());
							
							if(args[0].equalsIgnoreCase("black")) {
								
								ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lboots.getItemMeta();
						          lch.setColor(Color.fromRGB(0, 0, 0));
						          lboots.setItemMeta(lch);
								
								p.getInventory().addItem(lboots);
								
							}else if(args[0].equalsIgnoreCase("red")) {
								
								ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lboots.getItemMeta();
						          lch.setColor(Color.fromRGB(255, 0, 0));
						          lboots.setItemMeta(lch);
						          
						          p.getInventory().addItem(lboots);
								
							}else if(args[0].equalsIgnoreCase("green")) {
								
								ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lboots.getItemMeta();
						          lch.setColor(Color.fromRGB(50, 165, 50));
						          lboots.setItemMeta(lch);
						          
						          p.getInventory().addItem(lboots);
								
							}else if(args[0].equalsIgnoreCase("brown")) {
								
								ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lboots.getItemMeta();
						          lch.setColor(Color.fromRGB(107, 81, 63));
						          lboots.setItemMeta(lch);
						          
						          p.getInventory().addItem(lboots);
								
							}else if(args[0].equalsIgnoreCase("blue")) {
								
								ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lboots.getItemMeta();
						          lch.setColor(Color.fromRGB(0, 171, 255));
						          lboots.setItemMeta(lch);
						          
						          p.getInventory().addItem(lboots);
								
							}else if(args[0].equalsIgnoreCase("purple")) {
								
								ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lboots.getItemMeta();
						          lch.setColor(Color.fromRGB(154, 0, 255));
						          lboots.setItemMeta(lch);
						          
						          p.getInventory().addItem(lboots);
								
							}else if(args[0].equalsIgnoreCase("gray")) {
								
								ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lboots.getItemMeta();
						          lch.setColor(Color.fromRGB(77, 77, 77));
						          lboots.setItemMeta(lch);
						          
						          p.getInventory().addItem(lboots);
								
							}else if(args[0].equalsIgnoreCase("lightgray")) {
								
								ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lboots.getItemMeta();
						          lch.setColor(Color.fromRGB(156, 153, 149));
						          lboots.setItemMeta(lch);
						          
						          p.getInventory().addItem(lboots);
								
							}else if(args[0].equalsIgnoreCase("pink")) {
								
								ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lboots.getItemMeta();
						          lch.setColor(Color.fromRGB(192, 21, 235));
						          lboots.setItemMeta(lch);
						          
						          p.getInventory().addItem(lboots);
								
							}else if(args[0].equalsIgnoreCase("cyan")) {
								
								ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lboots.getItemMeta();
						          lch.setColor(Color.fromRGB(45, 108, 124));
						          lboots.setItemMeta(lch);
						          
						          p.getInventory().addItem(lboots);
								
							}else if(args[0].equalsIgnoreCase("lightgreen")) {
								
								ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lboots.getItemMeta();
						          lch.setColor(Color.fromRGB(33, 247, 18));
						          lboots.setItemMeta(lch);
						          
						          p.getInventory().addItem(lboots);
								
							}else if(args[0].equalsIgnoreCase("yellow")) {
								
								ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lboots.getItemMeta();
						          lch.setColor(Color.fromRGB(217, 247, 18));
						          lboots.setItemMeta(lch);
						          
						          p.getInventory().addItem(lboots);
								
							}else if(args[0].equalsIgnoreCase("lightblue")) {
								
								ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lboots.getItemMeta();
						          lch.setColor(Color.fromRGB(33, 217, 223));
						          lboots.setItemMeta(lch);
						          
						          p.getInventory().addItem(lboots);
								
							}else if(args[0].equalsIgnoreCase("magenta")) {
								
								ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lboots.getItemMeta();
						          lch.setColor(Color.fromRGB(128, 33, 223));
						          lboots.setItemMeta(lch);
						          
						          p.getInventory().addItem(lboots);
								
							}else if(args[0].equalsIgnoreCase("orange")) {
								
								ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lboots.getItemMeta();
						          lch.setColor(Color.fromRGB(255, 171, 0));
						          lboots.setItemMeta(lch);
						          
						          p.getInventory().addItem(lboots);
								
							}else if(args[0].equalsIgnoreCase("white")) {
								
								ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS, 1);
						          LeatherArmorMeta lch = (LeatherArmorMeta)lboots.getItemMeta();
						          lch.setColor(Color.fromRGB(255, 255, 255));
						          lboots.setItemMeta(lch);
						          
						          p.getInventory().addItem(lboots);
								
							}else {
								p.sendMessage(ChatColor.RED + "Invalid color!");
								p.sendMessage(ChatColor.RED + "Use /colorlist to view colors!");
							}
							
						}else {
							p.sendMessage(ChatColor.RED + "You must have a peace of leather in your hand!");
						}
						
					}else {
						p.sendMessage(ChatColor.RED + "Usage: /dyearmor <color>");
						p.sendMessage(ChatColor.RED + "Use /colorlist to view colors!");
					}
					
				
				
				
				
			}else {
				p.sendMessage(Main.no_permission_donor);
			}
			}
		}
		return false;
	}

}

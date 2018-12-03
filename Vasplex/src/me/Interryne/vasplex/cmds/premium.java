package me.Interryne.vasplex.cmds;

import java.util.ArrayList;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.inventivetalent.menubuilder.inventory.InventoryMenuBuilder;
import org.inventivetalent.menubuilder.inventory.ItemListener;

import me.Interryne.vasplex.main.Main;
import net.md_5.bungee.api.ChatColor;

public class premium implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		
		
		if(command.getName().equalsIgnoreCase("premium")) {
			if(sender instanceof Player) {
				
				Player p = (Player) sender;
				
				if(p.hasPermission("vasplex.premium")) {
					

					
					ItemStack Spacer = new ItemStack(Material.NOTE_BLOCK, 1);
					
					ItemMeta Spacer_meta = Spacer.getItemMeta();
		        	
			        Spacer_meta.setDisplayName(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "Donator Menu");
			        
			        
			        ArrayList < String > Spacer_lore = new ArrayList < String > ();
			        Spacer_lore.add(ChatColor.LIGHT_PURPLE + "- Use special perks as a donator!");
			        Spacer_meta.setLore(Spacer_lore);
			        
			        Spacer.setItemMeta(Spacer_meta);
			        
			        ItemStack cleareffects = new ItemStack(Material.MILK_BUCKET, 1);
					
					ItemMeta cleareffects_meta = cleareffects.getItemMeta();
		        	
					cleareffects_meta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "Clear Potion Effects");
			        
			        ArrayList < String > cleareffects_lore = new ArrayList < String > ();
			        cleareffects_lore.add(ChatColor.YELLOW + "Remove all current potion effects!");
			        cleareffects_meta.setLore(cleareffects_lore);
			        
			        cleareffects.setItemMeta(cleareffects_meta);
			        
			        
					
					ItemStack Speed1 = new ItemStack(Material.LEATHER_BOOTS, 1);
					
					ItemMeta Speed1_meta = Speed1.getItemMeta();
		        	
			        Speed1_meta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "Speed I");
			        
			        
			        ArrayList < String > Speed1_lore = new ArrayList < String > ();
			        Speed1_lore.add(ChatColor.YELLOW + "Give yourself permanent Speed I!");
			        Speed1_meta.setLore(Speed1_lore);
			        
			        Speed1.setItemMeta(Speed1_meta);
			        
			        
			        ItemStack Speed2 = new ItemStack(Material.GOLD_BOOTS, 1);
			
					ItemMeta Speed2_meta = Speed2.getItemMeta();
		        	
			        Speed2_meta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "Speed II");
			        
			        ArrayList < String > Speed2_lore = new ArrayList < String > ();
			        Speed2_lore.add(ChatColor.YELLOW + "Give yourself permanent Speed II!");
			        Speed2_meta.setLore(Speed2_lore);
			        
			        Speed2.setItemMeta(Speed2_meta);
			        
			        
			        
			        
			        ItemStack Speed3 = new ItemStack(Material.IRON_BOOTS, 1);
					
					ItemMeta Speed3_meta = Speed3.getItemMeta();
		        	
					Speed3_meta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "Speed III");
			        
			        ArrayList < String > Speed3_lore = new ArrayList < String > ();
			        Speed3_lore.add(ChatColor.YELLOW + "Give yourself permanent Speed III!");
			        Speed3_meta.setLore(Speed3_lore);
			        
			        Speed3.setItemMeta(Speed3_meta);
			        
			        
			        
			        
			        
			        ItemStack Speed4 = new ItemStack(Material.DIAMOND_BOOTS, 1);
					
					ItemMeta Speed4_meta = Speed4.getItemMeta();
		        	
					Speed4_meta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "Speed IV");
			        
			        ArrayList < String > Speed4_lore = new ArrayList < String > ();
			        Speed4_lore.add(ChatColor.YELLOW + "Give yourself permanent Speed IV!");
			        Speed4_meta.setLore(Speed4_lore);
			        
			        Speed4.setItemMeta(Speed4_meta);
			        
			        
			        ItemStack NightVision = new ItemStack(Material.EYE_OF_ENDER, 1);
					
					ItemMeta NightVision_meta = NightVision.getItemMeta();
		        	
					NightVision_meta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "Night Vision");
			        
			        ArrayList < String > NightVision_lore = new ArrayList < String > ();
			        NightVision_lore.add(ChatColor.YELLOW + "Give yourself permanent Night Vision!");
			        NightVision_meta.setLore(NightVision_lore);
			        
			        NightVision.setItemMeta(NightVision_meta);
			        
			        ItemStack Invincibility = new ItemStack(Material.GOLDEN_APPLE, 1);
					
					ItemMeta Invincibility_meta = Invincibility.getItemMeta();
		        	
					Invincibility_meta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "Invincibility");
			        
			        ArrayList < String > Invincibility_lore = new ArrayList < String > ();
			        Invincibility_lore.add(ChatColor.YELLOW + "Give yourself permanent Regen and Resistance!");
			        Invincibility_meta.setLore(Invincibility_lore);
			        
			        Invincibility.setItemMeta(Invincibility_meta);
			        
			        
			        
			        ItemStack ViewColors = new ItemStack(Material.BOOK, 1);
					
					ItemMeta ViewColors_meta = Invincibility.getItemMeta();
		        	
					ViewColors_meta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "View Colors");
			        
			        ArrayList < String > ViewColors_lore = new ArrayList < String > ();
			        ViewColors_lore.add(ChatColor.YELLOW + "View the chat color codes you can use in chat!");
			        ViewColors_meta.setLore(ViewColors_lore);
			        
			        ViewColors.setItemMeta(ViewColors_meta);
			        
			        
			        
			        ItemStack WorldEdit = new ItemStack(Material.WOOD_AXE, 1);
					
					ItemMeta WorldEdit_meta = WorldEdit.getItemMeta();
		        	
					WorldEdit_meta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "World Edit Wand");
			        
			        ArrayList < String > WorldEdit_lore = new ArrayList < String > ();
			        WorldEdit_lore.add(ChatColor.YELLOW + "Obtain a world edit wand!");
			        WorldEdit_meta.setLore(WorldEdit_lore);
			        
			        WorldEdit.setItemMeta(WorldEdit_meta);
			        
			        
			        ItemStack Gamemode = new ItemStack(Material.DIAMOND_PICKAXE, 1);
					
					ItemMeta Gamemode_meta = Gamemode.getItemMeta();
		        	
					Gamemode_meta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "Change Gamemode");
			        
			        ArrayList < String > Gamemode_lore = new ArrayList < String > ();
			        Gamemode_lore.add(ChatColor.YELLOW + "Click to switch from your current gamemode!");
			        Gamemode_meta.setLore(Gamemode_lore);
			        
			        Gamemode.setItemMeta(Gamemode_meta);
			        
			        
			        //TODO: Seperate
			        
			        ItemStack SuperTools = new ItemStack(Material.DIAMOND_SWORD, 1);
					
					ItemMeta SuperTools_meta = SuperTools.getItemMeta();
					
					SuperTools_meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
					
				    SuperTools_meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		        	
					SuperTools_meta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "Super Tools");
			        
			        ArrayList < String > SuperTools_lore = new ArrayList < String > ();
			        SuperTools_lore.add(ChatColor.YELLOW + "Click to open a gui to gain " + ChatColor.LIGHT_PURPLE + "Super Enchanted " + ChatColor.YELLOW + "items!");
			        SuperTools_meta.setLore(SuperTools_lore);
			        
			        SuperTools.setItemMeta(SuperTools_meta);
			        
			        
			        ItemStack SpecialItems = new ItemStack(Material.WORKBENCH, 1);
					
					ItemMeta SpecialItems_meta = SpecialItems.getItemMeta();
		        	
					SpecialItems_meta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "Special Items");
			        
			        ArrayList < String > SpecialItems_lore = new ArrayList < String > ();
			        SpecialItems_lore.add(ChatColor.YELLOW + "Click to open a gui to use special items");
			        SpecialItems_lore.add(ChatColor.GRAY + "Ex: Barriers, Dragon Egg, etc...");
			        SpecialItems_meta.setLore(SpecialItems_lore);
			        
			        SpecialItems.setItemMeta(SpecialItems_meta);
			        
			        
			        ItemStack Heal = new ItemStack(Material.APPLE, 1);
					
					ItemMeta Heal_meta = Heal.getItemMeta();
		        	
					Heal_meta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "Heal");
			        
			        ArrayList < String > Heal_lore = new ArrayList < String > ();
			        Heal_lore.add(ChatColor.YELLOW + "Click to restore all health and hunger.");
			        Heal_meta.setLore(Heal_lore);
			        
			        Heal.setItemMeta(Heal_meta);
			        
			        
			        ItemStack Skulls = new ItemStack(Material.SKULL_ITEM, 1);
					
					ItemMeta Skulls_meta = Skulls.getItemMeta();
		        	
					Skulls_meta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "More Skulls");
			        
			        ArrayList < String > Skulls_lore = new ArrayList < String > ();
			        Skulls_lore.add(ChatColor.YELLOW + "Click to get access to a ton of different skulls!");
			        Skulls_meta.setLore(Skulls_lore);
			        
			        Skulls.setItemMeta(Skulls_meta);
			        
			        
			        final InventoryMenuBuilder donatormenu = new InventoryMenuBuilder(54, ChatColor.DARK_PURPLE.toString() + "Donator Perks!");
			        
			   
			        
			        donatormenu.withItem(0, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        
			        donatormenu.withItem(1, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        donatormenu.withItem(2, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        donatormenu.withItem(3, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        donatormenu.withItem(4, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        
			        donatormenu.withItem(5, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        
			        donatormenu.withItem(6, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        donatormenu.withItem(7, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        donatormenu.withItem(8, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        donatormenu.withItem(9, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        
			        donatormenu.withItem(17, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        
			        donatormenu.withItem(18, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        
			        donatormenu.withItem(26, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        donatormenu.withItem(27, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        donatormenu.withItem(35, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			    
			        donatormenu.withItem(36, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        donatormenu.withItem(44, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        
			        donatormenu.withItem(45, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        donatormenu.withItem(46, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        donatormenu.withItem(47, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        donatormenu.withItem(48, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        donatormenu.withItem(49, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        donatormenu.withItem(50, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        donatormenu.withItem(51, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        donatormenu.withItem(52, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        donatormenu.withItem(53, Spacer, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {

			            	//nothing :D
			            }
			           }, ClickType.LEFT).show(p);
			        
			        donatormenu.withItem(10, cleareffects, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {


			            	for (PotionEffect effect : p.getActivePotionEffects()) {
			            		p.removePotionEffect(effect.getType());
			            	}
			            	
			            	p.sendMessage(ChatColor.GREEN + "Removed all potion effects!");

			            }
			           }, ClickType.LEFT);
			        
					
			        donatormenu.withItem(11, Speed1, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {


			            	p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0, true, false));
			            	
			            	p.sendMessage(ChatColor.GREEN + "You now have " + ChatColor.GOLD + "Speed I");

			            }
			           }, ClickType.LEFT);
			        
			        donatormenu.withItem(12, Speed2, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {


			            	p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1, true, false));
			            	p.sendMessage(ChatColor.GREEN + "You now have " + ChatColor.GOLD + "Speed II");
			            }
			           }, ClickType.LEFT);
			        
			        donatormenu.withItem(13, Speed3, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {


			            	p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2, true, false));
			            	p.sendMessage(ChatColor.GREEN + "You now have " + ChatColor.GOLD + "Speed III");
			            }
			           }, ClickType.LEFT);
			        
			        donatormenu.withItem(14, Speed4, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {


			            	p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3, true, false));
			            	p.sendMessage(ChatColor.GREEN + "You now have " + ChatColor.GOLD + "Speed IV");
			            }
			           }, ClickType.LEFT);
			        
			        donatormenu.withItem(15, NightVision, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {


			            	p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, Integer.MAX_VALUE, 1, true, false));
			            	p.sendMessage(ChatColor.GREEN + "You now have " + ChatColor.GOLD + "Night Vision II");
			            }
			           }, ClickType.LEFT);
			        
			        donatormenu.withItem(16, Invincibility, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {


			            	p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Integer.MAX_VALUE, 2, true, false));
			            	p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 2, true, false));
			            	p.sendMessage(ChatColor.GREEN + "You now have " + ChatColor.GOLD + "Regeneration III and Resistance III");
			            }
			           }, ClickType.LEFT);
			        
			        donatormenu.withItem(39, ViewColors, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {
			            	
			            	p.sendMessage(ChatColor.GOLD + "Put these infront of any chat message!");
			            	p.sendMessage(ChatColor.GRAY + "Example: " + ChatColor.WHITE + "&cHello there!");
			            	p.sendMessage(ChatColor.DARK_BLUE + "&1 - Dark Blue");
			            	p.sendMessage(ChatColor.DARK_GREEN + "&2 - Dark Green");
			            	p.sendMessage(ChatColor.DARK_AQUA + "&3 - Dark Aqua");
			            	p.sendMessage(ChatColor.DARK_RED + "&4 - Dark Red");
			            	p.sendMessage(ChatColor.DARK_PURPLE + "&5 - Dark Purple");
			            	p.sendMessage(ChatColor.GOLD + "&6 - Gold");
			            	p.sendMessage(ChatColor.GRAY + "&7 - Gray");
			            	p.sendMessage(ChatColor.DARK_GRAY + "&8 - Dark Gray");
			            	p.sendMessage(ChatColor.BLUE + "&9 - Blue");
			            	p.sendMessage(ChatColor.BLACK + "&0 - Black");
			            	p.sendMessage(ChatColor.GREEN + "&a - Green");
			            	p.sendMessage(ChatColor.LIGHT_PURPLE + "&d - Light Purple");
			            	p.sendMessage(ChatColor.YELLOW + "&e - Yellow");
			            	p.sendMessage(ChatColor.WHITE + "&f - White");
			            	p.sendMessage(ChatColor.RED + "&c - Red");
			            	
			            	p.closeInventory();
			            }
			           }, ClickType.LEFT);
			        
			        donatormenu.withItem(40, WorldEdit, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {
			            	
			            	p.sendMessage(ChatColor.GOLD + "You have recieved a W/E wand!");
			            	
			            	ItemStack Wand = new ItemStack(Material.WOOD_AXE, 1);
							Wand.getItemMeta().setDisplayName(ChatColor.GOLD.toString() + ChatColor.BOLD.toString() + "World Edit Wand");
							
							ItemMeta meta = Wand.getItemMeta();
				        	
							meta.setDisplayName(ChatColor.GREEN.toString() + ChatColor.BOLD.toString() + "WorldEdit Wand!");
							
							Wand.setItemMeta(meta);
							
							p.getInventory().addItem(Wand);
							
							p.closeInventory();
			            }
			           }, ClickType.LEFT);
			        
			        donatormenu.withItem(37, Heal, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {
			            	
			            	p.sendMessage(ChatColor.GREEN + "Health and hunger restored.");
			            	p.setHealth(20);
			            	p.setFoodLevel(20);
			            	p.setSaturation(20);
			            }
			           }, ClickType.LEFT);
			        
			        
			        donatormenu.withItem(37, Heal, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {
			            	
			            	p.setHealth(20);
			            	p.setFoodLevel(20);
			            	p.setSaturation(20);
			            }
			           }, ClickType.LEFT);
			        
			        donatormenu.withItem(43, Skulls, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {
			            	
			            	p.performCommand("heads");
			            }
			           }, ClickType.LEFT);
			        
			        donatormenu.withItem(41, Gamemode, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {
			            	
			            	if(p.getGameMode() == GameMode.CREATIVE) {
			            		
			            		p.setGameMode(GameMode.SURVIVAL);
			            		p.sendMessage(ChatColor.YELLOW + "Changed gamemode to SURVIVAL!");
			            		
			            	}else if(p.getGameMode() == GameMode.SURVIVAL) {
			            		
			            		p.setGameMode(GameMode.CREATIVE);
			            		p.sendMessage(ChatColor.YELLOW + "Changed gamemode to CREATIVE!");
			            		
			            	}else {
			            		p.sendMessage(ChatColor.RED + "Error, will only work with GMS and GMC!");
			            	}
			            	
			            	p.closeInventory();
			            }
			           }, ClickType.LEFT);
			        
			        
			        donatormenu.withItem(28, SuperTools, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {
			            	
			          //  SuperToolsMenu.show(p);
			            p.sendMessage(ChatColor.YELLOW + "Opening SuperTools GUI!");
			            
			            
			            final InventoryMenuBuilder SuperToolsMenu = new InventoryMenuBuilder(9, ChatColor.DARK_PURPLE.toString() + "Super Tools");
						
						ItemStack SuperPickaxe = new ItemStack(Material.DIAMOND_PICKAXE, 1);
						
						ItemMeta SuperPickaxe_meta = SuperPickaxe.getItemMeta();
			        	
						SuperPickaxe_meta.setDisplayName(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "Super Pickaxe");
				        
						SuperPickaxe_meta.addEnchant(Enchantment.DIG_SPEED, 10, true);
						SuperPickaxe_meta.addEnchant(Enchantment.DURABILITY, 10, true);
				        
				        ArrayList < String > SuperPickaxe_lore = new ArrayList < String > ();
				        SuperPickaxe_lore.add(ChatColor.LIGHT_PURPLE + "- Super Tool -");
				        SuperPickaxe_meta.setLore(SuperPickaxe_lore);
				        
				        SuperPickaxe.setItemMeta(SuperPickaxe_meta);
				        
				        
				        
				        ItemStack SuperSword = new ItemStack(Material.DIAMOND_SWORD, 1);
						
						ItemMeta SuperSword_meta = SuperSword.getItemMeta();
			        	
						SuperSword_meta.setDisplayName(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "Super Sword");
				        
						SuperSword_meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
						SuperSword_meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 10, true);
						SuperSword_meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 10, true);
						SuperSword_meta.addEnchant(Enchantment.FIRE_ASPECT, 10, true);
						SuperSword_meta.addEnchant(Enchantment.DURABILITY, 10, true);
				        
				        ArrayList < String > SuperSword_lore = new ArrayList < String > ();
				        SuperSword_lore.add(ChatColor.LIGHT_PURPLE + "- Super Tool -");
				        SuperSword_meta.setLore(SuperSword_lore);
				        
				        SuperSword.setItemMeta(SuperSword_meta);
				        
				        
				        ItemStack SuperFAS = new ItemStack(Material.FLINT_AND_STEEL, 1);
						
						ItemMeta SuperFAS_meta = SuperFAS.getItemMeta();
			        	
						SuperFAS_meta.setDisplayName(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "Super Flint and Steel");
				        
						SuperFAS_meta.addEnchant(Enchantment.DURABILITY, 10, true);
				        
				        ArrayList < String > SuperFAS_lore = new ArrayList < String > ();
				        SuperFAS_lore.add(ChatColor.LIGHT_PURPLE + "- Super Tool -");
				        SuperFAS_meta.setLore(SuperFAS_lore);
				        
				        SuperFAS.setItemMeta(SuperFAS_meta);
				        
				        
				        ItemStack SuperRod = new ItemStack(Material.FISHING_ROD, 1);
						
						ItemMeta SuperRod_meta = SuperRod.getItemMeta();
			        	
						SuperRod_meta.setDisplayName(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "Super Fishing Rod");
				        
						SuperRod_meta.addEnchant(Enchantment.DURABILITY, 10, true);
						SuperRod_meta.addEnchant(Enchantment.LUCK, 10, true);
						SuperRod_meta.addEnchant(Enchantment.LURE, 10, true);
				        
				        ArrayList < String > SuperRod_lore = new ArrayList < String > ();
				        SuperRod_lore.add(ChatColor.LIGHT_PURPLE + "- Super Tool -");
				        SuperRod_meta.setLore(SuperRod_lore);
				        
				        SuperRod.setItemMeta(SuperRod_meta);
				        
				        
				        ItemStack SuperHelmet = new ItemStack(Material.DIAMOND_HELMET, 1);
						
						ItemMeta SuperHelmet_meta = SuperHelmet.getItemMeta();
			        	
						SuperHelmet_meta.setDisplayName(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "Super Helmet");
				        
						SuperHelmet_meta.addEnchant(Enchantment.DURABILITY, 10, true);
						SuperHelmet_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
						SuperHelmet_meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10, true);
						SuperHelmet_meta.addEnchant(Enchantment.PROTECTION_FIRE, 10, true);
						SuperHelmet_meta.addEnchant(Enchantment.THORNS, 5, true);
				        
				        ArrayList < String > SuperHelmet_lore = new ArrayList < String > ();
				        SuperHelmet_lore.add(ChatColor.LIGHT_PURPLE + "- Super Tool -");
				        SuperHelmet_meta.setLore(SuperHelmet_lore);
				        
				        SuperHelmet.setItemMeta(SuperHelmet_meta);
				        
				        ItemStack SuperChestplate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
						
						ItemMeta SuperChestplate_meta = SuperChestplate.getItemMeta();
			        	
						SuperChestplate_meta.setDisplayName(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "Super Chestplate");
				        
						SuperChestplate_meta.addEnchant(Enchantment.DURABILITY, 10, true);
						SuperChestplate_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
						SuperChestplate_meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10, true);
						SuperChestplate_meta.addEnchant(Enchantment.PROTECTION_FIRE, 10, true);
						SuperChestplate_meta.addEnchant(Enchantment.THORNS, 5, true);
				        
				        ArrayList < String > SuperChestplate_lore = new ArrayList < String > ();
				        SuperChestplate_lore.add(ChatColor.LIGHT_PURPLE + "- Super Tool -");
				        SuperChestplate_meta.setLore(SuperChestplate_lore);
				        
				        SuperChestplate.setItemMeta(SuperChestplate_meta);
				        
				        ItemStack SuperLeggings = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
						
						ItemMeta SuperLeggings_meta = SuperLeggings.getItemMeta();
			        	
						SuperLeggings_meta.setDisplayName(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "Super Leggings");
				        
						SuperLeggings_meta.addEnchant(Enchantment.DURABILITY, 10, true);
						SuperLeggings_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
						SuperLeggings_meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10, true);
						SuperLeggings_meta.addEnchant(Enchantment.PROTECTION_FIRE, 10, true);
						SuperLeggings_meta.addEnchant(Enchantment.THORNS, 5, true);
				        
				        ArrayList < String > SuperLeggings_lore = new ArrayList < String > ();
				        SuperLeggings_lore.add(ChatColor.LIGHT_PURPLE + "- Super Tool -");
				        SuperLeggings_meta.setLore(SuperLeggings_lore);
				        
				        SuperLeggings.setItemMeta(SuperLeggings_meta);
				        
				        ItemStack SuperBoots = new ItemStack(Material.DIAMOND_BOOTS, 1);
						
						ItemMeta SuperBoots_meta = SuperBoots.getItemMeta();
			        	
						SuperBoots_meta.setDisplayName(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "Super Boots");
				        
						SuperBoots_meta.addEnchant(Enchantment.DURABILITY, 10, true);
						SuperBoots_meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
						SuperBoots_meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10, true);
						SuperBoots_meta.addEnchant(Enchantment.PROTECTION_FIRE, 10, true);
						SuperBoots_meta.addEnchant(Enchantment.THORNS, 5, true);
						SuperBoots_meta.addEnchant(Enchantment.PROTECTION_FALL, 5, true);
						
				        
				        ArrayList < String > SuperBoots_lore = new ArrayList < String > ();
				        SuperBoots_lore.add(ChatColor.LIGHT_PURPLE + "- Super Tool -");
				        SuperBoots_meta.setLore(SuperBoots_lore);
				        
				        SuperBoots.setItemMeta(SuperBoots_meta);
				        
				        
				        ItemStack BackArrow = new ItemStack(Material.ARROW, 1);
						
						ItemMeta BackArrow_meta = BackArrow.getItemMeta();
			        	
						BackArrow_meta.setDisplayName(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "Back");
				        
				        ArrayList < String > BackArrow_lore = new ArrayList < String > ();
				        BackArrow_lore.add(ChatColor.LIGHT_PURPLE + "Click to go back to the main GUI!");
				        BackArrow_meta.setLore(BackArrow_lore);
				        
				        BackArrow.setItemMeta(BackArrow_meta);
			            
			           
				        
				        SuperToolsMenu.withItem(0, SuperPickaxe, new ItemListener() {
				            @Override
				            public void onInteract(Player p, ClickType action, ItemStack item) {

				            	p.getInventory().addItem(SuperPickaxe);
				            	
				            }
				           }, ClickType.LEFT).show(p);
			            
				        SuperToolsMenu.withItem(1, SuperSword, new ItemListener() {
				            @Override
				            public void onInteract(Player p, ClickType action, ItemStack item) {

				            	p.getInventory().addItem(SuperSword);
				            	
				            }
				           }, ClickType.LEFT).show(p);
				        
				        SuperToolsMenu.withItem(2, SuperFAS, new ItemListener() {
				            @Override
				            public void onInteract(Player p, ClickType action, ItemStack item) {

				            	p.getInventory().addItem(SuperFAS);
				            	
				            }
				           }, ClickType.LEFT).show(p);
				        
				        SuperToolsMenu.withItem(3, SuperRod, new ItemListener() {
				            @Override
				            public void onInteract(Player p, ClickType action, ItemStack item) {

				            	p.getInventory().addItem(SuperRod);
				            	
				            }
				           }, ClickType.LEFT).show(p);
				        
				        SuperToolsMenu.withItem(4, SuperHelmet, new ItemListener() {
				            @Override
				            public void onInteract(Player p, ClickType action, ItemStack item) {

				            	p.getInventory().addItem(SuperHelmet);
				            	
				            }
				           }, ClickType.LEFT).show(p);
				        
				        SuperToolsMenu.withItem(5, SuperChestplate, new ItemListener() {
				            @Override
				            public void onInteract(Player p, ClickType action, ItemStack item) {

				            	p.getInventory().addItem(SuperChestplate);
				            	
				            }
				           }, ClickType.LEFT).show(p);
				        
				        SuperToolsMenu.withItem(6, SuperLeggings, new ItemListener() {
				            @Override
				            public void onInteract(Player p, ClickType action, ItemStack item) {

				            	p.getInventory().addItem(SuperLeggings);
				            	
				            }
				           }, ClickType.LEFT).show(p);
				        
				        SuperToolsMenu.withItem(7, SuperBoots, new ItemListener() {
				            @Override
				            public void onInteract(Player p, ClickType action, ItemStack item) {

				            	p.getInventory().addItem(SuperBoots);
				            	
				            }
				           }, ClickType.LEFT).show(p);
				        
				        SuperToolsMenu.withItem(8, BackArrow, new ItemListener() {
				            @Override
				            public void onInteract(Player p, ClickType action, ItemStack item) {

				            	p.closeInventory();
				            	
				            	donatormenu.show(p);
				            }
				           }, ClickType.LEFT).show(p);
			            	
			            	
			            }
			           }, ClickType.LEFT);
			        
			        
			        
			        donatormenu.withItem(34, SpecialItems, new ItemListener() {
			            @Override
			            public void onInteract(Player p, ClickType action, ItemStack item) {
			            	
			            	//SpecialItemsMenu.show(p);
			            	p.sendMessage(ChatColor.YELLOW + "Opening SpecialItems GUI!");	
			            	
			            	
			            	final InventoryMenuBuilder SpecialItemsMenu = new InventoryMenuBuilder(18, ChatColor.DARK_PURPLE.toString() + "Special Items");
							
							ItemStack Barrier = new ItemStack(Material.BARRIER, 1);
							
							ItemMeta Barrier_meta = Barrier.getItemMeta();
				        	
							Barrier_meta.setDisplayName(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "Barrier");
					        
					        
					        ArrayList < String > Barrier_lore = new ArrayList < String > ();
					        Barrier_lore.add(ChatColor.LIGHT_PURPLE + "Barrier Block from PREMIUM Menu!");
					        Barrier_meta.setLore(Barrier_lore);
					        
					        Barrier.setItemMeta(Barrier_meta);
					        
					        
					        ItemStack DragonEgg = new ItemStack(Material.DRAGON_EGG, 1);
							
							ItemMeta DragonEgg_meta = DragonEgg.getItemMeta();
				        	
							DragonEgg_meta.setDisplayName(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "Dragon Egg");
					        
					        ArrayList < String > DragonEgg_lore = new ArrayList < String > ();
					        DragonEgg_lore.add(ChatColor.LIGHT_PURPLE + "Dragon Egg from PREMIUM Menu!");
					        DragonEgg_meta.setLore(DragonEgg_lore);
					        
					        DragonEgg.setItemMeta(DragonEgg_meta);
					        
					        ItemStack Spawner = new ItemStack(Material.MOB_SPAWNER, 1);
							
							ItemMeta Spawner_meta = Spawner.getItemMeta();
				        	
							Spawner_meta.setDisplayName(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "Mob Spawner");
					        
					        ArrayList < String > Spawner_lore = new ArrayList < String > ();
					        Spawner_lore.add(ChatColor.LIGHT_PURPLE + "Spawner from premium menu!");
					        Spawner_meta.setLore(Spawner_lore);
					        
					        Spawner.setItemMeta(Spawner_meta);
					        
					        ItemStack CommandMinecart = new ItemStack(Material.COMMAND_MINECART, 1);
							
							ItemMeta CommandMinecart_meta = CommandMinecart.getItemMeta();
				        	
							CommandMinecart_meta.setDisplayName(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "Command Minecart");
					        
					        ArrayList < String > CommandMinecart_lore = new ArrayList < String > ();
					        CommandMinecart_lore.add(ChatColor.LIGHT_PURPLE + "Command Minecart from PREMIUM Menu!");
					        CommandMinecart_meta.setLore(CommandMinecart_lore);
					        
					        CommandMinecart.setItemMeta(CommandMinecart_meta);
					        
					        
					        
					        @SuppressWarnings("deprecation")
							ItemStack CommandBlock = new ItemStack(Material.getMaterial(137), 1);
							
							ItemMeta CommandBlock_meta = CommandBlock.getItemMeta();
				        	
							CommandBlock_meta.setDisplayName(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "Command Block");
					        
					        ArrayList < String > CommandBlock_lore = new ArrayList < String > ();
					        CommandBlock_lore.add(ChatColor.LIGHT_PURPLE + "Command Block from PREMIUM Menu!");
					        CommandBlock_meta.setLore(CommandBlock_lore);
					        
					        CommandBlock.setItemMeta(CommandBlock_meta);
					        
					        ItemStack BackArrow = new ItemStack(Material.ARROW, 1);
							
							ItemMeta BackArrow_meta = BackArrow.getItemMeta();
				        	
							BackArrow_meta.setDisplayName(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "Back");
					        
					        ArrayList < String > BackArrow_lore = new ArrayList < String > ();
					        BackArrow_lore.add(ChatColor.LIGHT_PURPLE + "Click to go back to the main GUI!");
					        BackArrow_meta.setLore(BackArrow_lore);
					        
					        BackArrow.setItemMeta(BackArrow_meta);
				            
				           
					        
					        SpecialItemsMenu.withItem(0, Barrier, new ItemListener() {
					            @Override
					            public void onInteract(Player p, ClickType action, ItemStack item) {

					            	p.getInventory().addItem(Barrier);
					            }
					           }, ClickType.LEFT).show(p);
					        
					        SpecialItemsMenu.withItem(1, DragonEgg, new ItemListener() {
					            @Override
					            public void onInteract(Player p, ClickType action, ItemStack item) {

					            	p.getInventory().addItem(DragonEgg);
					            }
					           }, ClickType.LEFT).show(p);
			            	
					        SpecialItemsMenu.withItem(2, Spawner, new ItemListener() {
					            @Override
					            public void onInteract(Player p, ClickType action, ItemStack item) {

					            	p.getInventory().addItem(Spawner);
					            }
					           }, ClickType.LEFT).show(p);
					        
					        SpecialItemsMenu.withItem(3, CommandMinecart, new ItemListener() {
					            @Override
					            public void onInteract(Player p, ClickType action, ItemStack item) {

					            	p.getInventory().addItem(CommandMinecart);
					            }
					           }, ClickType.LEFT).show(p);
					        
					        SpecialItemsMenu.withItem(4, CommandBlock, new ItemListener() {
					            @Override
					            public void onInteract(Player p, ClickType action, ItemStack item) {

					            	p.getInventory().addItem(CommandBlock);
					            }
					           }, ClickType.LEFT).show(p);
					        
					        SpecialItemsMenu.withItem(17, BackArrow, new ItemListener() {
					            @Override
					            public void onInteract(Player p, ClickType action, ItemStack item) {

					            	p.closeInventory();
					            	donatormenu.show(p);
					            }
					           }, ClickType.LEFT).show(p);
			            	
			            }
			           }, ClickType.LEFT);
			        
			        
			        
				}else {
					p.sendMessage(Main.no_permission_donor);
				}
				
			}else {
				sender.sendMessage(ChatColor.RED + "Must be a player!");
			}
		}
		
		return false;
	}

}

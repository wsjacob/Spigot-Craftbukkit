package me.Interryne.vasplex.events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import net.md_5.bungee.api.ChatColor;



public class noRedstone implements Listener {
	
	@SuppressWarnings("deprecation")
	@EventHandler
	
	public void onRedstonePlace(BlockPlaceEvent e) {
		
		Player player = e.getPlayer();
        Block block = e.getBlock();
        
        if(!player.hasPermission("vasplex.premium")) {
        	
        	 if (e.getBlock().getType() == Material.REDSTONE || e.getBlock().getType() == Material.REDSTONE_BLOCK || e.getBlock().getType() == Material.REDSTONE_WIRE || e.getBlock().getType() == Material.GLOWING_REDSTONE_ORE || e.getBlock().getType() == Material.DRAGON_EGG || e.getBlock().getType() == Material.BARRIER || e.getBlock().getType() == Material.TNT || e.getBlock().getType() == Material.DISPENSER || e.getBlock().getType() == Material.LAVA_BUCKET || e.getBlock().getType() == Material.LAVA || e.getBlock().getType() == Material.STATIONARY_LAVA || e.getBlock().getType() == Material.MOB_SPAWNER || e.getBlock().getType() == Material.JUKEBOX || e.getBlock().getType() == Material.EXPLOSIVE_MINECART || e.getBlock().getType() == Material.COMMAND_MINECART || e.getBlock().getType() == Material.HOPPER_MINECART || e.getBlock().getType() == Material.STORAGE_MINECART || e.getBlock().getType() == Material.getMaterial(137))  {
             	try {
             	e.setCancelled(true);
                player.sendMessage(ChatColor.RED + "Upgrade your rank to premium to place this block!");
             	block.breakNaturally();
             	}catch(Exception exception) {
             	e.setCancelled(true);
             	player.sendMessage(ChatColor.RED + "Upgrade your rank to premium to place this block!");
             	}
        }
        	
        }
            
    }
		
	}



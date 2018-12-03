package me.Interryne.vasplex.cmds.fun;

import java.util.Random;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class playrandomasssound implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		
		if(command.getName().equalsIgnoreCase("playarandomasssound")) {
			
			if(sender instanceof Player) {
				
				Player p = (Player) sender;
				
				p.sendMessage(ChatColor.GREEN + "Playing sound...");
				
				Random rand = new Random();

				int n = rand.nextInt(35) + 1;
				//30 is the maximum and the 1 is our minimum
				
				if(n == 1) {
					p.playSound(p.getLocation(), Sound.HORSE_ANGRY, 100, 100);
				}else if(n == 2) {
					p.playSound(p.getLocation(), Sound.SPLASH, 100, 100);
				}else if(n == 2) {
					p.playSound(p.getLocation(), Sound.HORSE_ZOMBIE_IDLE, 100, 100);
				}else if(n == 3) {
					p.playSound(p.getLocation(), Sound.FIREWORK_LAUNCH, 100, 100);
				}else if(n == 4) {
					p.playSound(p.getLocation(), Sound.SWIM, 100, 100);
				}else if(n == 5) {
					p.playSound(p.getLocation(), Sound.WITHER_SPAWN, 100, 100);
				}else if(n == 6) {
					p.playSound(p.getLocation(), Sound.ZOMBIE_WOODBREAK, 100, 100);
				}else if(n == 7) {
					p.playSound(p.getLocation(), Sound.PORTAL_TRAVEL, 100, 100);
				}else if(n == 8) {
					p.playSound(p.getLocation(), Sound.ZOMBIE_WALK, 100, 100);
				}else if(n == 9) {
					p.playSound(p.getLocation(), Sound.FIREWORK_BLAST, 100, 100);
				}else if(n == 10){
					p.playSound(p.getLocation(), Sound.GLASS, 100, 100);
				}else if(n == 11) {
					p.playSound(p.getLocation(), Sound.FIRE, 100, 100);
				}else if(n == 12) {
					p.playSound(p.getLocation(), Sound.WOLF_PANT, 100, 100);
				}else if(n == 13) {
					p.playSound(p.getLocation(), Sound.STEP_LADDER, 100, 100);
				}else if(n == 14) {
					p.playSound(p.getLocation(), Sound.AMBIENCE_CAVE, 100, 100);
				}else if(n == 15) {
					p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 100, 100);
				}else if(n == 16) {
					p.playSound(p.getLocation(), Sound.DIG_SAND, 100, 100);
				}else if(n == 17){
					p.playSound(p.getLocation(), Sound.DRINK, 100, 100);
				}else if(n == 18) {
					p.playSound(p.getLocation(), Sound.CHICKEN_HURT, 100, 100);
				}else if(n == 19) {
					p.playSound(p.getLocation(), Sound.BAT_DEATH, 100, 100);
				}else if(n == 20) {
					p.playSound(p.getLocation(), Sound.AMBIENCE_RAIN, 100, 100);
				}else if(n == 21) {
					p.playSound(p.getLocation(), Sound.ZOMBIE_PIG_IDLE, 100, 100);
				}else if(n == 22) {
					p.playSound(p.getLocation(), Sound.CAT_PURREOW, 100, 100);
				}else if (n == 23){
					p.playSound(p.getLocation(), Sound.FALL_BIG, 100, 100);
				}else if(n == 24) {
					p.playSound(p.getLocation(), Sound.CHEST_CLOSE, 100, 100);
				}else if(n == 25) {
					p.playSound(p.getLocation(), Sound.ENDERMAN_HIT, 100, 100);
				}else if(n == 26) {
					p.playSound(p.getLocation(), Sound.ZOMBIE_METAL, 100, 100);
				}else if(n == 27) {
					p.playSound(p.getLocation(), Sound.ZOMBIE_PIG_DEATH, 100, 100);
				}else if(n == 28) {
					p.playSound(p.getLocation(), Sound.WOOD_CLICK, 100, 100);
				}else if(n == 29) {
					p.playSound(p.getLocation(), Sound.COW_WALK, 100, 100);
				}else if(n == 30) {
					p.playSound(p.getLocation(), Sound.WITHER_IDLE, 100, 100);
				}else if(n == 31){
					p.playSound(p.getLocation(), Sound.CLICK, 100, 100);
				}else if(n == 32){
					p.playSound(p.getLocation(), Sound.EAT, 100, 100);
				}else if(n == 33){
					p.playSound(p.getLocation(), Sound.ENDERMAN_STARE, 100, 100);
				}else if(n == 34){
					p.playSound(p.getLocation(), Sound.IRONGOLEM_THROW, 100, 100);
				}else if(n == 35){
					p.playSound(p.getLocation(), Sound.NOTE_BASS_GUITAR, 100, 100);
				}else {
					p.sendMessage(ChatColor.RED + "Could not get a valid sound! Try againe!");
				}
			
			}
		}
		return false;
	}

}

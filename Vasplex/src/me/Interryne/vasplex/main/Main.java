package me.Interryne.vasplex.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.Interryne.vasplex.cmds.*;
import me.Interryne.vasplex.cmds.fun.*;
import me.Interryne.vasplex.cmds.fun.hello;
import me.Interryne.vasplex.cmds.staff.*;
import me.Interryne.vasplex.events.noPotions;
import me.Interryne.vasplex.events.noRedstone;
import me.Interryne.vasplex.events.onPlayerJoin;
import me.Interryne.vasplex.events.playerChatEvent;
import me.Interryne.vasplex.events.quickmathsEvent;
import me.Interryne.vasplex.events.signPlaceEvent;
import me.Interryne.vasplex.events.stopColons;
import me.Interryne.vasplex.events.lockdown.cancelBlockBreak;
import me.Interryne.vasplex.events.lockdown.cancelBlockPlace;
import me.Interryne.vasplex.events.lockdown.cancelCommands;
import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {
	
	private static Main instance;
	
	public String pdf = this.getDescription().getVersion();
	
	public static String no_permission = ChatColor.RED + "You are not allowed to do this!";
	
	public static String no_permission_donor = ChatColor.RED + "You must be PREMIUM rank to use this command. You can purchase premium at creativevn.tebex.io!";
	
	public static String Server_IP = ChatColor.YELLOW + "The IP is play.vasplex.net";
	
	public static String Server_Store = ChatColor.YELLOW + "creativevn.tebex.io";
	
	public static boolean quickMathsEnabled = false;
	
	public static boolean lockdownEnabled = false;
	
	public static String Stable = "Not Tested";
	
	public static String badLanguage = ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Please do not use swear words, or dissrespectful messages!";
	
	public static String badLanguageSign = ChatColor.RED.toString() + ChatColor.BOLD.toString() + "Sign removed for bad language!";
	
	//TODO: Update Changelog in main class

	
	public static final String changeLogHeader = "§8<---------- §6§lChange Log §8 ---------->";
	public static final String chLine1 = "§8* " + "§6" + "Bug Fixes:";
	public static final String chLine2 = "§8* " + "§e" + "You can now use colons in w/e again.";
	public static final String chLine3 = "§8* " + "§e" + "Swear filter dosent block random words.";
	public static final String chLine4 = "§8* " + "§e" + "/unstuck doesn't bug out anymore.";
	public static final String chLine5 = "§8* " + "§6" + "Additions:";
	public static final String chLine6 = "§8* " + "§e" + "2 New quickmaths problems!";
	
	public static Main getInstance() {
		return instance;
		}
	
	public void registerCommands() {
		getCommand("vpversion").setExecutor(new vpversion(this));
		getCommand("ip").setExecutor(new ip());
		getCommand("cc").setExecutor(new clearchat());
		getCommand("checkworldhealth").setExecutor(new checkworldhealth());
		getCommand("play").setExecutor(new play());
		getCommand("quickmaths").setExecutor(new quickmaths());
		getCommand("wp").setExecutor(new wp());
		getCommand("lol").setExecutor(new lol());
		getCommand("hello").setExecutor(new hello());
		getCommand("playarandomasssound").setExecutor(new playrandomasssound());
		getCommand("unstuck").setExecutor(new unstuck());
		getCommand("testquickmathsenabled").setExecutor(new testquickmathsenabled());
		getCommand("premium").setExecutor(new premium());
		getCommand("changelog").setExecutor(new changelog());
		getCommand("rules").setExecutor(new rules());
		getCommand("dyearmor").setExecutor(new dyearmor());
		getCommand("colorlist").setExecutor(new colorlist());
		getCommand("pcc").setExecutor(new pcc());
		getCommand("help").setExecutor(new help());
		getCommand("id").setExecutor(new id());
		getCommand("store").setExecutor(new store());
		getCommand("about").setExecutor(new about());
		getCommand("launch").setExecutor(new launch());
		getCommand("lockdown").setExecutor(new lockdown());
	}
	
	public void registerEvents() {
		Bukkit.getServer().getPluginManager().registerEvents(new quickmathsEvent(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new playerChatEvent(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new noRedstone(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new onPlayerJoin(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new noPotions(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new cancelBlockBreak(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new cancelBlockPlace(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new cancelCommands(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new signPlaceEvent(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new stopColons(), this);
	}
	
	public void loadConfig() {
		saveDefaultConfig();
	}
	

	public void onEnable() {
		
		quickMathsEnabled = false;
		
		instance = this;
		
		lockdownEnabled = false;
		
		this.getServer().getLogger().info("-----------------------------");
		this.getServer().getLogger().info(" ");
		this.getServer().getLogger().info("Vasplex has been enabled!");
		this.getServer().getLogger().info("Using version: " + this.getDescription().getVersion());
		this.getServer().getLogger().info(" ");
		this.getServer().getLogger().info("-----------------------------");
		
		registerCommands();
		registerEvents();
		loadConfig();

	}
	

	
	public void onDisable() {
		
		this.getServer().getLogger().info("-----------------------------");
		this.getServer().getLogger().info(" ");
		this.getServer().getLogger().info("Vasplex has been disabled!");
		this.getServer().getLogger().info("Using version: " + this.getDescription().getVersion());
		this.getServer().getLogger().info(" ");
		this.getServer().getLogger().info("-----------------------------");
		
		loadConfig();
	}

}

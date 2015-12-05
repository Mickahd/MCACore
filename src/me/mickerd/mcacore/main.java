package me.mickerd.mcacore;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	
	static Plugin plugin = null;
	public void onEnable()
	{
		plugin = this;
	}
	
	public void onDisable()
	{
		plugin = null;
	}

	public Plugin returnPL()
	{
		return plugin;
	}
}

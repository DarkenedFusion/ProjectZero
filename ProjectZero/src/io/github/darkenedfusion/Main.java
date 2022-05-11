package io.github.darkenedfusion;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	private static Main instance;
	
	@Override
	public void onEnable() {
		
		this.getCommand("grant").setExecutor(new Commands());
		
		this.getServer().getPluginManager().registerEvents(new GameManager(), this);
		this.getServer().getPluginManager().registerEvents(new WeaponAbilities(), this);
		this.getServer().getPluginManager().registerEvents(new PowerAbilities(), this);
		
	}
	
	public static Main getInstance() {
        return instance;
    }

}

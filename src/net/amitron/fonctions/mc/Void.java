package net.amitron.fonctions.mc;

import org.bukkit.plugin.java.JavaPlugin;

public class Void extends JavaPlugin {
	
	@Override
	public void onEnable() {
		msg();
	}
	
	public void msg() {
		System.out.println("La fonction a été executée !");
	}

}

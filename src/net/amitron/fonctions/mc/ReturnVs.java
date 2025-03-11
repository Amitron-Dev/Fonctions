package net.amitron.fonctions.mc;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class ReturnVs extends JavaPlugin implements Listener{
	
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
	}

	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		p.getInventory().clear();
		
		ItemStack apple = new ItemStack(Material.APPLE, 1);
		ItemMeta applem = apple.getItemMeta();
		
		applem.setDisplayName("La Meilleur Pomme Du Monde");
		apple.setItemMeta(applem);
		
		p.getInventory().addItem(apple);
		
		
		ItemStack epee = new ItemStack(Material.WOOD_SWORD, 3);
		ItemMeta eppem = epee.getItemMeta();
		
		eppem.setDisplayName("Epée trop nul");
		epee.setItemMeta(eppem);
		p.getInventory().addItem(epee);
		
		p.getInventory().addItem(epee);
		
		ItemStack helmet = new ItemStack(Material.GOLD_HELMET, 1);
		ItemMeta helmetm = helmet.getItemMeta();
		
		helmetm.setDisplayName("Casque en or 18952 carras");
		helmet.setItemMeta(eppem);
		p.getInventory().addItem(helmet);
		
		p.getInventory().addItem(helmet);
		
		ItemStack barrier = new ItemStack(Material.BARRIER, 64);
		ItemMeta barrierm = barrier.getItemMeta();
		
		barrierm.setDisplayName("Salut mon amis (g plus d'idee)");
		barrier.setItemMeta(eppem);
		p.getInventory().addItem(barrier);
		
		p.getInventory().addItem(barrier);
	}
	
	
		
		
		

}

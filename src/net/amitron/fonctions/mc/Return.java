package net.amitron.fonctions.mc;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;


public class Return extends JavaPlugin implements Listener{
	
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
	}

	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		p.getInventory().clear();
		
		p.getInventory().addItem(item("La Meilleur Pomme Du Monde", Material.APPLE, 1));
		p.getInventory().addItem(item("Epée trop nul", Material.WOOD_SWORD, 3));
		p.getInventory().addItem(item("Casque en or 18952 carras", Material.GOLD_HELMET, 1));
		p.getInventory().addItem(item("Salut mon amis (g plus d'idee)", Material.BARRIER, 64));
	}
	
	
	public ItemStack item(String name, Material material, Integer number) {
		ItemStack item = new ItemStack(material, number);
		ItemMeta itemm = item.getItemMeta();
		
		itemm.setDisplayName(name);
		item.setItemMeta(itemm);
		
		return item;
	}
	
	

}

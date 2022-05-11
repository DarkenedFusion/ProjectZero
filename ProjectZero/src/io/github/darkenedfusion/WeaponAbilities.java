package io.github.darkenedfusion;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

public class WeaponAbilities implements Listener {
	
	private double rand = Math.random();
	
	@EventHandler
	public void onPunch(EntityDamageByEntityEvent event) {
		if(event.getDamager() instanceof Player) {
			Player player = (Player) event.getDamager();
		 if(player.getInventory().getItemInMainHand().getType().equals(Material.STRIPPED_OAK_WOOD)) {
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "Wooden Gloves")) {
				
				
				
				if(rand <= 0.50) {
					player.getWorld().playSound(player, Sound.BLOCK_BARREL_OPEN, 1f, 5);
				} else {
					player.getWorld().playSound(player, Sound.BLOCK_BARREL_CLOSE, 1f, 5);
				}
				
				
				
			  }
			}
			
		}
		
	}
	
	

}

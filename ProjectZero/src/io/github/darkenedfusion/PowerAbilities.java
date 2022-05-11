package io.github.darkenedfusion;

import org.bukkit.Color;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.AreaEffectCloud;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class PowerAbilities implements Listener {
	
	private ItemDictionary itemDictionary = new ItemDictionary();
	
	@EventHandler
	public void eatStone(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		Action a = event.getAction();
		if(a.equals(Action.RIGHT_CLICK_AIR) || a.equals(Action.RIGHT_CLICK_BLOCK)) {
			
			if(player.getInventory().getItemInMainHand() != null && player.getInventory().getItemInMainHand().hasItemMeta()) {
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("Stone")) {
			
			player.playSound(player, Sound.ENTITY_GENERIC_EAT, 5, 0.5f);
			player.sendMessage("You have eaten the " + player.getInventory().getItemInMainHand().getItemMeta().getDisplayName() + "" );
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("Rubber Stone")) {
				
				player.getInventory().setItem(8, itemDictionary.rubberCrystal());
				}
			player.getInventory().removeItem(player.getInventory().getItemInMainHand());
			
			
			
		}
			}
			
		}
	}
	
	@EventHandler
	public void rubberBounce(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		Action a = event.getAction();
		
			
			if(player.getInventory().getItemInMainHand() != null && player.getInventory().getItemInMainHand().hasItemMeta()) {
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("Rubber Crystal")) {
			if(a.equals(Action.RIGHT_CLICK_AIR) || a.equals(Action.RIGHT_CLICK_BLOCK)) {
				AreaEffectCloud rubberBounce = (AreaEffectCloud)  player.getWorld().spawnEntity(player.getLocation(), EntityType.AREA_EFFECT_CLOUD);
				rubberBounce.setRadius(2);
				rubberBounce.setWaitTime(0);
				rubberBounce.setDuration(60);
				rubberBounce.setCustomName("Rubber Bounce");
				rubberBounce.setCustomNameVisible(false);
				rubberBounce.setParticle(Particle.REDSTONE, new Particle.DustOptions(Color.fromRGB(245, 122, 184), 1));
				
				Vector v = player.getLocation().getDirection().multiply(1).setY(1);
				player.setVelocity(v);
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 45, 0));
				
				new BukkitRunnable() {
					double t = 0;
					public void run() {
						t+= 1;
						
						
							
							
						
						
						if(t >= 30) {
							player.removePotionEffect(PotionEffectType.SLOW_FALLING);
							this.cancel();
						}
						
					}
				}.runTaskTimer(Main.getInstance(), 0, 20);
				}
			}
		}
	}
}

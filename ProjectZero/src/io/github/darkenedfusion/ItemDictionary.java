package io.github.darkenedfusion;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;



public class ItemDictionary {
	
	private static final String gum  = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTZiMTBkMDkzMzBlMGY3MDA4MTVlNGQwNmU2NmI1ZDc2Nzc2NThiOWNhZDA4NTU1YmE3ZDg3YzEzYjI4OGQwZCJ9fX0=";
	
	public ItemStack woodSword() {
		
		ItemStack wSword = new ItemStack(Material.WOODEN_SWORD);
		ItemMeta meta = wSword.getItemMeta();
		
		meta.setDisplayName(ChatColor.GRAY + "Wooden Sword");
		meta.setUnbreakable(true);
		
		wSword.setItemMeta(meta);
		
		return wSword;
	}
	
	public ItemStack woodGloves() {
		
		ItemStack wGloves = new ItemStack(Material.STRIPPED_OAK_WOOD);
		ItemMeta meta = wGloves.getItemMeta();
		
		meta.setDisplayName(ChatColor.GRAY + "Wooden Gloves");
		meta.setUnbreakable(true);
		
		wGloves.setItemMeta(meta);
		
		return wGloves;
	}
	
	public ItemStack rubberStone() {
		
		ItemStack rStone = new ItemStack(Material.PINK_DYE);
		ItemMeta meta = rStone.getItemMeta();
		
		
		
		
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Rubber Stone");
		
		
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "A stone that is stretchy to the touch.");
		
		meta.setLore(lore);
		rStone.setItemMeta(meta);
		
		
		return rStone;
	}
	
	public ItemStack rubberCrystal() {
		
		ItemStack rCrystal = new ItemStack(Material.PINK_DYE);
		ItemMeta meta = rCrystal.getItemMeta();
		
		
		
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + ""  + ChatColor.BOLD + "" + "Rubber Crystal");
		
		
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "A crystal empowered by rubber!");
		
		meta.setLore(lore);
		rCrystal.setItemMeta(meta);
		
		
		return rCrystal;
	}
	
	


}

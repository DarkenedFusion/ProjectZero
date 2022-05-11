package io.github.darkenedfusion;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
	
	private ItemDictionary itemDictionary = new ItemDictionary();

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

			
	if(label.equalsIgnoreCase("grant")) {
		if(!(sender instanceof Player)) {
			sender.sendMessage("Console can't do this!");
			return true;
		}
	}
	Player player = (Player) sender;
	if(args[0].length() == 0) {
		player.sendMessage("Please insert the correct parameters!");
	}
	
	if(player.isOp() && args[0].equalsIgnoreCase("wSword")) {
		player.getInventory().addItem(itemDictionary.woodSword());
	}
	if(player.isOp() && args[0].equalsIgnoreCase("wGloves")) {
		player.getInventory().addItem(itemDictionary.woodGloves());
	}
	if(player.isOp() && args[0].equalsIgnoreCase("rStone")) {
		player.getInventory().addItem(itemDictionary.rubberStone());
	}
	if(player.isOp() && args[0].equalsIgnoreCase("rCrystal")) {
		player.getInventory().addItem(itemDictionary.rubberCrystal());
	}

	return false;
	
	}
	
}

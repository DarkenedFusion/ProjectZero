package io.github.darkenedfusion;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class GameManager implements Listener {
	
	@EventHandler
	public void startMode(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		if(!player.isOp()) 	{
			player.setGameMode(GameMode.ADVENTURE);
		}
		else {
			return;
		}
		
	}
	
	
	

}

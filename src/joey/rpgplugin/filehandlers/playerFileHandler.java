package joey.rpgplugin.filehandlers;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;

public class playerFileHandler {

	public playerFileHandler(PlayerJoinEvent event) {
		handleFileCreation(event);
	}

	private void handleFileCreation(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
	}

	
}

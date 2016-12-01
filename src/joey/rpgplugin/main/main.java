package joey.rpgplugin.main;

import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import joey.rpgplugin.objects.mobObject;
import joey.rpgplugin.filehandlers.*;


@SuppressWarnings("unused")
public class main extends JavaPlugin implements Listener{
	public final Logger logger = Logger.getLogger("Minecraft");
	public static main plugin;
	@Override
	public void onDisable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " has been disabled!");
	}
	@Override
	public void onEnable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " version " + pdfFile.getVersion() + " has been enabled!");
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(this , this);
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event){
		playerFileHandler pHandler = new playerFileHandler(event);
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player!");
			return false;
		}
		if(cmd.getName().equalsIgnoreCase("testcommand") ){
			spawnMob(player);
		}
		return true;
	}
	private void spawnMob(Player player) {
		// TODO Auto-generated method stub
		
	}
}

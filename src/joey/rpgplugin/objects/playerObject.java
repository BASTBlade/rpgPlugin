package joey.rpgplugin.objects;

import org.bukkit.Location;

public class playerObject {

	public playerObject(double experience, String faction , Location loc, String playerID){
		setpExperience(experience);
		setpFaction(faction);
		setLoginLocation(loc);
		setPlayerID(playerID);
	}
	
	private double pExperience;
	private String pFaction;
	private Location loginLocation;
	private String playerID;
	public double getpExperience() {
		return pExperience;
	}
	public void setpExperience(double pExperience) {
		this.pExperience = pExperience;
	}
	public String getpFaction() {
		return pFaction;
	}
	public void setpFaction(String pFaction) {
		this.pFaction = pFaction;
	}
	public Location getLoginLocation() {
		return loginLocation;
	}
	public void setLoginLocation(Location loginLocation) {
		this.loginLocation = loginLocation;
	}
	public String getPlayerID() {
		return playerID;
	}
	public void setPlayerID(String playerID) {
		this.playerID = playerID;
	}
	
}

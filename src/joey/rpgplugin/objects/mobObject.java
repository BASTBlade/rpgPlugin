package joey.rpgplugin.objects;

import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

public class mobObject {
	public mobObject(String name, LivingEntity entity , int level , String faction){
		setName(name);
		setEntity(entity);
		setLevel(level);
		setFaction(faction);
	}
	
	public void equipEntity(){
		if(!(pHead.equals(null))){
			
		}if(!(pBody.equals(null))){
			
		}if(!(pLegs.equals(null))){
			
		}if(!(pBoots.equals(null))){
			
		}
	}
	
	
	public String getName() {
		return pName;
	}
	public void setName(String pName) {
		this.pName = pName;
	}

	public LivingEntity getEntity() {
		return pEntity;
	}
	public void setEntity(LivingEntity pEntity) {
		this.pEntity = pEntity;
	}

	public int getLevel() {
		return pLevel;
	}
	public void setLevel(int pLevel) {
		this.pLevel = pLevel;
	}

	public String getFaction() {
		return pFaction;
	}
	public void setFaction(String pFaction) {
		this.pFaction = pFaction;
	}


	public ItemStack getHead() {
		return pHead;
	}
	public void setHead(ItemStack pHead) {
		this.pHead = pHead;
	}


	public ItemStack getBody() {
		return pBody;
	}
	public void setBody(ItemStack pBody) {
		this.pBody = pBody;
	}


	public ItemStack getLegs() {
		return pLegs;
	}
	public void setLegs(ItemStack pLegs) {
		this.pLegs = pLegs;
	}


	public ItemStack getBoots() {
		return pBoots;
	}
	public void setBoots(ItemStack pBoots) {
		this.pBoots = pBoots;
	}


	private String pName = "";
	private LivingEntity pEntity;
	private int pLevel = 0;
	private String pFaction = "";
	private ItemStack pHead;
	private ItemStack pBody;
	private ItemStack pLegs;
	private ItemStack pBoots;
}

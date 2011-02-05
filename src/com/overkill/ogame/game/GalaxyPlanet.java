package com.overkill.ogame.game;

import android.graphics.Color;

public class GalaxyPlanet {
	
	public static enum PlayerStatus {ACTIVE, INACTIVE7, INACTIVE28, NOOB, VACATION, STRONG, BANNED};
	
	private Integer position;
	private boolean emptySlot = true;
	
	private String planetName;
	private String planetActivity;
	private String planetCoords;
	
	//Element moon;
	
	private String debrisMetal;
	private String debrisCrystal;
	private int debrisRecyclersNeeded = 0;
	
	private String playerName;
	private String playerRank;
	private PlayerStatus playerStatus = PlayerStatus.ACTIVE;
	
	private String allyName;
	private String allyRank;
	private String allyMembers;
	
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}	
	public boolean isEmptySlot() {
		return emptySlot;
	}
	public void setEmptySlot(boolean emptySlot) {
		this.emptySlot = emptySlot;
	}
	public String getPlanetName() {
		return planetName;
	}
	public void setPlanetName(String planetName) {
		this.planetName = planetName;
	}
	public String getPlanetActivity() {
		return planetActivity;
	}
	public void setPlanetActivity(String planetActivity) {
		this.planetActivity = planetActivity;
	}
	public String getPlanetCoords() {
		return planetCoords;
	}
	public void setPlanetCoords(String planetCoords) {
		this.planetCoords = planetCoords;
	}
	public String getPlayerName() {
		String ret = playerName;
		switch(getPlayerStatus()) {
			case INACTIVE7:
				ret += " (i)";
				break;
			case INACTIVE28:
				ret += " (I)";
				break;
			case NOOB:
				ret += " (n)";
				break;
			case VACATION:
				ret += " (v)";
				break;
			case STRONG:
				ret += " (s)";
				break;
			case BANNED:
				ret += " (b)";
				break;			
		}
		return ret;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerRank() {
		return playerRank;
	}
	public void setPlayerRank(String playerRank) {
		this.playerRank = playerRank;
	}	
	public PlayerStatus getPlayerStatus() {
		return playerStatus;
	}
	public void setPlayerStatus(String spanClass) {
		if("status_abbr_strong".equals(spanClass)) {
			this.playerStatus = PlayerStatus.STRONG;
		} else if("status_abbr_vacation".equals(spanClass)) {
			this.playerStatus = PlayerStatus.VACATION;
		} else if("status_abbr_inactive".equals(spanClass)) {
			this.playerStatus = PlayerStatus.INACTIVE7;
		} else if("status_abbr_longinactive".equals(spanClass)) {
			this.playerStatus = PlayerStatus.INACTIVE28;
		} else if("status_abbr_noob".equals(spanClass)) {
			this.playerStatus = PlayerStatus.NOOB;
		} else if("status_abbr_banned".equals(spanClass)) {
			this.playerStatus = PlayerStatus.BANNED;
		} else {
			this.playerStatus = PlayerStatus.ACTIVE;	
		}
	}
	public boolean isPlayerBanned() {
		return PlayerStatus.BANNED == getPlayerStatus();
	}
	public int getPlayerColor() {
	    switch (getPlayerStatus()) {
	      case INACTIVE7: 
		        return Color.parseColor("#6E6E6E");
	      case INACTIVE28: 
		        return Color.parseColor("#4F4F4F");
	      case NOOB: 
		        return Color.parseColor("#00FF00"); //lime
	      case STRONG: 
		        return Color.parseColor("#FF0000");
	      case VACATION: 
		        return Color.parseColor("#00FFFF"); //aqua
	      default: 
		        return Color.parseColor("#FFFFFF");        
	    }
	}
	public String getAllyName() {
		return allyName;
	}
	public void setAllyName(String allyName) {
		this.allyName = allyName;
	}
	public String getAllyRank() {
		return allyRank;
	}
	public void setAllyRank(String allyRank) {
		this.allyRank = allyRank;
	}
	public String getAllyMembers() {
		return allyMembers;
	}
	public void setAllyMembers(String allyMembers) {
		this.allyMembers = allyMembers;
	}
	public String getDebrisMetal() {
		return debrisMetal;
	}
	public void setDebrisMetal(String debrisMetal) {
		this.debrisMetal = debrisMetal;
	}
	public String getDebrisCrystal() {
		return debrisCrystal;
	}
	public void setDebrisCrystal(String debrisCrystal) {
		this.debrisCrystal = debrisCrystal;
	}
	public int getDebrisRecyclersNeeded() {
		return debrisRecyclersNeeded;
	}
	public void setDebrisRecyclersNeeded(String debrisRecyclersNeeded) {
		try {
			this.debrisRecyclersNeeded = Integer.parseInt(debrisRecyclersNeeded);
		} catch (NumberFormatException e) {
			this.debrisRecyclersNeeded = 0;
		}
	}
	@Override
	public String toString() {
		return "GalaxyPlanet [allyMembers=" + allyMembers + ", allyName="
				+ allyName + ", allyRank=" + allyRank + ", debrisCrystal="
				+ debrisCrystal + ", debrisMetal=" + debrisMetal
				+ ", debrisRecyclersNeeded=" + debrisRecyclersNeeded
				+ ", planetActivity=" + planetActivity + ", planetCoords="
				+ planetCoords + ", planetName=" + planetName + ", playerName="
				+ playerName + ", playerRank=" + playerRank + ", position="
				+ position + "]";
	}	

}
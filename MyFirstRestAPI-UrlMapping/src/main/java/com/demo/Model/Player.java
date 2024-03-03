package com.demo.Model;

public class Player {
	private int playerId;
	private String playerName;
	private String team;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public Player(int playerId, String playerName, String team) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.team = team;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", team=" + team + "]";
	}
	 
	

}

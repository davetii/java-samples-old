package com.greatwideweb.endpoints;

import java.util.List;

import com.greatwideweb.service.PlayerService;
import com.greatwideweb.vo.Player;

public class PlayerEndPoint {
	
	private PlayerService playerService;
	
	public List<Player> listAllPlayers() {
		return playerService.listAllPlayers();
	}

	public PlayerService getPlayerService() {
		return playerService;
	}

	public void setPlayerService(PlayerService playerService) {
		this.playerService = playerService;
	}

}

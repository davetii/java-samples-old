package com.greatwideweb.service;

import java.util.List;

import com.greatwideweb.dao.PlayerDAO;
import com.greatwideweb.vo.Player;

public class PlayerService {
	
	private PlayerDAO dao;
	
	public PlayerDAO getDao() {
		return dao;
	}

	public void setDao(PlayerDAO dao) {
		this.dao = dao;
	}

	public List<Player> listAllPlayers() {
		List<Player> players = dao.listAllPlayers();
		return players;
	}

}

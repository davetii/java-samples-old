package com.greatwideweb.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatwideweb.vo.Player;

public class PlayerDAOImplTest {
	PlayerDAO dao;
	
	@Before
	public void setup() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		dao = (PlayerDAO) ctx.getBean("PlayerDAOImpl");
	}
	
	@Test
	public void ensureDatabaseReturnsRows() {
		List<Player> players = dao.listPlayers();
		Assert.assertNotNull(players);
		Assert.assertEquals(2, players.size());
	}
	

}

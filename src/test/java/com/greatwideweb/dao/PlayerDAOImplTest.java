package com.greatwideweb.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatwideweb.vo.Player;

public class PlayerDAOImplTest {
	PlayerDAO dao;
	ApplicationContext ctx;
	
	@Before
	public void setup() {
		ctx = new ClassPathXmlApplicationContext("beans.xml");
		dao = (PlayerDAO) ctx.getBean("PlayerDAOImpl");
	}
	
	@Test
	public void ensureDatabaseReturnsRows() {
		List<Player> players = dao.listPlayers();
		Assert.assertNotNull(players);
		Assert.assertNotEquals(0, players.size());
	}
	
	public void after() {
		((AbstractApplicationContext) ctx).close();
	}
	

}

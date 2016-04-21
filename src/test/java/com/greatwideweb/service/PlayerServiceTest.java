package com.greatwideweb.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayerServiceTest {
	
	ApplicationContext ctx;
	PlayerService service;
	
	@Before
	public void setup() {
		ctx = new ClassPathXmlApplicationContext("beans.xml");
		service = (PlayerService) ctx.getBean("playerservice");
	}
	
	@Test
	public void ensureAllPLayersHasResults() {
		Assert.assertTrue(service.listAllPlayers().size() > 1);
	}

}

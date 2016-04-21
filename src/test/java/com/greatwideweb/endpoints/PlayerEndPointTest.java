package com.greatwideweb.endpoints;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatwideweb.service.PlayerService;

public class PlayerEndPointTest {
	ApplicationContext ctx;
	PlayerEndPoint endPoint;
	
	@Before
	public void setup() {
		ctx = new ClassPathXmlApplicationContext("beans.xml");
		endPoint = (PlayerEndPoint) ctx.getBean("playerendpoint");
	}
	
	@Test
	public void ensureAllPLayersHasResults() {
		Assert.assertTrue(endPoint.listAllPlayers().size() > 1);
	}

}

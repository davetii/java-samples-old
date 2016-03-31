package com.greatwideweb.config;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.greatwideweb.config.DBConfig;



public class DBConfigTest {
	
	@Test
	public void ensureHelloParamExists() {
		AbstractApplicationContext  context = new AnnotationConfigApplicationContext(DBConfig.class);
		DBConfig c = (DBConfig) context.getBean("dbconfig");
		Assert.assertNotNull(c.getHello());
		Assert.assertEquals("Hello Spring", c.getHello());
		context.close();
	}

}

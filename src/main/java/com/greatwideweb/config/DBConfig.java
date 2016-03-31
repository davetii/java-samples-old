package com.greatwideweb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service("dbconfig")
@Configuration
@PropertySource("classpath:db-conf.properties")
public class DBConfig {

	@Autowired
	private Environment env;

	@Bean
	public String getHello() {
		return env.getProperty("greeting");
	}
	
	
	

}

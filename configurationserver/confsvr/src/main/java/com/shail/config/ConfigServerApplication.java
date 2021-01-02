package com.shail.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
	
	public static void main(String[] args) {
		System.out.println("FSDFSFS");
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}

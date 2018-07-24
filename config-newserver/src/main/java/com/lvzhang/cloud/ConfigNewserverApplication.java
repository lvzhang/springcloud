package com.lvzhang.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigNewserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigNewserverApplication.class, args);
	}
}

package com.fcc.config.server.fccconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class FccConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FccConfigServerApplication.class, args);
	}

}

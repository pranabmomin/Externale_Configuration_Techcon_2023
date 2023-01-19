package com.fcc.clientgit.sampleclientgit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleClientGitApplication implements CommandLineRunner{

	@Value("${example.username}")
	private String username;

	@Value("${example.password}")
	private String password;
	
	public static void main(String[] args) {
		SpringApplication.run(SampleClientGitApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		Logger logger = LoggerFactory.getLogger(SampleClientGitApplication.class);

		logger.info("----------------------------------------");
		logger.info("Configuration properties");
		logger.info("   example.username is {}", username);
		logger.info("   example.password is {}", password);
		logger.info("----------------------------------------");
	}

}

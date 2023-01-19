package com.fcc.client.vault.sampleclientvault;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleClientVaultApplication implements CommandLineRunner{

	@Value("${key1}")
	private String key1;

	@Value("${name}")
	private String name;

	public static void main(String[] args) {
		SpringApplication.run(SampleClientVaultApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Logger logger = LoggerFactory.getLogger(SampleClientVaultApplication.class);

		logger.info("----------------------------------------");
		logger.info("Configuration properties");
		logger.info("Key1 ---------> "+key1);
		logger.info("name ---------> "+name);
	}

}

package com.fcc.sample.Sample;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MyConfiguration.class)
public class SampleApplication implements CommandLineRunner{

private final MyConfiguration configuration;

@Autowired
private ClientConfiguration clientConfiguration;

  public SampleApplication(MyConfiguration configuration) {
    this.configuration = configuration;
  }

  public static void main(String[] args) {
    SpringApplication.run(SampleApplication.class, args);
  }

  @Override
  public void run(String... args) {

    Logger logger = LoggerFactory.getLogger(SampleApplication.class);

    logger.info("----------------------------------------");
    logger.info("Configuration properties");
    logger.info("   example.username is {}", configuration.getUsername());
    logger.info("   example.password is {}", configuration.getPassword());
    logger.info("   example.name is {}", configuration.getName());
    logger.info("----------------------------------------");

    Map<String,String> clientProp = clientConfiguration.getClient();

    StringBuilder builder = new StringBuilder();
    for(String key:clientProp.keySet()){
      System.out.println(key+"-------"+clientProp.get(key));

      builder.append(key+"="+clientProp.get(key)).append("\n");
    }


    //output to a folder (client.properties)
    try {
      FileWriter fileWriter = new FileWriter("client.properties");

      fileWriter.write(builder.toString());
      fileWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}

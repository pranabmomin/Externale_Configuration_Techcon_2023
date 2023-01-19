package com.fcc.sample.Sample;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Mark Paluch
 */
@ConfigurationProperties("example")
public class MyConfiguration {

  private String username;

  private String password;

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
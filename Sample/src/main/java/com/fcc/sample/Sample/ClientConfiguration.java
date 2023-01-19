package com.fcc.sample.Sample;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties()       
@Component
public class ClientConfiguration {
    
    // @Value("${ffdc.token.url}")
    // private String fcctokenurl;

    private java.util.Map<String, String> client = new HashMap<>();  // it will store all properties start with app

    public java.util.Map<String, String> getClient() {
        return client;
    }

    public void setClient(java.util.Map<String, String> client) {
        this.client = client;
    }

}

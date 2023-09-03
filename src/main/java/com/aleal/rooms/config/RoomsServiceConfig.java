package com.aleal.rooms.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration // Enable Spring Cloud Config Server test 1
@ConfigurationProperties(prefix = "rooms")
@Getter
@Setter
public class RoomsServiceConfig {
    private String msg;
    private String buildVersion;
    private Map<String, String> mailDetails;
}

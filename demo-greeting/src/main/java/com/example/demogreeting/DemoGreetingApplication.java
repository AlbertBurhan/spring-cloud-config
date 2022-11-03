package com.example.demogreeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableConfigurationProperties(DemoGreetingProperties.class)
@EnableDiscoveryClient
public class DemoGreetingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGreetingApplication.class, args);
	}

}

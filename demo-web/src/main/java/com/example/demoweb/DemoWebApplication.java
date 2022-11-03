package com.example.demoweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class DemoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWebApplication.class, args);
	}

	static class MyConfig
	{
		@Bean
		@LoadBalanced
		public RestTemplate rest()
		{
			return new RestTemplateBuilder().build();
		}
	}

	@FeignClient("name")
	static interface NameService
	{
		@RequestMapping("/")
		public String getName();
	}

	@FeignClient("greetings")
	static interface GreetingService
	{
		@RequestMapping("/")
		public String getGreeting();
	}

}

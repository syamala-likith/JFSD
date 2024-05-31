package com.klef.jfsd.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoMicroserviceApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(DemoMicroserviceApplication.class, args);
		System.out.println("Microservices Demo...!");
	}
	
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
	
}

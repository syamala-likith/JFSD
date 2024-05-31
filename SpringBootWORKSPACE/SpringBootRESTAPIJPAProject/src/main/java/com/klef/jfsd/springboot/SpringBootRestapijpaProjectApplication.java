package com.klef.jfsd.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestapijpaProjectApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootRestapijpaProjectApplication.class, args);
		System.out.println("Spring Boot with Restful Web Services and JPA Demo");
	}

}

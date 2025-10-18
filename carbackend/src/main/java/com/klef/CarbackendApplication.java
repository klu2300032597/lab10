package com.klef;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.setvlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CarbackendApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CarbackendApplication.class, args);
		System.out.println("car project is running...");
		
	}

}

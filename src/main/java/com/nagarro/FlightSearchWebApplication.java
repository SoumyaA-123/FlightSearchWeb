package com.nagarro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.nagarro")
public class FlightSearchWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightSearchWebApplication.class, args);
	}

}

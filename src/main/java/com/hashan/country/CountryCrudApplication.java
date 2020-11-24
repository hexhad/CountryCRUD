package com.hashan.country;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountryCrudApplication {

	public static void main(String[] args) {
		//System.setProperty("server.servlet.context-path", "/rest/v2");
		SpringApplication.run(CountryCrudApplication.class, args);
		System.out.println("country app");
	}

}

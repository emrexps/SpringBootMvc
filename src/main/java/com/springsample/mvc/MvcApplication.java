package com.springsample.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcApplication {

	public static void main(String[] args) {
		System.out.println("Hello from mvc");
		System.out.println("Hello from mvc2");
		SpringApplication.run(MvcApplication.class, args);
		
	}
}

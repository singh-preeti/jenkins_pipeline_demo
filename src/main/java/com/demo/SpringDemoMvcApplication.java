package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // configures+enableconfigure+comaponentscan
public class SpringDemoMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoMvcApplication.class, args);
		System.out.println("Hello");
	}

}

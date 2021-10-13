package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GitbranchesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(GitbranchesApplication.class, args);
		String applicationName = context.getApplicationName();
		System.out.println("Application Name is::" + applicationName);
		System.out.println("I AM PRACTICING GIT BRANCHE");
	}

}

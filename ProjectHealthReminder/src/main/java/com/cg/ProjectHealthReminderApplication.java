package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectHealthReminderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectHealthReminderApplication.class, args);
		System.out.println("Inside main methods");
	}

}

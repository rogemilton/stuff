package com.roge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ButtonClickApplication {

	public static void main(String[] args) {
		SpringApplication.run(ButtonClickApplication.class, args);
		System.out.println("\n<< buttonclick is on >>\n");
	}
}

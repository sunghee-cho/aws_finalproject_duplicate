package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@ComponentScan(basePackages = "upload")
public class Second1Application {

	public static void main(String[] args) {
		SpringApplication.run(Second1Application.class, args);
	}

}

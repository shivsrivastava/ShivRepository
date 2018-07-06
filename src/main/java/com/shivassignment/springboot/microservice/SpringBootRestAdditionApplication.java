package com.shivassignment.springboot.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.shivassignment.springboot"})
public class SpringBootRestAdditionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestAdditionApplication.class, args);
	}
}

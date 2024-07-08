package com.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.aws.service", "com.aws.controller"})
public class ApiEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiEcommerceApplication.class, args);
	}

}

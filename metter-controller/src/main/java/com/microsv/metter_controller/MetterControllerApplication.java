package com.microsv.metter_controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MetterControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetterControllerApplication.class, args);
	}

}

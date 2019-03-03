package com.demo.catalog;

import java.util.logging.Logger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient 
@SpringBootApplication
public class ProductInfoManagementApp implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProductInfoManagementApp.class, args);
		System.out.println("Main Spring Boot Application booting ........................");
	}

	/**
	 * 
	 */
	@Override
	public void run(String... args) throws Exception {
		
	}
}

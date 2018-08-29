package com.demo.catalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import com.demo.catalog.service.ProductService;

@SpringBootApplication
public class CatApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CatApplication.class, args);
		System.out.println("Main Spring Boot Application booting ........................");
	}
	

	@Override
	public void run(String... args) throws Exception {
	
		//new BigInteger("1")
		//		Product p1 = new Product("I Phone 5 ", "Iphone 5 Descip", "Long desctip 1 .........................");
		//		Product p2 = new Product("I Phone 5 PLus  ", "Iphone Plus  Descip", "Long desctip 2.........................");
		//		Product p3 = new Product("I Phone 6 ", "Iphone  6 Descip", "Long desctip 3 .........................");
		//		Product p4 = new Product("I Phone 6 Plus  ", "Iphone 6 Plus  Descip", "Long desctip 4 .........................");
		//		Product p5 = new Product("I Phone 7 ", "Iphone 7 Descip", "Long desctip 5 .........................");
		//		
		//		catalogSercice.createProduct(p1);
		//		catalogSercice.createProduct(p2);
//		catalogSercice.createProduct(p3);
//		catalogSercice.createProduct(p4);
//		catalogSercice.createProduct(p5);
//		
		
	}
	@Autowired
	private ProductService catalogService;
}

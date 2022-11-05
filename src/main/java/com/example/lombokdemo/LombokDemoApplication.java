package com.example.lombokdemo;

import com.example.lombokdemo.model.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LombokDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			System.out.println("Command Line Runner Method ....");
			int a = 100;
			int b = 50;
			Product product = new Product();
			product.setProdId(1000);
			product.setProdName("Lux Soap");
			System.out.println("Product Details ......");
			System.out.println("Product Id : " + product.getProdId());
			System.out.println("Product Name " + product.getProdName());
			System.out.println("The value of C is " + (a/b));
		} catch(Exception ex) {
			System.out.println("Exception in command line runner class .." + ex.getMessage());
		}
	}
}

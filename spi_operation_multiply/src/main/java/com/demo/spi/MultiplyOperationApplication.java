package com.demo.spi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = { "com.demo.spi"})
public class MultiplyOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiplyOperationApplication.class, args);
	}

}

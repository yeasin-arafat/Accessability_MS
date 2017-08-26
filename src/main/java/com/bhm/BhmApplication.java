package com.bhm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class BhmApplication{

	public static void main(String[] args) {
		SpringApplication.run(BhmApplication.class, args);
	}
}

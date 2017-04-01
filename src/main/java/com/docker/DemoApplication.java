package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		System.out.println("ENV variables");

		System.out.println(System.getenv("DB_HOST"));
		System.out.println(System.getenv("REDIS_HOST"));
		System.out.println(System.getenv("SERVICE_1_HOST"));
		System.out.println(System.getenv("SERVICE_2_HOST"));

		SpringApplication.run(DemoApplication.class, args);
	}
}

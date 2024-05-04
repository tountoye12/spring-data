package com.diallo.elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElasticsearchApplication {

	public static void main(String[] args) {

		System.out.println("Test");

		SpringApplication.run(ElasticsearchApplication.class, args);
	}

}

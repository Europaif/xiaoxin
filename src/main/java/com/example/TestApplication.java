package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestApplication {
/*
	@Bean
	@ConfigurationProperties(prefix = "connection")
	public ConnectionSettings connectionSettings(){
		return new ConnectionSettings();
	}
*/

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
}

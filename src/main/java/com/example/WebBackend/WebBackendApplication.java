package com.example.WebBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WebBackendApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(WebBackendApplication.class, args);

	}

}

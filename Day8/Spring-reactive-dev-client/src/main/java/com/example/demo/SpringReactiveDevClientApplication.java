package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;



@SpringBootApplication
public class SpringReactiveDevClientApplication {

	public static void main(String[] args) {
		 SpringApplication.run(SpringReactiveDevClientApplication.class, args);
	}
	
	@Bean 
	WebClient.Builder builder(){
		return WebClient.builder();
	}
	@Bean 
	WebClient client(WebClient.Builder builderRef) {
		return builderRef.build();
	}

}

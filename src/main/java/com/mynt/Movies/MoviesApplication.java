package com.mynt.Movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;

import java.util.Arrays;

@SpringBootApplication
@EnableGlobalAuthentication
public class MoviesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MoviesApplication.class, args);

		System.out.println("Let's inspect the beans provided by Spring Boot:");

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
	}

}

package com.lko.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FirstApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

}

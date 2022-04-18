package com.br.ittraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class ItTrainingApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ItTrainingApplication.class, args);
	}

}

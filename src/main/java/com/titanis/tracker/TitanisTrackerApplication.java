package com.titanis.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class TitanisTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TitanisTrackerApplication.class, args);
	}

}

package com.example.DAEBANG;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DaebangApplication {
	public static void main(String[] args) {
		SpringApplication.run(DaebangApplication.class, args);
	}

}

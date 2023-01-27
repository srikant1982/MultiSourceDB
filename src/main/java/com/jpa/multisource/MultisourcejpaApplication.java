package com.jpa.multisource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication()
public class MultisourcejpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultisourcejpaApplication.class, args);
	}

}

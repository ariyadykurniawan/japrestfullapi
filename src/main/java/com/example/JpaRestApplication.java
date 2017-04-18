package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class JpaRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaRestApplication.class, args);
	}
	
	@Autowired
	private EmployeeRepository repository;
	
	@Bean
	public CommandLineRunner printAll(ApplicationContext ctx){
		return args ->{
			Employee e = new Employee("Jamal","Rodrigues","Male");
			repository.save(e);
		};
		
	}
}

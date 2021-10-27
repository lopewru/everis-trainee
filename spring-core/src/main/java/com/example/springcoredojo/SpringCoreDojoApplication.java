package com.example.springcoredojo;

import com.example.springcoredojo.entity.Company;
import com.example.springcoredojo.entity.Config;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCoreDojoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDojoApplication.class, args);


	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			javaAnonotated();
		};
	}

	public void javaAnonotated(){
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Company company = context.getBean("company", Company.class);

		System.out.println("Address: " + company.getAddress());
	}

	public void javaAnonotated1(){
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Company company = context.getBean("company", Company.class);

		System.out.println("Address: " + company.getAddress());
	}

}

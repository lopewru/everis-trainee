package com.example.springcoredojo;

import com.example.springcoredojo.annotation.UserService;
import com.example.springcoredojo.entity.Company;
import com.example.springcoredojo.entity.Config;
import com.example.springcoredojo.javabase.AccountConfig;
import com.example.springcoredojo.javabase.AccountService;
import com.example.springcoredojo.property.PropertiesWithJavaConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreDojoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDojoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			javaAnonotated();
			classPathXmlApplicationContext();
			annotationConfigApplicationContext();
			propetyInjection(ctx);
		};
	}

	public void javaAnonotated(){
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Company company = context.getBean("company", Company.class);

		System.out.println("Address: " + company.getAddress());
	}

	public void classPathXmlApplicationContext(){
		ApplicationContext context = new ClassPathXmlApplicationContext("user-bean-config.xml");
		UserService userService = context.getBean(UserService.class);

		System.out.println("userService: " + userService.getName());

	}

	public void annotationConfigApplicationContext(){
		ApplicationContext context = new AnnotationConfigApplicationContext(AccountConfig.class);
		AccountService accountService = context.getBean(AccountService.class);

		System.out.println("accountService: " + accountService.getAccountRepository());

	}

	public void propetyInjection(ApplicationContext ctx){
		PropertiesWithJavaConfig properties = ctx.getBean(PropertiesWithJavaConfig.class);

		System.out.println("nombre: " + properties.getNombre());
		System.out.println("twitter: " + properties.getPropiedadSinValor());
		System.out.println("edad: " + properties.getEdad());

	}

}

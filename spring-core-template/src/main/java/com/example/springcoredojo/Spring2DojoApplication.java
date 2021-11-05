package com.example.springcoredojo;

import com.example.springcoredojo.autowired.MemeService;
import com.example.springcoredojo.profile.DatasourceConfig;
import com.example.springcoredojo.profile.DevDatasourceConfig;
import com.example.springcoredojo.profile.ProfileManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import com.example.springcoredojo.qualifier.JediService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Spring2DojoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring2DojoApplication.class, args);
	}


}

package com.example.springcoredojo;

import com.example.springcoredojo.autowired.MemeService;
import com.example.springcoredojo.profile.DevDatasourceConfig;
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

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			autowired(ctx);
			qualifier(ctx);
			profile();
		};
	}

	public void autowired(ApplicationContext ctx){
		MemeService service = ctx.getBean(MemeService.class);

		System.out.println("Meme: " + service.getMessage());

	}

	public void qualifier(ApplicationContext ctx){
		JediService service = ctx.getBean(JediService.class);

		System.out.println("master: " + service.getMaster().getName());

	}

	public void profile(){
		ApplicationContext context = new ClassPathXmlApplicationContext("profile.xml");
		DevDatasourceConfig devDatasourceConfig = context.getBean(DevDatasourceConfig.class);

		System.out.println("DevDatasourceConfig: " + devDatasourceConfig.getName());

	}


}

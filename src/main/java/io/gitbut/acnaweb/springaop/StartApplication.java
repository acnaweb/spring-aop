package io.gitbut.acnaweb.springaop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import io.gitbut.acnaweb.springaop.service.DummyService;

@SpringBootApplication
public class StartApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(AnnotationConfigApplicationContext context) {
		return args -> {
			DummyService service = context.getBean(DummyService.class);
			service.serve();
		};
	}
}

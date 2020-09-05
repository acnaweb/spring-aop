package io.gitbut.acnaweb.springaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.gitbut.acnaweb.springaop.service.DummyService;

@SpringBootApplication
public class StartApplication implements CommandLineRunner {
	@Autowired
	private AnnotationConfigApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DummyService service = context.getBean(DummyService.class);
		service.serve("mensagem de teste");

	}

}

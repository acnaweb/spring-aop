package io.gitbut.acnaweb.springaop.service;

import org.springframework.stereotype.Component;

import io.gitbut.acnaweb.springaop.aspect.LogExecutionTime;

@Component
public class DummyService {
	@LogExecutionTime
	public void serve() throws InterruptedException {
		System.out.println("serve()");
		Thread.sleep(2000);
	}

}
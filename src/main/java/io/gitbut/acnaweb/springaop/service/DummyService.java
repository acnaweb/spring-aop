package io.gitbut.acnaweb.springaop.service;

import org.springframework.stereotype.Component;

import io.gitbut.acnaweb.springaop.aspect.LogExecutionTime;

@Component
public class DummyService {

	@LogExecutionTime
	public void serve(String msg) throws InterruptedException {
		System.out.println("serve() " + msg);
		Thread.sleep(2000);
	}

}

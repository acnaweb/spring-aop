package io.gitbut.acnaweb.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AppAspect {

	// @Around -> advice
	// pointcut -> métodos anotados com @LogExecutionTime
	@Around("@annotation(LogExecutionTime)")
	public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.currentTimeMillis();

		// executa o método anotado
		System.out.println("antes " + joinPoint.getArgs()[0]);

		Object proceed = joinPoint.proceed();
		System.out.println("depois");

		long executionTime = System.currentTimeMillis() - start;

		System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");

		return proceed;
	}

}

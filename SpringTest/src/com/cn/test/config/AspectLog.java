package com.cn.test.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AspectLog {

	@Pointcut("execution(* com.cn.test.service.IPerformanceService.*(..))")
	public void excudeService(){
		
	}
	
	@Before("excudeService()")
	public void doBeforeInServiceLayer(){
		System.out.println("before.....");
	}
	
	@Around("excudeService()")
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("before proceed");
		Object obj = pjp.proceed();
		System.out.println("after proceed");
		return obj;
	}
	
	@After("excudeService()")
	public void doAfterInServiceLayer(JoinPoint joinPoint) {  
		System.out.println("after.....");
	}
	
}

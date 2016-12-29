package com.cn.test.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AspectLogBean {

	public void doBeforeInServiceLayer(){
		System.out.println("before.....");
	}
	
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("before proceed");
		Object obj = pjp.proceed();
		System.out.println("after proceed");
		return obj;
	}
	
	public void doAfterInServiceLayer(JoinPoint joinPoint) {  
		System.out.println("after.....");
	}
	
}

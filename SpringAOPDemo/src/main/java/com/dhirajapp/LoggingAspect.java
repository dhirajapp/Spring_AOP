package com.dhirajapp;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.aspectj.AspectJPointcutAdvisor;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before("execution(* com.dhirajapp.ShoppingCart.checkout(..))")
  public void beforeLogger(JoinPoint jp) {
		String args=jp.getArgs()[0].toString();
		
	 System.out.println("Before Logger with arguments :"+ args);
 }
	
	@After("execution(* *.*.*.checkout(..))")
	public void  afterLogger() {
		System.out.println("After Logger");
	}
	
	@Pointcut("execution(* *.*.*.quntity(..))")
	public void afterReturningPointCut() {
		
	}
	
	@AfterReturning(pointcut="afterReturningPointCut()",returning="retvalue")
	public void afterReturning(int  retvalue) {
		System.out.println("After Returning : "+ retvalue);
	}
	
}

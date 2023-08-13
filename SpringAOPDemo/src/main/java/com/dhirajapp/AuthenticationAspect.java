package com.dhirajapp;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {
	
	@Pointcut("within(com.dhirajapp..*)")
	public void authenticationPointCut() {
		
	}
	@Pointcut("within(com.dhirajapp..*)")
	public void authorizationPointCut() {
		
	}
	
	@Before("authenticationPointCut() && authorizationPointCut()")
	public void authenticate() {
		System.out.println("Authenticating Request");
	}

}

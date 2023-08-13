package com.dhirajapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
		ShoppingCart sp=context.getBean(ShoppingCart.class);
		String status="Cancled";
		sp.checkout(status);
 	}

}

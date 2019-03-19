package com.capgemini.dev.spring.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DogTest {
public static void main(String[] args) {
	
	AnnotationConfigApplicationContext ctx = 
			new AnnotationConfigApplicationContext(DogConfig.class);
	Dog d = ctx.getBean(Dog.class);
	System.out.println(d);
	ctx.close();
	
}
}

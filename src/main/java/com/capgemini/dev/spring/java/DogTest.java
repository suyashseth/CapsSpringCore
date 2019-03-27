package com.capgemini.dev.spring.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DogTest {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(DogConfig.class);
		
		String []beans = ctx.getBeanDefinitionNames();
		for(String bean:beans)
		{
			System.out.println(bean);
		}
		
		ctx.close();

	}
}

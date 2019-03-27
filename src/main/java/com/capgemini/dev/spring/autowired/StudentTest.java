package com.capgemini.dev.spring.autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentTest {
public static void main(String[] args) {
	
	AnnotationConfigApplicationContext ctx = 
			new AnnotationConfigApplicationContext(StudentCofig.class);
	Students s = ctx.getBean(Students.class);
	System.out.println(s);
//	s.getJ().doWork();
	
//	String [] bean = ctx.getBeanDefinitionNames();
//	
//	for(String b:bean)
//	{
//		System.out.println(b);
//	}
	
	
	
	
	
	ctx.close();
	
}
}

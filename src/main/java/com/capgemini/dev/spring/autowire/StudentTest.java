package com.capgemini.dev.spring.autowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentTest {
public static void main(String[] args) {
	
	AnnotationConfigApplicationContext ctx = 
			new AnnotationConfigApplicationContext(StudentCofig.class);
	Student s = ctx.getBean(Student.class);
	s.getJ().doWork();
	ctx.close();
	
}
}

package com.capgemini.dev.spring.mixconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.dev.spring.java.Dog;
import com.capgemini.dev.spring.xml.Person;

public class CatTest {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(MonkeyConfig.class);
		Monkey m = ctx.getBean(Monkey.class);
		Cat c = ctx.getBean(Cat.class);
		System.out.println(m);
		Dog d = ctx.getBean(Dog.class);
		d.getJob().doWork();
		c.getMouse().eat();
		Person p = ctx.getBean(Person.class);
		System.out.println(p);
		ctx.close();
	}
}

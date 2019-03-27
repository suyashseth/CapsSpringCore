package com.capgemini.dev.spring.mixconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.dev.spring.xml.Person;
import com.capgemini.dev.spring.xml.Tiger;

public class Test {
public static void main(String[] args) {
	
	ClassPathXmlApplicationContext ctx = 
			new ClassPathXmlApplicationContext("TigerConfig.xml");
	Cat c = ctx.getBean(Cat.class);
	c.getMouse().eat();
    Tiger t = ctx.getBean(Tiger.class);
    System.out.println(t);
	ctx.close();
	
	
	
}
}

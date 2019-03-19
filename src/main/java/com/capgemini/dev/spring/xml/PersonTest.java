package com.capgemini.dev.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
	public static void main(String[] args) {

       ClassPathXmlApplicationContext ctx = 
    		       new ClassPathXmlApplicationContext("PersonConfig.xml");
        Person p = ctx.getBean(Person.class);
        System.out.println(p); 
        p.getJob().dowork();
       
//        System.out.println(p.getAge());
//        System.out.println(p.getId());
//        System.out.println(p.getName());
	}
}

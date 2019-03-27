package com.capgemini.dev.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TigerTest {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = 
				 new ClassPathXmlApplicationContext("TigerConfig.xml");
		
		Tiger t1 = ctx.getBean(Tiger.class);
//	    t1.usepanther();
		System.out.println(t1);
		ctx.close();

	}
}

package com.capgemini.dev.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
	public static void main(String[] args) {

       ClassPathXmlApplicationContext ctx = 
    		       new ClassPathXmlApplicationContext("PersonConfig.xml");
       
       Person p = ctx.getBean(Person.class);
//      String []beans =  ctx.getBeanDefinitionNames();
//      
//      for(String bean:beans)
//      {
//    	  System.out.println(bean);
//      }
        
        ctx.close();
       
        System.out.println(p.getAge());
        System.out.println(p.getId());
        System.out.println(p.getName());
	}
}

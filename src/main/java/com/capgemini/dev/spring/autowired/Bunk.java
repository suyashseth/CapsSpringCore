package com.capgemini.dev.spring.autowired;

import javax.inject.Named;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
@Named
@Primary
public class Bunk implements Job{

	@Override
	public void doWork() {
        System.out.println("Bunking lectures");		
	}

}

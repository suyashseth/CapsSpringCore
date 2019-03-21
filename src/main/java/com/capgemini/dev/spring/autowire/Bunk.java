package com.capgemini.dev.spring.autowire;

import javax.inject.Named;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
@Named("bunk")
@Primary
public class Bunk implements Job{

	@Override
	public void doWork() {
        System.out.println("Bunking lectures");		
	}

}

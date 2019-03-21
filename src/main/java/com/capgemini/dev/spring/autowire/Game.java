package com.capgemini.dev.spring.autowire;

import javax.inject.Named;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
@Named("game")
@Primary
public class Game implements Job{

	@Override
	public void doWork() {
	    System.out.println("Playing PUB-G");
	}

}

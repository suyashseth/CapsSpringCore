package com.capgemini.dev.spring.autowired;

import javax.inject.Named;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Named("game")
@Primary
public class Game implements Job{

	@Override
	public void doWork() {
	    System.out.println("Playing PUB-G");
	}

}

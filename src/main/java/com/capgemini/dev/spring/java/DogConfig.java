package com.capgemini.dev.spring.java;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class DogConfig {

	@Bean("DogBeanCustom")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Dog getDog(@Qualifier("sleep") Job j )
	{
		Dog d = new Dog();
		d.setName("Jack");
		d.setColor("Grey");
		d.setBreed("lebra");
		d.setJob(j);
		return d;
	}
	@Primary
	@Bean("sleep")
	public Sleep doSleep()
	{
		Sleep s = new Sleep();
		return s;
	}
	@Primary
	@Bean("bark")
	public Bark doBark()
	{
		Bark b = new Bark();
		return b;
	}
	@Primary
	@Bean("bite")
	public Bite doBite()
	{
		Bite b = new Bite();
		return b;
	}	
}

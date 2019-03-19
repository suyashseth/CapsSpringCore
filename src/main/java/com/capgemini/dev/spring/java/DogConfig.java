package com.capgemini.dev.spring.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DogConfig {

	@Bean
	public Dog getDog()
	{
		Dog d = new Dog();
		d.setName("Jack");
		d.setColor("Grey");
		d.setBreed("lebra");
		return d;
	}
}

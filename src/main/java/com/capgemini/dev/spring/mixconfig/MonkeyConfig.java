package com.capgemini.dev.spring.mixconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.capgemini.dev.spring.java.DogConfig;

@Configuration
@Import({CatConfig.class,DogConfig.class})
@ImportResource("PersonConfig.xml")
public class MonkeyConfig {

	@Bean("monkey")
	public Monkey getMonkey()
	{
		Monkey m = new Monkey();
		m.setAge(12);
		m.setColor("White");
		m.setName("Baba");
		return m;
	}
}

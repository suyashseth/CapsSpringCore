package com.capgemini.dev.spring.mixconfig;

import org.springframework.stereotype.Component;

@Component
public class Mouse {

	private String name = "jerry";
	private String color = "Brown";
	public void eat()
	{
		System.out.println("Eating cheese");
	}
	
}

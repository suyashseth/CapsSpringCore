package com.capgemini.dev.spring.xml;

public class Singer implements Job
{

	@Override
	public void dowork() {
		System.out.println("Singing");
	}
	
}

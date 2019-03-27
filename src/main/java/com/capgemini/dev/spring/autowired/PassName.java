package com.capgemini.dev.spring.autowired;

import org.springframework.stereotype.Component;

@Component("name")
public class PassName {

	public String name()
	{
		return "Pooja";
	}
}

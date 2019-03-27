package com.capgemini.dev.spring.mixconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cat {

	private String name = "tom";
	private String color = "blue";
	
	@Autowired
	private Mouse mouse;
	public Mouse getMouse() {
		return mouse;
	}
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	
}

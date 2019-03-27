package com.capgemini.dev.spring.xml;

import java.util.List;
import java.util.Set;

public class Tiger {

	private int id;
//	private List<String>name;
	private Set<String>name;
	private String color;
	
	public Tiger(int id, Set<String>name, String color) {
		
		this.id = id;
		this.name = name;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Tiger [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	
	
	
}

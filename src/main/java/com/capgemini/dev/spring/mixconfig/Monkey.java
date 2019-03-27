 package com.capgemini.dev.spring.mixconfig;

public class Monkey {

	private int age;
	private String name;
	private String color;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Monkey [age=" + age + ", name=" + name + ", color=" + color + "]";
	}
	
	
	
	
}

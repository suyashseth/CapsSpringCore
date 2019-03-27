package com.capgemini.dev.spring.java;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.BeanNameAware;

public class Dog implements BeanNameAware {

	private String name;
	private String breed;
	private String color;
	private Job job;
	
	@PostConstruct
	public void init()
	{
		System.out.println("Custom Init Method");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Custom Destroy");
	}

	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", color=" + color + "]";
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Name of Bean :"+name);
	}
	
}

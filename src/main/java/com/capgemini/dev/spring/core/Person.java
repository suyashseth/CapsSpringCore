package com.capgemini.dev.spring.core;

import org.springframework.stereotype.Component;


public class Person {

	public String passName()
	{
		return "Pooja";
	}
	
	
	private int id;
	private String name;
	private Job job;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", job=" + job + "]";
	}
	
	
}

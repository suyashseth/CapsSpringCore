package com.capgemini.dev.spring.core;

public class TestJob {

	public static void main(String[] args) {
		
		Person p = new Person();
    	Job j = new SoftwareTester();
		p.setId(101);
		p.setName("Baba");
		p.setJob(j);
		
	}
}

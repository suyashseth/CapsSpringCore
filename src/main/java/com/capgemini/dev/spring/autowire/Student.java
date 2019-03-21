package com.capgemini.dev.spring.autowire;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*@Component*/
@Named("student")
public class Student {

	private int id = 101;
	private String name = "Baba";
	
	/* @Autowired */
	@Inject
	@Qualifier("game")
	private Job j;
	public Job getJ() {
		return j;
	}
	public void setJ(Job j) {
		this.j = j;
	}
	
}

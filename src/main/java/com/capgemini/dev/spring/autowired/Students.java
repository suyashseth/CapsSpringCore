package com.capgemini.dev.spring.autowired;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*@Component*/
@Named
public class Students {

	@Value("#{23}")
	private int id;
	@Value("#{name.name().toUpperCase()}")
	private String name;
	
    @Autowired(required=false) 
	/* @Inject */
	@Qualifier("game")
	private Job j;
	public Job getJ() {
		return j;
	}
	public void setJ(Job j) {
		this.j = j;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + "]";
	}

	
}

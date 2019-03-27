package com.capgemini.dev.spring.autowired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.capgemini.dev.spring.mixconfig.Cat;
import com.capgemini.dev.spring.xml.Person;

@Configuration
@ComponentScan  (basePackageClasses= {Students.class}) 
/* ( basePackages="com.capgemini.dev.spring.autowire") */
public class StudentCofig {

}

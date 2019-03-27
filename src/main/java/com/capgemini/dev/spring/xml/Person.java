package com.capgemini.dev.spring.xml;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Person implements BeanNameAware , BeanFactoryAware
, ApplicationContextAware, BeanPostProcessor, InitializingBean
, DisposableBean, BeanClassLoaderAware{

	private int id;
	private String name;
	private double age;
	private List<Job> job;
	
	public List<Job> getJob() {
		return job;
	}
	public void setJob(List<Job> job) {
		this.job = job;
	}
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
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", job=" + job + "]";
	}
	@Override
	public void setBeanName(String name) {
		System.out.println("Bean Name :"+name);
	}
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactory : "+beanFactory);
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("ApplicationContext :"+applicationContext);
	}
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Before Init :"+bean);
		return bean;
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After Init :"+bean);
		return bean;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Bean");
	}
	public void customInit()
	{
		System.out.println("Custom Init method is Executing");
	}
	@Override
	public void destroy()
	{
		System.out.println("Bye Bye Im dying");
	}
	public void customDestroy()
	{
		System.out.println("Bye Bye Again im dying");
	}
	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("ClassLoader :"+classLoader);
	}
	
}

package com.prowing.circular;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class A2 implements ApplicationContextAware, InitializingBean {

	private B b;
	private ApplicationContext context;
	
	public A2() {
		super();
		System.out.println("Inside A2-no-arg constructror");
	}
	
	public A2(B b) {
		super();
		System.out.println("inside A2(B b) constructor");
		this.b = b;
	}
	
	public void setB (B b) {
		System.out.println("Inside setter method of class A2 set(B)");
		this.b = b;
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
 		b= context.getBean(B.class,b);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
 		context = applicationContext;
		
	}
}

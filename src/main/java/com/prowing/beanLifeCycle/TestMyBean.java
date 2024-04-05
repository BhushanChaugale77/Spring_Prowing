package com.prowing.beanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyBean {

	public static void main(String[] args) {
		
		AbstractApplicationContext abcotext = new ClassPathXmlApplicationContext("MyBeanLifeCycle.xml");
		
		MyBean mb = abcotext.getBean(MyBean.class, "mybean");
		
		System.out.println(mb);
		
		abcotext.registerShutdownHook();
		
		
		
	}
	
	
}

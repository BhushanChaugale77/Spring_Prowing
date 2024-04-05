package com.prowing.circular;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCircularDependancy {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("CircularDependancy.xml");
		
//		A beanA = context.getBean(A.class, "a");
		
		A2 beanA = context.getBean(A2.class,"a");
		
		B beanB = context.getBean(B.class, "b");
		
		System.out.println(beanA);
		System.out.println(beanB);
		
		
	}
	
	
}

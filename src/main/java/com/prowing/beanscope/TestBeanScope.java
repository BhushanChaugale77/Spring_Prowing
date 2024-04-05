package com.prowing.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanScope {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beanScope.xml");
		
		Employee emp = context.getBean(Employee.class, "employee");
		System.out.println(emp.hashCode());
		System.out.println(emp);
		
		Employee emp2 = context.getBean(Employee.class, "employee");
		System.out.println(emp2.hashCode());
		System.out.println(emp2);
		
		System.out.println(emp == emp2);
		System.out.println(emp.getAddress()==emp2.getAddress());
		
		
//		Student std = context.getBean(Student.class, "student");
//		System.out.println(std.hashCode());
//		System.out.println(std);
		
		
		
		
		
	}
	
	
	
}

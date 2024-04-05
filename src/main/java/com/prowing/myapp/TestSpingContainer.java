package com.prowing.myapp;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpingContainer {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp1 = context.getBean(Employee.class,"emp");
		Employee emp2 = context.getBean(Employee.class, "emp");
		
		System.out.println("<<<<<<<<<<--->>>>>"+(emp1=emp2));
		
		System.out.println(emp1);
		
		Student student = context.getBean(Student.class,"std");
		System.out.println(student);
		
		Car retrivedCar = context.getBean(Car.class,"car");
		System.out.println(retrivedCar);
	}
}

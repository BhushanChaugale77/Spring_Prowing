package com.prowing.circular;

public class A {

	private B b;
	
	public A() {
		super();
		System.out.println("Inside A-no-arg constructror");
	}
	
	public A(B b) {
		super();
		System.out.println("inside A(B b) constructor");
		this.b = b;
	}
	
	public void init() {
		
		System.out.println("setting circular dependancy using custom init method");
		b.setA(this);
	}
	
	public void setB (B b) {
		System.out.println("Inside setter method of class A set(B)");
		this.b = b;
		
	}
}

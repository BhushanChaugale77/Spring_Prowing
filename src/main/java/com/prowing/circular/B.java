package com.prowing.circular;

public class B {

	private A a;
	
	public B() {
		super();
		System.out.println("Inside B no-arg constructor");
	}
	
	public B(A a) {
		super();
		System.out.println("Inside B constructor B(A a)");
	}
	
	public void setA(A a) {
		this.a = a;
	}
}

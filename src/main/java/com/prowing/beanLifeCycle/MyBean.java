package com.prowing.beanLifeCycle;

public class MyBean {

	private int id;
	private String name;
	
	public MyBean() {
		super();
	}
	
	public void myInitMethod() {
		
		System.out.println("Inside myInitMethod()");
	}
	
	public void myDestroyMethod() {
		System.out.println("Inside myDestroyMethod()");
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String setName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "MyBean[id= " + id + ",name= " + name + "]";
	}
}

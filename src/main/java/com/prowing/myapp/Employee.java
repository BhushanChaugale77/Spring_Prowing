package com.prowing.myapp;

public class Employee {

	private int id;
	private String name;
	private String address;
	
	public Employee() {
		super();
	}
	
	public Employee(int id, String name, String address) {
		super();
		System.out.println("inside constructor arg");
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		System.out.println("inside setid");
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		System.out.println("inside setname");
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		System.out.println("inside setAddress");
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}

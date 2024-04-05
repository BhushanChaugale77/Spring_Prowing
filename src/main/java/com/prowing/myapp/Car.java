package com.prowing.myapp;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Car {

	private int id;
	private String company;
	private List<String> features;
	private Set<String> components;
	private Map<Integer, String> parts;
	private Properties carProps;
	
	public Car() {
		super();
	}
	
	public Car(int id, String company, List<String> features, Set<String> components, Map<Integer, String> parts, Properties carProps) {
		super();
		this.id = id;
		this.company = company;
		this.features = features;
		this.components = components;
		this.parts = parts;
		this.carProps =carProps;
	}
	
	public int getId() {
		return id;
	}
	
	public void setid(int id) {
		this.id = id;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company){
		this.company = company;
	}

	public List<String> getFeatures(){
		return features;
	}
	
	public void setFeatures(List<String> features) {
		this.features = features;
	}
	
	public Set<String> getComponents(){
		return components;
	}
	
	public void setComponents(Set<String> components) {
		this.components = components;
	}
	
	public Map<Integer, String> getParts(){
		return parts;
	}
	
	public void setParts(Map<Integer, String> parts) {
		this.parts = parts;
	}
	
	public Properties getCarProps() {
		return carProps;
	}
	
	public void setCarProps(Properties carProps) {
		this.carProps = carProps;
	}


	public String toString() {
		return "Car[id= " + id + ",company= " + company + ",features= " + features + 
				",components= " + components + ",parts= " + parts + ",carProps" + carProps +"]";
	}









}






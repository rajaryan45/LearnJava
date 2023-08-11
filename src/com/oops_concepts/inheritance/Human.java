package com.oops_concepts.inheritance;
/*
 * It's a parent class as Human
 */
public class Human { 
	// DATA MEMBER 
	private int age;   
	private String name;
	protected char gender; // M or F
	
	//Constructor
	public Human(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	// Methods
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}

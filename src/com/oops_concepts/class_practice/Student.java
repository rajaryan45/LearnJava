package com.oops_concepts.class_practice;

public class Student {
	// below metioned are properties or data member of Student class
	public int rollno;
	public String name;
	public String course;
	public int m1, m2 , m3;// marks
	
	// below are methods deciding functionality of data members
	public int total() {
		// here you can add all the marks
			return this.m1 + this.m2 + this.m3;
	}
	
	public float average() {
		// using this keyword is optional but using this keyword is a good practice 
		// this keyword helps to reduce ambiguity 
		return (m1+m2+m3)/3;
	}
}

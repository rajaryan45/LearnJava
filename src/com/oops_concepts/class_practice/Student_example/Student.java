package com.oops_concepts.class_practice.Student_example;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	//Data Members
	/*
	 *  
	    The private access modifier is specified using the keyword private. 
	    The methods or data members declared as private are accessible only within the class in which they are declared.

		Any other class of the same package will not be able to access these members.
		Top-level classes or interfaces can not be declared as private because
		private means “only visible within the enclosing class”.
		protected means “only visible within the enclosing class and any subclasses”
	 */
	private int rollNo; //  always remeber coding practices, variable names should be descriptive 
	private String name; // variable names should be start with lower case and Came case
	
	/*
	 *  We have created a class Subjects
	 *  DATA MEMBERs :-> name , marks  
	 *  
	 *  and below we are taking arraylist of type Subjects to store multiple data
	 * 
	 */
	private ArrayList<Subjects> subjects ; //We have taken an arraylist for subjects as a student may have more than one subject
	private String address;
		
	
	public Student(int rollNo, String name, String address) {// It's a parameterized constructor.
		/*
		 * In Java, a constructor is a block of codes similar to the method.
		 * It is called when an instance of the class is created.
		 * At the time of calling constructor, memory for the object is allocated in the memory.
		 * 
		 * 	Constructor name must be the same as its class name
		 *	A Constructor must have no explicit return type
		 *	A Java constructor cannot be abstract, static, final, and synchronized
		 */
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.setSubjects();
	}
	
	public Student() {
		super();
	}

	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setSubjects() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\nEnter number of subjects : ");
		int n = sc.nextInt();
		sc.nextLine();
		subjects = new ArrayList<Subjects>();
		for(int i = 0 ; i<n ; i++) {
			Subjects sub = new Subjects();
			System.out.print("\nEnter subject Name : ");
			String name = sc.nextLine();
			System.out.print("\nEnter subject Marks : ");
			int marks = sc.nextInt();
			sc.nextLine();
			sub.setName(name);
			sub.setMarks(marks);
			subjects.add(sub);
		}
	}
	
	public void getSubjects() {
		for(int i = 0 ; i<this.subjects.size() ; i++) {			
			System.out.println(" Subject : " + this.subjects.get(i).getName() + "  Marks : " + this.subjects.get(i).getMarks());
		}
	}
	
	
	public void totalMarks() {
		int sum = 0 , total=0 ;
		for(int i = 0 ; i<this.subjects.size() ; i++) {			
			sum += this.subjects.get(i).getMarks();
			total+=100;
		}
		System.out.println(" Scored Mark : "+sum+ "   Total Marks : "+total);
	}
	
	public void displayDetails() {
		System.out.println("Student Name : "+ this.getName());
		System.out.println("Student Roll : "+ this.getRollNo());
		this.getSubjects();
		this.totalMarks();
		System.out.println("Addres : " + this.getAddress());
	}
	
	
}

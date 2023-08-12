package com.oops_concepts.inheritance.method_overriding;

public class Main {

	public static void main(String[] args) {
		
		// First we will create an object of Child Class
		Child child = new Child();
		child.printHello();
		
		//Second object of Parent class
		Parent parent = new Parent();
		parent.printHello();
		
		//Third Reference variable of type Parent and reference of type Child
		Parent parent2 = new Child();
		parent2.printHello();

		/*
		 * output : 
		 * 			Child:printHello: Hello Geeks!
		 *			Parent:printHello:  Hello Geeks!
		 *			Child:printHello: Hello Geeks!
		 * 
		 * In third case we can printHello of Child class was called this is because the 
		 * reference variable parent2 had an object/reference/pointing to a space in memory 
		 * which is of type Child.  
		 * 
		 * And this is known as runtime polymorphism.
		 */


	}

}

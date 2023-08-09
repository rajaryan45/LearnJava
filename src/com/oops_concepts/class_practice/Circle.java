package com.oops_concepts.class_practice;
/*
 * In this package we will learn how to create class 
 */
public class Circle {
// always remember that file name and public class name will be same 
// and in one java file you can have only one public class having same name as of file name
// any other class can be defined as only clas <name>
	
	public double radius;// DATA MEMBER 
	/*
	 *  Data member shows properties of class or what object properties values are.
	 */
	
	// METHODS
	/*
	 * Methods decides functionality of properties or how data members are going to be used
	 */
	public double area() {
		return 3.14*(this.radius)*(this.radius);
		//this can be used to refer current class instance variable.
	}
	
	public double perimeter() {
		return 2 * 3.14 * (this.radius);
	}
	
}

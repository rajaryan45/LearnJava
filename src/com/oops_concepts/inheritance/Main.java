package com.oops_concepts.inheritance;

// In this class we will execute.
public class Main {

	public static void main(String[] args) {
		// First , create an object of child Class Student
		Student student = new Student(17, "Raj", 141, 12); // Here I am passing values directly you can modify code to take inputs
		/*
		 *  as you can remember we have two types of constructor so we will use constructor which
		 *  will initializes all the data members of child and parent class.
		 *  See according to our classes we have to initialized at least parent class data member while creating 
		 *  an object because we don't have any non parameterized constructor in parent Class Human.
		 *  
		 */
		student.showDetails();
		
		Human human   =    new Student(18, "Aryan", 140, 12);
	  
		/*
		 * Here comes one of the important part of inheritance
		 *  https://www.geeksforgeeks.org/reference-variable-in-java/
		 *  
		 *  please refer to above link as it had explained properly about object and reference
		 *  now comes an important rule that we can create an object of type Parent class 
		 *  which have reference of Child class.
		 * So it basically means that The parent class can hold reference to both the parent and child objects.
		 * 
		 * guys ,  Let discuss some terminologies in depth 
		 * list of words which I will explain in below para
		 *  [ object , reference , reference variable , instance  , space in memory]
		 *  
		 *  So the whole discussion is going to be on 
		 *  Human ref = new Human();
		 *  so, the variable 'ref' is known as REFERENCE VARIABLE of type Human.
		 *  'new' it will allocate a memory/space in main memory,   
		 *  that memory/space which was allocated is known as OBJECT.
		 *  'Human()' it will call constructor and constructor will return a REFERNCE of that
		 *  object or space allocated in memory.
		 *  
		 *  So now put them in a sequence,
		 *  first we will take a reference variable of <class> type then we allocate a space in main memory
		 *  using 'new' keyword and that space in main memory is known as Object. After that a 
		 *  constructor call initiated which will return a reference to that object.
		 *  The reference which was returned will be assigned to reference variable and using dot operator (.)
		 *  we will access data members and methods according to their visibility/access modifier. 
		 *  
		 *  Please, also search more about this in Google and go through several videos 
		 *  If you can't understand this because it is important to konw how object are created.
		 *  
		 */


	}

}

package com.oops_concepts.inheritance;
// It will be a base class    
// and at end you are also going to see most beautiful thing about java.
public class Student extends Human {
	
	private int roll ;
	private int cls;
	/*
	 *  as you can see extends keyword is used to inherit Human class.
	 *  so as we had studied it will have a IS - A relation.
	 *  Student IS - A Human.
	 *  When we extends to class so we also need to invoke a super() inside constructor.
	 *  So always remember that first constructor of parent class will be executed first then child class constructor.
	 *  Let take an example 
	 * 			
	 * 			B extends C 
	 *  		A extends B
	 *  		
	 *  so  if an object is created of A then order of constructor invocation will be 
	 *  		C -> B -> A
	 *   
	 */
	public Student(int age, String name, int roll, int cls) {
		super(age, name);
		this.roll = roll;
		this.cls = cls;
		
		/*
		 * super() will call its parent class constructor.
		 * And if you try to call super after initialization of child class data member it will show an error
		 * that is : Constructor call must be the first statement in a constructor
		 *		try this you will see above mentioned error statement.
		 *		{
		 *		 	this.roll = roll;
		 * 			this.cls = cls;
		 * 			super(age, name);
		 * 		}
		 * 
		 * so always remember that super() call must be first in child class constructor.
		 */
	}
	public Student(int age, String name) {
		super(age, name);
	}
	
	//Methods
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getCls() {
		return cls;
	}
	public void setCls(int cls) {
		this.cls = cls;
	}
	
	private void printHello() {
		System.out.println("Hello Geeks");
	}
	
	/*
	 * So let's discuss one of the most important topic that is 
	 * access modifiers.
	 * 
	 * Java have four types of access modifiers:
	 * 1) private : The access level of a private modifier is only within the class.
	 * 				It cannot be accessed from outside the class.
	 * 				Even child class methods can't access private data members and methods directly.
	 * 				objects of any class can't access private data members and methods.
	 * 				
	 * 				Private data members are only accessible to methods of that class only to whom they belongs.
	 * 				private methods also can be called from it own methods
	 * 
	 * 2) default : The access level of a default modifier is only within the package. It cannot be accessed from outside the package. 
	 * 				If you do not specify any access level, it will be the default.
	 * 
	 * 3) protected : The access level of a protected modifier is within the package and outside the package through child class. 
	 * 				  If you do not make the child class, it cannot be accessed from outside the package
	 * 
	 * 4) public : The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, 
	 * 			    within the package and outside the package.
	 * 
	 * So lets see with a method and check can we access data members of Parent class Human
	 * 
	 */
	
	public void showDetails() {
		/* so to check which data members you can access just use this keyword
		 *  so when I typed this.name its shows : The field Human.name is not visible
		 *  System.out.println("Name : " + this.name);
		 *  Thats why we use getters and setters now see how I will use getter......
		 */
		printHello();//private methods can be accessed by methods of its own class.
				
		System.out.println("Name : " + this.getName() + "\nAge : " + this.getAge() + "\nGender : " + this.gender);
		System.out.println("Roll : " + this.roll + "\n Class : "+ this.cls);
		/*
		 *  as you can see I can access this.gender    because its protected and both parent(Human)
		 *  and child(Student) classes are in same package so I can access protected data members.
		 *  
		 *  this.roll I can access roll directly but roll is a private data member,
		 *  so can I access it , the reason is private data members of a class (Here Student) can 
		 *  be accessed by its own METHODS.
		 *  So methods of the class is the only way to access private data members and methods. 
		 *  
		 *  TIPS : always remember printing in output screen is from left to right they new line
		 *   so always write a meaning full statements in println,  so that you can understand 
		 *   whats happening inside that method and this is a good practice as a developer. 
		 */
	}
	
	/*
	 *  So Lets know what power java gives you that is package
	 *  
	 *  A package in Java is used to group related classes. Think of it as a folder in a file directory.
	 *  We use packages to avoid name conflicts, and to write a better maintainable code.
	 *  
	 *  Lets take example from this project only ,that is 
	 *  
	 *  you can see we have various packages but look at below mentioned package:
	 *  com.oops_concepts.class_practice
	 *  com.oops_concepts.class_practice.Student_example
	 *  com.oops_concepts.inheritance
	 *  
	 *  can you see anything common
	 *  Yes! , Student.java 
	 *  so you can see 3 different package but they all have Student.java (class) but
	 *  all of them executes some different task.
	 *  This help us to make new class without whoring about name 
	 *  but remember inside one package we can't have multiple class with same name but it can 
	 *  be achieved by multiple package , So always use to create new package. 
	 *   
	 * 
	 * 
	 *  Now this class will be executed in Main.java by creating an object of this class and 
	 *  you will also learn some more about Java.
	 */

}

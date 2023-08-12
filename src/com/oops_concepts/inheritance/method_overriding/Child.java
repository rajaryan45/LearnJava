package com.oops_concepts.inheritance.method_overriding;

public class Child extends Parent {
	
	@Override
	protected void printHello() {
		/*
		 * On the top of the method you can see an annotation as Override this is because
		 * we had overridden a Parent method in Child class, now when code will be executed we
		 * will see which method will be called by our reference variable.		  
		 */
		System.out.println("Child:printHello: Hello Geeks!");
	}
}

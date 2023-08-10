package com.oops_concepts.class_practice.Student_example;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student;
		String nameString = null;
		String address = null;
		int roll = 0 ; 		
		try {
			System.out.print("Enter name : ");
			nameString = sc.nextLine();
			System.out.print("\nEnter roll : ");
			roll = sc.nextInt();
			sc.nextLine();
			System.out.print("\nEnter address : ");
			address = sc.nextLine();
			student = new Student(roll, nameString, address);
			System.out.println("\n\nWe have entered all the details now we will se methods ");
			student.displayDetails();
			System.out.println("***********************************");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

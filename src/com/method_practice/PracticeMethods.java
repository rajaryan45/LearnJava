package com.method_practice;

public class PracticeMethods {

	// Here we will use static methods, So we dont need to create any objects in main method
	//Q1 Area
	static int area(int l , int b) { // rectangle
		return l*b;
	}
	static float area(float radius) {
		return 3.14f*radius*radius;
		// here I have used 'f'  because in java decimal values are treated as double
		// so we have to write 3.14f 
	}
	static int area(int s) {
		return s*s;
	}
	
	
	// Q2 Reverse overloading
	static int reverse(int num) {
		int rev = 0 ,  dig;
		while (num>0) {
			dig = num%10;
			rev = (rev*10)+dig;
			num /= 10;
			
		}
		return rev;
	}
	static void reverse(int ar[],int n) {
		// In Java Array is treated as an object and its always call as reference,
		// so no need to return an array
		for(int i = 0 , j = n-1 ; i<n/2;i++,j--) {
			ar[i] = ar[i] + ar[j];
			ar[j] = ar[i] - ar[j];
			ar[i] = ar[i] - ar[j];
		}
		
	}
	public static void main(String[] args) {
		// Q1 -> Overload to calculate areas of different shapes
		System.out.println("Q1 area");
		System.out.println("Rectangle : "+area(2,3));
		System.out.println("Square : "+area(2));
		System.out.println("Circle : "+area(2.5f));
		
		// Q2 -> Overload method reverse to reverse int and array
		System.out.println("\nQ2 reverse");
		System.out.println("num reverse of 23 : "+ reverse(23));
		int[] ar = {1,2,3,4};
		reverse(ar, 4);
		System.out.print("array reverse of 2,3,4 : " );
		for(int i = 0 ; i<4 ; i++)
		{
			System.out.print(ar[i] + ",");
		}
		
		
	}

}

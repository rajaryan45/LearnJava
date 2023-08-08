package com.learn;

public class Methods {
	 
	static int max(int x , int y) {
		if(x>y)
			return x;
		else {
			return y; 
		}
	}
	public int maxNonStatic(int x , int y) { // example for non static
		if(x>y)
			return x;
		else {
			return y; 
		}
	}
	
	public static void main(String[] args) {
		
		int a = 10 , b = 15 ; 
		System.out.println("Max number : "+max(a, b));// Static function can only call static funtions 
		/*
		 * so to access non Static methods you have to create objects like below given exampple
		 */
		Methods objMethods = new Methods();
		System.out.println("MAx number (non static way ): " +objMethods.maxNonStatic(a, b));
	}

}

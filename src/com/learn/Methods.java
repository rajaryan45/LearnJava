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

	/*
	 *  Method Overloading for max function
	 */
	
	int maxOverLoad(int x , int y) { // Method 1
		return x>y?x:y;
	}
	float maxOverLoad(float x, float y) { // Method 2
		return x>y?x:y;
	}
	
	public static void main(String[] args) {
		
		int a = 10 , b = 15 ; 
		System.out.println("Max number : "+max(a, b));// Static function can only call static funtions 
		/*
		 * so to access non Static methods you have to create objects like below given exampple
		 */
		Methods objMethods = new Methods();
		System.out.println("MAx number (non static way ): " +objMethods.maxNonStatic(a, b));
		
		/*
		 *   METHOD OVERLOADING
		 *   
		 *   Writing more than one methods with same name but with different parameters 
		 *   1) different datatype
		 *   2) number of parameters
		 *   
		 *   Method Overloading helps us to achieve OOPS important concept that is
		 *   POLYMERPHISM -> Polymorphism allows us to perform a single action in different ways. 
		 *   In other words, polymorphism allows you to define one interface and have multiple implementations. 
		 *   The word “poly” means many and “morphs” means forms, So it means many forms.
		 *   
		 */
		
		System.out.println("Method Overloading : ");
		// below line will call Method 1 in comments
		System.out.println(objMethods.maxOverLoad(2, 3)); // We can also make maxOverLoad method as STATIC
		// below line will call Method 2 in comments
		System.out.println(objMethods.maxOverLoad(2f, 4f));// But we have used object to access the method
		/*
		 *  for first call of objMethods.maxOverLoad(2,3) 
		 *  - int data are passed 
		 *  but in second call we have used 'f' -> float
		 *  which will convert int to float explicitly 
		 */
		
		
	}

}

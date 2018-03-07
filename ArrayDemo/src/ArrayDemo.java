/**
 * Author:	Sam Cooney
 * Project:	ArrayDemo
 * Date:	Nov 8, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: 
 */

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		// Question 1: 
		// Prints out all 0s.
		// Question 2:
		// Prints out all 0.0s.
		// Question 3:
		// Prints out all false.
		// Question 4:
		// Prints out empty spaces.
		// Question 5:
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
		// at ArrayDemo.main(ArrayDemo.java:170)
		
		
		//***************************
		// Part 1 - Original Program
		//***************************
		
		Scanner scan = new Scanner(System.in);	// Initialize object of Scanner class.
		int[] anArray;				// Declare int array.
		anArray = new int[10];		// Initialize int array.
		double[] anArray2;			// Declare double array.
		anArray2 = new double[10];	// Initialize double array.
		boolean[] anArray3;			// Declare boolean array.
		anArray3 = new boolean[10];	// Initialize boolean array.
		char[] anArray4;			// Declare char array.
		anArray4 = new char[26];	// Initialize char array.
		int[] anArray5;				// Declare user input array.
		anArray5 = new int[10];		// Initialize user input array.
		
		anArray[0] = 100;		// Set value for index 0.
		anArray[1] = 200;		// Set value for index 1.
		anArray[2] = 300;		// Set value for index 2.
		anArray[3] = 400;		// Set value for index 3.
		anArray[4] = 500;		// Set value for index 4.
		anArray[5] = 600;		// Set value for index 5.
		anArray[6] = 700;		// Set value for index 6.
		anArray[7] = 800;		// Set value for index 7.
		anArray[8] = 900;		// Set value for index 8.
		anArray[9] = 1000;		// Set value for index 9.
		
		System.out.println("Element at index 0: " + anArray[0]);
		System.out.println("Element at index 1: " + anArray[1]);
		System.out.println("Element at index 2: " + anArray[2]);
		System.out.println("Element at index 3: " + anArray[3]);
		System.out.println("Element at index 4: " + anArray[4]);
		System.out.println("Element at index 5: " + anArray[5]);
		System.out.println("Element at index 6: " + anArray[6]);
		System.out.println("Element at index 7: " + anArray[7]);
		System.out.println("Element at index 8: " + anArray[8]);
		System.out.println("Element at index 9: " + anArray[9]);
		System.out.println();
		
		//***************************
		// Part 1 -Rewrite A
		//***************************
		
		for(int i=0;i<10;i++) {		// Reset loop for array values.
			
			anArray[i] = 0;						// Set array values to 0.
			//System.out.println(anArray[i]);	// Test for reset loop.
		}
		
		anArray[0] = 100;		// Set value for index 0.
		anArray[1] = 200;		// Set value for index 1.
		anArray[2] = 300;		// Set value for index 2.
		anArray[3] = 400;		// Set value for index 3.
		anArray[4] = 500;		// Set value for index 4.
		anArray[5] = 600;		// Set value for index 5.
		anArray[6] = 700;		// Set value for index 6.
		anArray[7] = 800;		// Set value for index 7.
		anArray[8] = 900;		// Set value for index 8.
		anArray[9] = 1000;		// Set value for index 9.
		
		for(int i=0;i<10;i++) {	// For loop to print out array values.
			
			System.out.println("Element at index " + i + ": " + anArray[i]);
		}
		System.out.println();
		
		//***************************
		// Part 1 -Rewrite B
		//***************************
		
		for(int i=0;i<10;i++) {		// Reset loop for array values.
			
			anArray[i] = 0;						// Set array values to 0.
			//System.out.println(anArray[i]);	// Test for reset loop.
		}
		
		for(int i=0;i<10;i++) {	// For loop to set array values.
			
			anArray[i] = i*100+100;	// Set array values.
		}
		
		System.out.println("Element at index 0: " + anArray[0]);
		System.out.println("Element at index 1: " + anArray[1]);
		System.out.println("Element at index 2: " + anArray[2]);
		System.out.println("Element at index 3: " + anArray[3]);
		System.out.println("Element at index 4: " + anArray[4]);
		System.out.println("Element at index 5: " + anArray[5]);
		System.out.println("Element at index 6: " + anArray[6]);
		System.out.println("Element at index 7: " + anArray[7]);
		System.out.println("Element at index 8: " + anArray[8]);
		System.out.println("Element at index 9: " + anArray[9]);
		System.out.println();
		
		//***************************
		// Part 2 - Array of Double
		//***************************
		
		for(int i=0;i<10;i++) {	// For loop for double array.
			
			anArray2[i] = Math.random();	// Creates random values between 0 and 1.
			System.out.println("Element at index " + i + ": " + anArray2[i]);
		}
		System.out.println();
		
		//***************************
		// Part 2 - Array of Boolean
		//***************************
		
		for(int i=0;i<10;i++) {	// For loop for boolean array.
			
			if(i%2 == 0) {		// For even numbered indexes.
				
				anArray3[i] = true;		// Sets even to true.
			} else {			// For odd numbered indexes.
				
				anArray3[i] = false;	// Sets odd to false.
			}
			System.out.println("Element at index " + i + ": " + anArray3[i]);
		}
		System.out.println();
		
		//***************************
		// Part 2 - Array of Char
		//***************************
		
		for(int i=0;i<26;i++) {	// For loop for char array.
			
			anArray4[i] = (char)(i+97);	// Use char casting to set array values.
			System.out.println("Element at index " + i + ": " + anArray4[i]);
		}
		System.out.println();
		
		//***************************
		// Part 2 - Array of User In
		//***************************
		
		for(int i=0;i<10;i++) {	// For loop for user input array.
			
			System.out.println("Please input an integer value for index " + i);
			anArray5[i] = scan.nextInt();	// Scan in values.
			scan.nextLine();				// Skip line.
			System.out.println("Element at index " + i + ": " + anArray5[i]);
		}
		System.out.println(anArray5[10]);
		
		scan.close();	// Close scanner.
	}

}

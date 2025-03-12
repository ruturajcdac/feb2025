/*

Q5: Write a Java program to swap two numbers using the += and -= operators only.

*/


import java.util.*;

class Que_5{
	public static void main(String args[]){
		
		int a = 35;
		int b = 81;
		
		System.out.println("Before swapping: ");
		System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);
		
		
		a += b;
		b = (a-b);
		a -= b;
		
		
		System.out.println();
		System.out.println("After swapping: ");
		System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);	
		

		
			
	}
		
		
}

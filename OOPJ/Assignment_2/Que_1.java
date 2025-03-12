/*

Q1: Write a program to swap two numbers without using a third variable and without
using arithmetic operators like + or -.
Hint: Use bitwise XOR ^ operator
*/


import java.util.*;

class Que_1{
	public static void main(String args[]){
		
		int a = 7;
		int b = 10;
		
		System.out.println("Before swapping: ");
		System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);
		System.out.println();
		
		a = a^b;
		System.out.println("The value of a = a^b : " + a);
		
		b = a^b;
		System.out.println("The value of b = a^b : " + b);
		
		a = a^b;
		System.out.println("The value of a = a^b : " + a);
		
		System.out.println();
		System.out.println("After swapping: ");
		System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);
			
	}
		
		
}

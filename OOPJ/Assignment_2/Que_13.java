/*

Q13: Implement a Java program to find the absolute value of an integer using bitwise
operators.

Hint: mask = num >> 31; abs = (num + mask) ^ mask;

*/

import java.util.Scanner;
class Que_13{
	
	
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int mask = num >> 31; // shifts all the bits except the MSB
							  // so for -ve numbers we get 1 after this operation and 0 for +ve numbers 
		
		
		int abs = (num + mask) ;  // if -ve number then num + (-1) = num - 1
								  // if +ve number then num + 0 = num
		
		
		abs = (num + mask) ^ mask; // if mask = 0, then no change for +ve numbers
								   // if mask = -1, then it flips all the bits , x ^ -1 = ~x means it is equivalent to taking 2's complement
		
		
		
		System.out.println("Result of " + num + " abs = " + (abs));
		
		
		
		}
		
		
}

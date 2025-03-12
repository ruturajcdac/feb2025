/*

Q12: Write a Java program to multiply a number by 8 without using * or / operators.
Hint: Use bitwise left shift (<<).

*/

import java.util.Scanner;
class Que_12{
	
	
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		
		System.out.println("Result of " + num + " * 8 = " + (num<<3));
		
		
		
		}
		
		
}

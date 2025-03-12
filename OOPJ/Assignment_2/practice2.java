/*

Q13: Implement a Java program to find the absolute value of an integer using bitwise
operators.

Hint: mask = num >> 31; abs = (num + mask) ^ mask;

*/

import java.util.Scanner;
class practice2{
	
	
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num_ini = sc.nextInt();
		
		int num_fin = num_ini ^ -1;
		
		
		System.out.println("Result of " + num_ini + " abs = " + num_fin);
		
		
		
		}
		
		
}

/*

Q3: Implement a program that calculates the sum of digits of an integer using modulus
(%) and division (/) operators.

*/


import java.util.*;

class Que_3{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		while(num>0){
			
			sum = sum + (num%10);
			num = num/10;
		}
		
		System.out.println("The sum of digits is: "+sum);	
		

		
			
	}
		
		
}

/*

Q4: Write a program to find whether a given number is divisible by 3 without using the
modulus (%) or division (/) operators.
Hint: Use subtraction and bitwise shifts.

*/


import java.util.*;

class Que_4{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		while(num>0){
			
			sum = sum + (num%10); // extract the unit place digit
			num = num/10;         // reduce the number digit by digit
		}
		
		System.out.println("The sum of digits is: "+sum);	
		

		
			
	}
		
		
}

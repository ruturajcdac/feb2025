/*

Q2: Write a program to check whether a given number is even or odd using only bitwise operators.
Hint: Use n & 1 to check.
*/


import java.util.*;

class Que_2{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = sc.nextInt();
		
		if((num & 1) == 0){
			System.out.println(num+" the number is even.");
		}
		else{
			System.out.println(num+" the number is odd.");
		}
		
		

		
			
	}
		
		
}












/* Bitwise NOT 

		int a = 7;
		int b = -10;
		
		a = ~a;
		b = ~b;
		
		System.out.println("~a: "+a);   // -8
		System.out.println("~b: "+b);   // 9


*/

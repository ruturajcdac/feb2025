/*

Q14: Write a program to count the number of 1s (set bits) in a binary representation of a
number using bitwise operations.
Hint: Use n & (n - 1).

*/


import java.util.Scanner;
class Que_14{
	
	
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int count = 0;
		
		while(num>0){
			num = num & num-1; 
			count++;
		}
		
		
		System.out.println("The number of set bits in " + num + " is: " + count);
		
		
		
		}
		
		
}

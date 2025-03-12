/*

Q11: Write a program to check if a given number is a power of 2 using bitwise operators.
Hint: n & (n - 1) == 0 for positive numbers.

*/

import java.util.*;




class Que_11{
	
	static boolean powerOf2(int x){
		return (x>0) && ((x&(x-1)) == 0);
	}
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		
		
		
		
		
		
		if(powerOf2(num)){
			System.out.println("Given number is a power of 2");
		}
		else{
			System.out.println("Given number is NOT a power of 2");
		}
		
		
		
		}
		
		
}

/*

Q15: Implement a program to swap odd and even bits of a number using bitwise
operators.
Hint: Use masks: (x & 0xAAAAAAAA) >> 1 | (x & 0x55555555) << 1

*/


import java.util.Scanner;
class Que_15{
	
	
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int swapped = ((num & 0xAAAAAAAA) >> 1) | ((num & 0x55555555) << 1);
		
		
		System.out.println("After swapping: " + swapped);
		
		
		/*
		Example: Swapping Odd and Even Bits
		Example Input: 23 (10111 in binary)
		Bit Position						4	3	2	1	0
		Original (23)						1	0	1	1	1
		Even Mask (0xAAAAAAAA)				1	0	1	0	1
		Odd Mask (0x55555555)				0	0	0	1	0
		Shift Even Right (>> 1)				0	1	0	1	0
		Shift Odd Left (<< 1)				0	0	0	1	0
		**Final Swapped Result (`>> 1		<< 1`)**	0	1	0	1
		Decimal Value of Swapped Result		43
		
		
		
		
		
		
		*/
		
		
		
		}
		
		
}

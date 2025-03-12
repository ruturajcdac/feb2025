/*

Q17: Implement a Java program that finds the minimum of four numbers using nested
ternary operators.

*/

import java.util.*;

class Que_17{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter 3rd number: ");
		int num3 = sc.nextInt();
		System.out.println("Enter 4th number: ");
		int num4 = sc.nextInt();
		
		
		int result = (num1<num2)?
						(num1<num3)?
							((num1<num4)? num1: num4 )
							: ((num3<num4) ? num3 : num4)
						: (num2<num3) ?
							((num2<num4)? num2: num4 )
							: ((num3<num4) ? num3 : num4);
						
		
		System.out.println("Result: "+ result);
	}
}
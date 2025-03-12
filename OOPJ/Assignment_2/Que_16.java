/*

Q16: Write a program that determines whether a given number is positive, negative, or
zero using only the ternary

*/

import java.util.*;

class Que_16{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		String result = num>=0 ? num>0?"Positive":"Zero" : "Negative";
		
		System.out.println("Given number " + num + " is "+result);
	}
}
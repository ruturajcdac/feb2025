/*

Q19: Write a Java program that checks whether a character is uppercase, lowercase, or
not a letter using only the ternary operator.

*/


import java.util.*;

class Que_19{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		String inpt = sc.nextLine();
		char ch = inpt.charAt(0);
		
		String result = ch>=65 && ch<=90 ? 
							" Uppercase " 
							: ch>=97 && ch<=122 ? 
								" Lowercase " 
								: " not a letter ";
		
		
						
		
		System.out.println("Result: "+ result);
	}
}
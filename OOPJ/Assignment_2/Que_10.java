/*

Q10: Write a program to determine if a character is a vowel or a consonant using the
ternary operator.

*/

import java.util.*;

class Que_10{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		String myStr = sc.nextLine();
		myStr = myStr.toLowerCase(); 
		char myChar = myStr.charAt(0);
		//myChar = myChar.toLowerCase();
		
		String outp = myChar == 'a' || myChar == 'e' || myChar == 'i' || myChar == 'o' || myChar == 'u' ? myChar + " is a vowel" : myChar + " is not a vowel";
		System.out.println(outp);
		
		
		
		}
		
		
}

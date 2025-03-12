/*

Q18: Given a student's percentage, print "Pass" if the percentage is 40 or above; otherwise, print "Fail", using only the ternary operator.
*/

import java.util.*;

class Que_18{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter %: ");
		int num = sc.nextInt();
		String result = num>=40?"Pass" : "Fail";
		
						
		
		System.out.println("Result: "+ result);
	}
}
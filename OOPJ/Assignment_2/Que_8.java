/*

Q8: Write a program that takes three boolean inputs and prints true if at least two of
them are true.
Hint: Use  logical operators (&&, ||).

*/



import java.util.*;

class Que_8{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st value: ");
		boolean v1 = sc.nextBoolean();
		System.out.println("Enter 2nd value: ");
		boolean v2 = sc.nextBoolean();
		System.out.println("Enter 3rd value: ");
		boolean v3 = sc.nextBoolean();
		
		if((v1&&v2) || (v2&&v3) || (v3&&v1) ){
			System.out.println("true");
		}
		
		
		
		
		
			
	}
		
		
}

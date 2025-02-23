/*

8. Swap Two Numbers
Write a Java program to swap the values of two variables without using a third variable.
Test Data:

Input first number: 10
Input second number: 20

Expected Output:

Before swapping:
First number: 10
Second number: 20

After swapping:
First number: 20
Second number: 10

*/





import java.util.Scanner;

class SwapNum {
	public static void main(String args[]){
	
	Scanner inpt = new Scanner(System.in);
	

	System.out.println("Enter 1st number: ");
	
	int a = inpt.nextInt();

	System.out.println("Enter 2nd number: ");	

	int b = inpt.nextInt();

	System.out.println("Before swapping:");
	System.out.println("First number: " + a);
	System.out.println("Second number: " + b);
	
	a = a + b;
	b = a - b;
	a = a - b;

	System.out.println("\nAfter swapping:");
	System.out.println("First number: " + a);
	System.out.println("Second number: " + b);


	
	}


}
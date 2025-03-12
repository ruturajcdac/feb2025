//5. Write a program to demonstrate binary, octal, hexadecimal, and floating-point literals in Java.


class Que_5{
	public static void main(String args[]){
	
	// binary
	int a = 0b1011;
	
	// octal
	int b = 024;
	
	// hexadecimal
	int c = 0x50;
	
	// floating-point
	float p = 10.5f;
	
	double d = 21.0004;
	
	
	//error: incompatible types: possible lossy conversion from double to int
	
	// Solution
	System.out.println("The value of a: " + a);
	System.out.println("The value of a: " + b);
	System.out.println("The value of a: " + c);
	System.out.println("The value of a: " + p);
	System.out.println("The value of a: " + d);
	
	
			
		
		
	}
}
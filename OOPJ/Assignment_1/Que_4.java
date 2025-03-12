//4. Write a program to calculate the average of three int numbers using typecasting to display the result in double.

class Que_4{
	public static void main(String args[]){
	
	int a = 10;
	int b = 20;
	int c = 50;
	
	
	
	//error: incompatible types: possible lossy conversion from double to int
	
	// Solution
	System.out.println("The value of a: " + a);
	System.out.println("The value of a: " + b);
	System.out.println("The value of a: " + c);
	
	
	System.out.println("The value of avg: " + ((double)((a+b+c)/3)));
	
	
		
		
		
	}
}
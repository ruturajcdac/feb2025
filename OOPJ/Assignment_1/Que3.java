//3. Write a program to convert a double value to int using typecasting and explain the data loss.

class Que3{
	public static void main(String args[]){
	
	// boolean
	double d = 3.14;
	//int a = d;
	int a = (int)d;
	
	//error: incompatible types: possible lossy conversion from double to int
	
	// Solution
	
	
	System.out.println("The value of d: " + d);
	System.out.println("The value of a: " + a);
		
		
		
	}
}
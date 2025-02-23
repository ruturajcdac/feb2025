/* 
11. Write a Java program to demonstrate the use of both pre-increment and post-decrement
operators in a single expression
*/

class IncrDecr{
	public static void main(String args[]){
		
	int x = 10;
        int y = 5;
        int result;
	
	System.out.println("Initially x: " + x); 
        System.out.println("Initially y: " + y); 
	
	System.out.println("Operation: result = ++x + y--"); 

        result = ++x + y--;

        System.out.println("x: " + x); // x is incremented before the expression, so x = 11
        System.out.println("y: " + y); // y is decremented after the expression, so y = 4
        System.out.println("result: " + result); // result = 11 + 5 = 16
	
	
	
	}

}
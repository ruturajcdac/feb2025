// 5. Write a program to print the Fibonacci sequence up to the number 21. 

class Fib{
	public static void main(String args[]){
	
	int a = 0;
	int b = 1;

	int sum = 0;
	int i = 1;

	System.out.print(a+" ");
	System.out.print(b+" ");
	sum = sum + a + b;     // 1
	
	while(sum<=21){
		System.out.print(sum + " ");
		a = b;
		b = sum;
		sum = a + b;		
	
	}

		
		
	


	}


}
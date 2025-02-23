// 2. Write a program to compute the factorial of the number 10. 

class Factorial{
	public static void main(String args[]){
		
		int num = 10;
		int product = 1;
		int iter = num;

		while(iter>0){
			product = product * iter;
			iter--;
		}
		System.out.println("The factorial of " + num + " is: "+ product);	


	}


}
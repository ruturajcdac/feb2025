import java.util.Scanner;

class Fact {
	public static void main(String args[]){
	
	Scanner inp1 = new Scanner(System.in);

	System.out.println("Enter a number: ");
	int num = inp1.nextInt();
	
	int factorial = 1;
	for(int i = num; i>0; i--){
		factorial = factorial * i;

	}	

	System.out.println("The factorial of "+ num + " is "+ factorial);


	
	}


}
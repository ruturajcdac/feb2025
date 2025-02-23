import java.util.Scanner;

class OddEven {
	public static void main(String args[]){
	
	Scanner inp1 = new Scanner(System.in);
	

	System.out.println("Enter the number: ");
	
	int num = inp1.nextInt();

	if(num % 2 == 0){
		System.out.println("The number "+ num + " is Even");	
	}
	else{
		System.out.println("The number "+ num + " is Odd");	
	}


	
	}


}
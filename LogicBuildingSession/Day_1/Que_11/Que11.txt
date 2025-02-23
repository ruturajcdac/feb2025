import java.util.Scanner;

class Largestof3 {
	public static void main(String args[]){
	
	Scanner inp1 = new Scanner(System.in);

	System.out.println("Enter 1st number: ");
	int num1 = inp1.nextInt();

	System.out.println("Enter 2nd number: ");
	int num2 = inp1.nextInt();

	System.out.println("Enter 3rd number: ");
	int num3 = inp1.nextInt();

	if(num1 > num2){
	
		if(num1>num3){
		
			System.out.println("The largest number is "+num1);
		}
		else{
			System.out.println("The largest number is "+num3);	

		}

	}
	else{
		if(num2>num3){
		
			System.out.println("The largest number is "+num2);
		}
		else{
			System.out.println("The largest number is "+num3);	

		}	

	}

	



	
	}


}
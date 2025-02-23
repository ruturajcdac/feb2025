import java.util.Scanner;

class AvgOf3 {
	public static void main(String args[]){
	
	Scanner inp1 = new Scanner(System.in);

	System.out.println("Enter 1st number: ");
	int num1 = inp1.nextInt();

	System.out.println("Enter 2nd number: ");
	int num2 = inp1.nextInt();

	System.out.println("Enter 3rd number: ");
	int num3 = inp1.nextInt();
	
	double avg = (num1 + num2 + num3)/3;

	System.out.println("The average is "+avg);


	
	}


}
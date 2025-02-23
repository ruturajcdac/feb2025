import java.util.Scanner;

class NumOfDigits {
	public static void main(String args[]){
	
	Scanner inp1 = new Scanner(System.in);

	System.out.println("Enter the number: ");
	int numOriginal = inp1.nextInt();

	int num = numOriginal;
	int count = 1;

	if(num>=0 && num <= 9){
		
		System.out.println("The number " + num + " has " + count + " digit.");
		System.exit(0);
	}

	while(num >= 10){
		num = num / 10;
		count = count + 1;
	}
	
	
	
	System.out.println("The number " + numOriginal + " has " + count + " digits.");

	
	}


}
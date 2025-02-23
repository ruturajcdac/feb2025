import java.util.Scanner;

class Power {
	public static void main(String args[]){
	
	Scanner inp1 = new Scanner(System.in);

	System.out.println("Enter base number: ");
	int base = inp1.nextInt();

	System.out.println("Enter exponent number: ");
	int expo = inp1.nextInt();
	
	int result = 1;
	
	for(int i = 1; i<=expo; i++){
		
		result = result * base;
		
	}
	
	System.out.println(base + " raised to the power " + expo + " is " + result);

	
	}


}
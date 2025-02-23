import java.util.Scanner;

class CelToFah {
	public static void main(String args[]){
	
	Scanner inp1 = new Scanner(System.in);

	System.out.println("Enter temperature in Celsius: ");
	int temp = inp1.nextInt();
	
	
	double fah = (temp * 9/5) + 32;
	
	System.out.println(temp + "\u00B0 C is equal to " + fah + "\u00B0 F");

	
	}


}
import java.util.Scanner;

class TwoMult {
	public static void main(String args[]){
	
	Scanner inp1 = new Scanner(System.in);
	Scanner inp2 = new Scanner(System.in);

	System.out.println("Enter 1st number: ");
	
	int a = inp1.nextInt();

	System.out.println("Enter 2nd number: ");	

	int b = inp1.nextInt();

	int c = a * b;
	
	System.out.println(a + " x " + b +" = " + c);
	
	}


}
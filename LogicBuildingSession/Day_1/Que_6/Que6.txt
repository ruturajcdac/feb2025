import java.util.Scanner;

class ArithInpts {
	public static void main(String args[]){
	
	Scanner inp1 = new Scanner(System.in);
	Scanner inp2 = new Scanner(System.in);

	System.out.println("Enter 1st number: ");
	
	int a = inp1.nextInt();

	System.out.println("Enter 2nd number: ");	

	int b = inp1.nextInt();

	int sum = a + b;

	int diff = a - b;
	
	int prod = a * b; 
	
	int div = a / b;	

	int modop = a % b;

	System.out.println(a + " + " + b + " = " + sum);

	System.out.println(a + " - " + b + " = " + diff);

	System.out.println(a + " x " + b + " = " + prod);

	System.out.println(a + " / " + b + " = " + div);

	System.out.println(a + " mod " + b + " = " + modop);
	
	}


}
import java.util.Scanner;

class MultTable {
	public static void main(String args[]){
	
	Scanner inpt = new Scanner(System.in);

	System.out.println("Enter a number: ");
	
	int a = inpt.nextInt();

	for(int i = 1; i < 11; i++){
	
		System.out.println(a + " x " + i + " = " + a*i);
	}
	
	}


}
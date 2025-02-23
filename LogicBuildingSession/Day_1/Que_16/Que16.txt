import java.util.Scanner;

class PrimeComp {
	public static void main(String args[]){
	
	Scanner inp1 = new Scanner(System.in);

	System.out.println("Enter a number: ");
	int num = inp1.nextInt();
	
	if(num == 1){
	
		System.out.println("The number " + num + " is neither prime nor composite");
		System.exit(0);
	}
	
	int flag = 0;

	for(int i = 2; i<num && flag != 1; i++){
		if(num % i == 0){
		
			System.out.println("The number " + num + " is Composite");
			flag = 1;
			System.exit(0);
		}

	}	
	
	
	if(flag == 0){
		System.out.println("The number " + num + " is Prime");
	}
	
}



}
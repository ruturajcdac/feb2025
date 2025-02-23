import java.util.Scanner;
class Positive{
	public static void main(String args[]){
	
	int num;
	Scanner inpt = new Scanner(System.in);

	System.out.println("Enter a number");
	num = inpt.nextInt();

	if(num >=0){
		System.out.println("The number "+num+ " is Positive");
	}
	else{
		System.out.println("The number "+num+ " is NOT Positive");	
	}
	
	
	
	}


}
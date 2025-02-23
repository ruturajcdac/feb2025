import java.util.Scanner;

class Calc{
	
	public static void main(String args[]){
	
	Scanner inpt = new Scanner(System.in);
 	
	System.out.println("Enter 1st number: ");
	int num1 = inpt.nextInt();

	System.out.println("Enter 2nd number: ");
	int num2 = inpt.nextInt();

	System.out.println("Enter operation (+, - , x , / ): ");
	char opt = inpt.next().charAt(0);

	switch(opt){
		
		case '+' : System.out.println("Ans: "+ (num1+num2));
			   break;
		case '-' : System.out.println("Ans: "+ (num1-num2));
			   break;
		case 'x' : System.out.println("Ans: "+ (num1*num2));
			   break;
		case '/' : if(num2==0){
			   	System.out.println("Error! Can't divide by 0");
			   }	
			   else{
				System.out.println("Ans: "+ (num1/num2));	
			   }
			   break;
	}
	


	}



}
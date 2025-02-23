import java.util.Scanner;

class Discount{
	public static void main(String args[]){
	
	Scanner inpt = new Scanner(System.in);
	
	System.out.println("Enter your purchase amount: ");
	int purAmt = inpt.nextInt();

	inpt.nextLine();
	
	System.out.println("Do you have membership card? (yes/no)");
	String memCard = inpt.nextLine();

	double discount = 0;
	double discPercent = 5;

	if(memCard.equals("Yes") || memCard.equals("yes")){
		
		if(purAmt>=1000){
			discount = ((20+discPercent)/100)*purAmt;
		}
		else if((purAmt>=500) && (purAmt<=999)){
			discount = ((10+discPercent)/100)*purAmt;
		}
		else if(purAmt<500){
			discount = ((5+discPercent)/100)*purAmt;
		}
		
		System.out.println("Your discount on purchase amount of Rs. " + purAmt + " WITH membership card is Rs. " + discount );
		
		
	}
	else if(memCard.equals("No") || memCard.equals("no")){
		
		if(purAmt>=1000){
			// discount = ((double)(20/100))*purAmt;
			discount = (0.2)*purAmt;
		}
		else if((purAmt>=500) && (purAmt<=999)){
			// discount = ((double)(20/100))*purAmt;
			discount = (0.1)*purAmt;
		}
		else if(purAmt<500){
			// discount = ((double)(20/100))*purAmt;
			discount = (0.05)*purAmt;
		}
		
		System.out.println("Your discount on purchase amount of Rs. " + purAmt + " WITHOUT membership card is Rs. " + discount );
		
	}

	
	
	




	}
	
	






}
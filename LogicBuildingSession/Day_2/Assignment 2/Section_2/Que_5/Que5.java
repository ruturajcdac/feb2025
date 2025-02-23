import java.util.Scanner;

class FailSub{
	public static void main(String args[]){
	
	Scanner inpt = new Scanner(System.in);
	
	System.out.println("Enter Physics marks: ");
	int phy = inpt.nextInt();

	System.out.println("Enter Chemistry marks: ");
	int chem = inpt.nextInt();

	System.out.println("Enter Maths marks: ");
	int maths = inpt.nextInt();

	int count = 0;
	
	if(phy<=39){
		count = count + 1;
	}
	if(chem<=39){
		count = count + 1;	
	}
	if(maths<=39){
		count = count + 1;
	}

	if(count>=1){
		
		System.out.println("You failed in " + count + " subjects." );
	
	}

	
	
	
	
	




	}
	
	






}
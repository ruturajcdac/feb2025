import java.util.Scanner;

class GoodMorning{
	public static void main(String args[]){
	
	int hrs, mint;
	String meridian;
	Scanner inpt = new Scanner(System.in);

	System.out.println("Enter hrs");
	hrs = inpt.nextInt();

	System.out.println("Enter min ");
	mint = inpt.nextInt();

	inpt.nextLine(); // To consume the leftover newline character

	System.out.println("Enter AM or PM");
	meridian = inpt.nextLine().trim(); // Trim to remove extra spaces

	if(hrs <12 && hrs >=5){
		
		if((mint>=0) && (mint<60)){
		
			if(meridian.equalsIgnoreCase("AM")) {
			
				System.out.println("Good Morning!");
			}
		}
	
	
	
	}


}

}
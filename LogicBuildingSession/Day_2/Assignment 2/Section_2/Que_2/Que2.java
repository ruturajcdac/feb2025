import java.util.Scanner;

class DaysOfWeek{
		
	public static void main(String args[]){
		Scanner inpt = new Scanner(System.in);

		System.out.println("Enter a number");	
		int num = inpt.nextInt();

		switch(num){
			case (1) : System.out.println("Monday");
				   break;
			case (2) : System.out.println("Tuesday");
				   break;
			case (3) : System.out.println("Wednesday");
				   break;
			case (4) : System.out.println("Thursday");
				   break;
			case (5) : System.out.println("Friday");
				   break;
			case (6) : System.out.println("Saturday");
				   break;
			case (7) : System.out.println("Sunday");
				   break;
			}
		if((num == 6) || (num == 7)){
			System.out.println("Weekend!");	
		}
		else if((num>=1) && (num<=5)){
			System.out.println("Weekday!");
		}


	}





}
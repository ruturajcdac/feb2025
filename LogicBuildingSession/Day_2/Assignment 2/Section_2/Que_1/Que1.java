import java.util.Scanner;

class Grade{
	public static void main(String args[]){
	
	Scanner inpt = new Scanner(System.in);
	
	System.out.println("Enter your score: ");
	int score = inpt.nextInt();
	
	/*
	switch(score){
		case(score>=90): System.out.println("A");
				 break;
		case((score>= 80) && (score<=89)) : System.out.println("B");
						    break;
		case((score>= 70) && (score<=79)) : System.out.println("C");
						    break;
		case((score>= 60) && (score<=69)) : System.out.println("D");
						    break;
		case(score < 60) : System.out.println("F");
				   break;
		}
	*/

	if(score>=90){
		System.out.println("A");
				
	
		}
	else if((score>= 80) && (score<=89)){
		System.out.println("B");
		
	
		}
	else if((score>= 70) && (score<=79)){
		System.out.println("C");
		
	
		}
	else if((score>= 60) && (score<=69)){
		System.out.println("D");
		
	
		}
	else if(score<60){
		System.out.println("F");
		
	
		}
	
	




	}
	
	






}
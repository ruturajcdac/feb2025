//11. Write a program to check if a number is positive and even using logical operators (&&, ||, !).
import java.util.*;

class Que_10{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num = sc.nextInt();
	
	if((num>0) && (num%2==0)){
		System.out.println(num+ " is positive and even");
	}
	
			
	}
}
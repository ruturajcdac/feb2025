/*

Q7: Implement a Java program that checks whether a given year is a leap year or not using
logical (&&, ||) operators

*/


import java.util.*;

class Que_7{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an year: ");
		int year = sc.nextInt();
		
		if(((year%4 == 0) && (year%100 !=0 )) || (year%400 == 0)) {
			
			System.out.println(year+" is a leap year.");
			
		}
		else{
			System.out.println(year+" is not a leap year.");
		}

		/*
		if(y% ==4){
			if(y%100){
				if(y%400){
					LY
				}
			}
			LY
		}
		NLY*/
		
			
	}
		
		
}

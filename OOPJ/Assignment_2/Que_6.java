/*

Q6: Write a program to find the largest of three numbers using only the ternary operator
(? :).

*/


import java.util.*;

class Que_6{
	public static void main(String args[]){
		
		int a = 35;
		int b = 81;
		int c = 24;
		
		/*if(a>b){
			if{a>c}{
				a
			}
			c
		}
		if(b>c){
			b
		}{
			c
		}*/
		
		
		int largest = a>b ? (a>c) ? a : c : (b>c) ? b: c;
		System.out.println(largest);
		

		
			
	}
		
		
}

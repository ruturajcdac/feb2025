/*

Shallow and deep copy


*/

import java.util.Scanner;

class Practice_1{
	public static void main(String args[]){
		int arr[] = {10, 20, 30};
		
		
		// deep copy 1
		int cp[] = new int[3];
		cp = arr.clone();
		
		// deep copy 2
		
		// int cp[] = arr.clone();
		
		
		for(int i=0; i<cp.length;i++){
			System.out.println(cp[i]);
		}
		
		if(arr == cp){
			System.out.println("The address is same.");
		}
		else{
			System.out.println("The address is different.");
		}
		
		
	}
}
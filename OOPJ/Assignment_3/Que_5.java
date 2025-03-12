/*

5. Find Sum and Average
- Compute the sum and average of all elements in the array.
*/


import java.util.*;

class Que_5{
	public static void main(String args[]){
		
		int arr[] = {9, 81, 4, 6, 1};
		//int arr[] = {5, 9 , 5, 22, 1};
		
		int sum = 0;
		
		int oCount = 0;
		
		    
		for(int i=0; i<arr.length; i++){
			
			sum = sum + arr[i];
		}
		
		double avg = (double)sum/arr.length;
		
		
		
		
		System.out.println("Sum: "+sum);
		System.out.println("Avg: "+avg);
		
		
		
	}
}
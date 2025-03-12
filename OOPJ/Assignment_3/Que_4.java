/*

4. Count Even and Odd Numbers
- Count the number of even and odd numbers in an array.

*/


import java.util.*;

class Que_4{
	public static void main(String args[]){
		
		int arr[] = {9, 81, 4, 6, 1};
		//int arr[] = {5, 9 , 5, 22, 1};
		
		int eCount = 0;
		
		int oCount = 0;
		
		    
		for(int i=0; i<arr.length; i++){
			
			if(arr[i]%2 == 0){
				eCount++;
			}
			else{
				oCount++;
			}
		}
		
		
		
		
		
		System.out.println("Odd count: "+oCount);
		System.out.println("Even count: "+eCount);
		
		
		
	}
}
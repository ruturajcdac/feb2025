/*

3. Find the Second Largest Element
- Find the second-largest element in the given array.

*/


import java.util.*;

class Que_3{
	public static void main(String args[]){
		
		//int arr[] = {9, 81, 4, 65, 1};
		int arr[] = {5, 9 , 5, 22, 1};
		
		int largest = arr[0];
		
		int sLargest = -1;
		    
		for(int i=0; i<arr.length; i++){
			
			/* My bad logic
			if(arr[i]>largest){
				largest = arr[i];
			}
			else if(arr[i] > sLargest){
				sLargest = arr[i];
			}
			*/
			
			
			if (arr[i] > largest) {
                sLargest = largest; // Shift the previous largest to sLargest
                largest = arr[i];
            } else if (arr[i] > sLargest && arr[i] != largest) {
                sLargest = arr[i];
            }
		}
		
		
		
		
		
		System.out.println(sLargest);
		
		
		
	}
}
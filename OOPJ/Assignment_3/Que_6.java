/*

6.Remove Duplicates from a SortedArray
- Remove duplicate elements from a sorted array without using extraspace.
*/


import java.util.*;

class Que_6{
	public static void main(String args[]){
		
		int arr[] = {1, 2, 5, 5, 8, 12, 12, 24, 39};
		//int arr[] = {5, 9 , 5, 22, 1};
		
		
		int i = 0; // Slow pointer
        for (int j = 1; j < arr.length; j++) { // Fast pointer
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        // Print the modified array (up to the new length)
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
        System.out.println("New length: " + (i + 1));
		
		
		
		
		
	}
}
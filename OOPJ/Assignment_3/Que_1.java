/*

1. Find the Largest and Smallest Element
- Given an array, find the smallest and largest elements in it.

*/


import java.util.*;

class Que_1{
	public static void main(String args[]){
		
		int arr[] = {10, 84, 96, 4, 542};
		
		//int max = 0;
		int max = arr[0]; // better approach
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
			if(arr[i]<min){
				min = arr[i];
			}
		}
		
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
		
		
		
	}
}
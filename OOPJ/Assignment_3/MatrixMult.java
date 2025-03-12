/*

Matrix Subtraction


*/

import java.util.Scanner;

class MatrixMult{
	public static void main(String args[]){
		
	int arr1[][] = new int[3][3];
	int arr2[][] = new int[3][3];
	
	Scanner sc = new Scanner(System.in);
	
	// 1st matrix input
	for(int i=0; i<3; i++){
		System.out.println("\nEnter row: " + (i+1) +" elements");
		for(int j=0; j<3; j++){
				System.out.println("Enter elements: ");
				
				arr1[i][j] = sc.nextInt();
		}
	}
	
	// 2nd matrix input
	System.out.println("\nEnter for 2nd Matrix");
	
	for(int i=0; i<3; i++){
		System.out.println("\nEnter row: " + (i+1) +" elements");
		for(int j=0; j<3; j++){
				System.out.println("Enter elements: ");
				
				arr2[i][j] = sc.nextInt();
		}
	}
	
	
	// 1st matrix output
	System.out.println("\n1st Matrix");
	for(int i=0; i<3; i++){
		
		for(int j=0; j<3; j++){
				System.out.print(" " + arr1[i][j]);
				
				 
		}
		System.out.println();
	}
	
	
	// 2nd matrix output
	System.out.println("\n2nd Matrix");
	for(int i=0; i<3; i++){
		
		for(int j=0; j<3; j++){
				System.out.print(" " + arr2[i][j]);
				
				 
		}
		System.out.println();
	}
	
	int mult [][] = new int[3][3];
	int sum = 0;
	
	
	// Multiplication operation
	
	for(int i=0; i<3; i++){
		
		for(int j=0; j<3; j++){
				 
				 for(int k=0; k<3; k++){
					sum  = sum + (arr1[i][k]*arr2[k][j]);
				 }
				 mult[i][j] = sum;
				 sum = 0;
				
		}
		
	}
	
	
	System.out.println("\nResult Matrix");
	for(int i=0; i<3; i++){
		
		for(int j=0; j<3; j++){
				System.out.print(" " + mult[i][j]);
				
				 
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
		
		
		
		
		
	}
}
/* 

18. Write a program to print the following pattern:
      *
    * * *
  * * * * *
* * * * * * *
  * * * * *
    * * *
      *

*/

class StarPattern6{
	public static void main(String args[]){
	
	int n = 4;


	for(int i = 1; i<=n; i++){
		
		for(int j = 1; j<=((2*n)-(2*i)); j++){
			System.out.print(" ");
		
		}
		for(int j = 1; j<=((2*i)-1); j++){
			System.out.print("* ");
		}
		
		System.out.print("\n");
	}

		
	
		

		for(int p = 1; p<= n-1; p++){
			for(int j = 1; j<=2*p; j++){
				System.out.print(" ");
		
			}
			for(int j = 1; j<=(2*(n-p) - 1) ; j++){
				System.out.print("* ");
		
			}
			System.out.print("\n");
		}
		

	    

	
	
	
	}

}
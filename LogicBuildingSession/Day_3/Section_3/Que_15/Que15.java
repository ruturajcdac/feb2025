/* 
15. Write a program to print the following pattern:
     *
    * *
   * * *
  * * * *
 * * * * *
*/

class Star3{
	public static void main(String args[]){
		
	for(int i = 1; i<=5; i++){
		for(int j = 1; j<=(5-i); j++){
			System.out.print(" ");
		
		}
		for(int j = 1; j<=i; j++){
			System.out.print("* ");
		
		}
		System.out.println();
	}      

	
	
	
	}

}
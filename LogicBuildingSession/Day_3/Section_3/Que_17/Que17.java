/* 
17. Write a program to print the following pattern:
* * * * *
 * * * *
  * * *
   * *
    *
*/

class Star5{
	public static void main(String args[]){
		
	for(int i = 1; i<=5; i++){
		for(int j = 1; j<=(i-1); j++){
			System.out.print(" ");
		
		}
		for(int j = 1; j<=(6-i); j++){
			System.out.print("* ");
		
		}
		System.out.print("\n");
	}      

	
	
	
	}

}
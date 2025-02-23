/* 
16. Write a program to print the following pattern:
        *
      * * * 
    * * * * *
  * * * * * * * 
* * * * * * * * *
*/

class Star4{
	public static void main(String args[]){
		
	for(int i = 1; i<=5; i++){
		for(int j = 1; j<=(5*2-i*2); j++){
			System.out.print(" ");
		
		}
		for(int j = 1; j<=((i*2)-1); j++){
			System.out.print("* ");
		
		}
		System.out.println();
	}      

	
	
	
	}

}
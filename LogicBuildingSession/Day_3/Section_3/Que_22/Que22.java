/* 
22. Write a program to print the following pattern:

* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * * 

*/

class StarMix3{
	public static void main(String args[]){
	int n1 = 5;
	
	int n2 = 5;
	for(int i = 1; i<=n1;i++){
		for(int j = 1; j<=(i*2)-2; j++){
			System.out.print(" ");
			
		}
		
		for(int j = 1; j<=(n2*2)-1; j++){
			System.out.print("* ");
		}
		n2--;
		
		
		System.out.print("\n");
	}    

	for(int i = 1; i<=n1-1;i++){
		
		for(int j = 1; j<=(n1-i)*2 -2 ;j++){
			System.out.print(" ");
		}
		
		
		for(int j = 1; j<=2*i+1;j++){
			System.out.print("* ");
		}
		System.out.print("\n");		
	
	}
	
	
	
	}

}
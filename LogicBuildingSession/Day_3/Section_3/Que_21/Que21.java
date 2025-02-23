/* 
21. Write a program to print the following pattern:
1
1*3
1*3*5
1*3*5*7
1*3*5*7*9
*/

class StarMix3{
	public static void main(String args[]){

	for(int i = 1; i<=5; i++){
		for(int j = 1; j<=i; j++){
			System.out.print(j*2 -1);
			if(j<i){
				System.out.print("*");
			}
		
		}
		System.out.print("\n");
	}      

	
	
	
	}

}
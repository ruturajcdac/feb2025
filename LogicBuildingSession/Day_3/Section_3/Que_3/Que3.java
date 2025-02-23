// 3. Write a program to print all multiples of 7 between 1 and 100. 

class MultOfSeven{
	public static void main(String args[]){
		
		int num = 7;		

		for(int i = 7; i<=100; i++){
			if((i % num) == 0){
				System.out.print(i+" ");			
			}
		}
	


	}


}
/* 
9. Write a program to find and print the largest digit in the number 4825.
*/

class LargeDigit{
	public static void main(String args[]){
	
	int LARGE = 0;
	
	int numOrg = 4825;
	int rem = 0;
	
	int num = numOrg;

	while(num>0){
		rem = num % 10;
		num = num / 10;
		if(rem>LARGE){
			LARGE = rem;
		}

	}
	System.out.println("Largest digit from " + numOrg + " is: "+ LARGE );
	
	
	}

}
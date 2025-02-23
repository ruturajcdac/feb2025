/* 
7. Write a program to calculate the sum of the digits of the number 9876. The output should be
30 (9 + 8 + 7 + 6).
*/

class SumOfDigits{
	public static void main(String args[]){
	
	int numOrg = 9876;
	int rem, sum = 0;
	int num = numOrg;
	
	while(num>0){
		rem = num % 10;
		sum = sum + rem;
		num = num/10;
	
		}
	System.out.println("Sum of digits of "+ numOrg +" is: " + sum);
	
	}

}
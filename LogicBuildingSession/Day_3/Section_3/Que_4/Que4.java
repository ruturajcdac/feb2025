// 4. Write a program to reverse the digits of the number 1234. The output should be 4321. 

class RevDigit{
	public static void main(String args[]){
		int rem1; 
		double rem2;
		int count = 0;
		double sum = 0;
		int numOrg = 1234;
		int num1 = numOrg;
		int num2 = numOrg;
		while(num1>0){
			rem1 = num1 % 10;
			num1 = num1 / 10;
			count++;
			
		}
		
		// System.out.println("Count is : "+count);
		while(count>0){
			rem2 = num2 % 10;
			num2 = num2 / 10;
			rem2 = rem2 * Math.pow(10, (count-1));
			sum = sum + rem2;
			count--;
			
		}

		System.out.println("Reverse of the number "+ numOrg + " is: " + (int)sum);
		
		
		
	}


}
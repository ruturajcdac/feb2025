// 6. Write a program to find and print the first 5 prime numbers. 

class FirstFivePrime{
	public static void main(String args[]){
	
	int count = 0;
	int num = 2;
	int sum = 0;
	
	
	while(count<5){
		for(int i = 1; i<=num; i++){
			if(num%i == 0){
				sum++;
	
			}

		}
		if(sum<3){
			System.out.print(num+" ");
			count++;
		}
		num++;
		sum=0;
	}
	

}


}
public class ConditionalLoopOutput {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 4; i++) {
            if (i % 2 == 0) {
                num += i;
            } else {
                num -= i;
            }
        }
        System.out.println(num);
    }
}

/* Dry run:					
   num = 1 :
For i = 1:
	1 % 2 != 0 so 
		num = num - i = 1 - 1 = 0
		go to next iteration

For i = 2 :
	2 % 2 == 0 so 
		num = num + i = 0 + 2 = 2
		go to next iteration

For i = 3 :
	3 % 2 != 0 so 
		num = num - i = 2 - 3 = -1
		go to next iteration
For i = 4 :
	4 % 2 == 0 so 
		num = num + i = -1 + 4 = 3
		go to next iteration

Statement out of the loop : print num => 3
	


Final Output : 3
*/
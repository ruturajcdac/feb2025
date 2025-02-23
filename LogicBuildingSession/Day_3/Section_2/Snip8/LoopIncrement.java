public class LoopIncrement {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            count += i++ - ++i;
        }
        System.out.println(count);
    }
}

/* Dry run:					
   
count = 0

For i = 0:
	count = count + i++ - ++i = 0 + 0 - 2 = -2
	 use	  0     0   -  2 
	update          1      2

	now as per loop increment i becomes => 2 + 1 = 3

For i = 3:
	count = count + i++ - ++i = -2 + 3 - 5 = -4 
	 use	 -2     3   -  5 
	update          4      5

	now as per loop increment i becomes => 5 + 1 = 6

For i = 6: condition becomes false, so exit the loop


Print count => -4  


	

*/
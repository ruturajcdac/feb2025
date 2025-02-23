public class WhileLoopBreak {
    public static void main(String[] args) {
        int count = 0;
        while (count < 5) {
            System.out.print(count + " ");
            count++;
            if (count == 3) break;
        }
        System.out.println(count);
    }
}

/* Dry run:					
For count = 0:					Output screen: 0
	print: count 
	count = 0 + 1 = 1
	count != 3 so skip its body

For count = 1:					Output screen: 0 1
	print: count
	count = 1 + 1 = 2
	count != 3 so skip its body

For count = 2:					Output screen: 0 1 2
	print: count 
	count = 2 + 1 = 3
	Now, count == 3 so execute break statement and exit the loop 
	and after the loop print count as 3

Final Output : 0 1 2 3
	       ^ ^ ^ ^
	       | | | |-> from printing count
	       | | |	
	       - - - > from the loop
*/
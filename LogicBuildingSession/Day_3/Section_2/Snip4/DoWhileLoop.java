public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 5);
        System.out.println(i);
    }
}

/* Dry run:					
For i = 1 :
	print i => 1
	i = i + 1 = 1 + 1 = 2
	i < 5 : true => go to next iteration

For i = 2 :
	print i => 2
	i = i + 1 = 2 + 1 = 3
	i < 5 : true => go to next iteration

For i = 3 :
	print i => 3
	i = i + 1 = 3 + 1 = 4
	i < 5 : true => go to next iteration

For i = 4 :
	print i => 4
	i = i + 1 = 4 + 1 = 5
	i < 5 : false => exit the loop

Statement out of the loop : print 5
	



Final Output : 1 2 3 4 5
	       ^ ^ ^ ^ ^
	       | | | | |-> from printing count
	       | | | |	
	       - - - - > from the loop
*/
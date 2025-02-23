public class DecrementingLoop {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 5; i > 0; i--) {
            total += i;
            if (i == 3) continue;
            total -= 1;
        }
        System.out.println(total);
    }
}

/* Dry run:
For i = 5
	total = 0 + 5 = 5
	i != 3 so 
	total = 5 - 1 = 4

For i = 4
	total = 4 + 4 = 8
	i != 3 so 
	total = 8 - 1 = 7

For i = 3
	total = 7 + 3 = 10
	i == 3 so skip remaining statements

For i = 2
	total = 10 + 2 = 12
	i != 3 so 
	total = 12 - 1 = 11

For i = 1
	total = 11 + 1 = 12
	i != 3 so 
	total = 12 - 1 = 11

Print total => 11


*/
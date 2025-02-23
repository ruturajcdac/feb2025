/* prints alternate numbers

public class LoopVariableScope {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int x = i * 2;
        }
        System.out.println(x); // Error: 'x' is not accessible here
    }
} 

*/

public class LoopVariableScope {
    public static void main(String[] args) {
	int x = 1;			    // declared x like a global variable
        for (int i = 0; i < 5; i++) {
            x = i * 2;
        }
        System.out.println(x); 
    }
}


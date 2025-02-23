/* 

-- error

public class Main {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int result = a ** b;
		System.out.println(result);
	}
}

*/

public class Main {
    public static void main(String[] args) {
	System.out.println("Solution: Using Math.pow()");
        int a = 10;
        int b = 5;
        double result = Math.pow(a, b); // Use Math.pow()
        System.out.println(result);
    }
}
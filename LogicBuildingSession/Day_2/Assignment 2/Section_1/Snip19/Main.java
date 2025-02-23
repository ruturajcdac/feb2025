/* 

-- error

public class Main {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int result = a / b;
		System.out.println(result);
	}
}


*/

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        if (b != 0) {
            int result = a / b;
            System.out.println(result);
        } else {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}

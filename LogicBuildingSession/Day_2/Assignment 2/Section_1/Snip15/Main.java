/* 

-- error

public class Main {
	public static void main(String[] args) {
		int num1 = 10;
		double num2 = 5.5;
		int result = num1 + num2;
		System.out.println(result);
	}
}


*/

/* Solution - 1

public class Main {
	public static void main(String[] args) {
		System.out.println("Solution 1 - Using double to store the result");
		int num1 = 10;
		double num2 = 5.5;
		double result = num1 + num2;
		System.out.println(result);
	}
}
*/

public class Main {
	public static void main(String[] args) {
		System.out.println("Solution 2 - Using explicit typecasting");
		int num1 = 10;
		double num2 = 5.5;
		int result = (int) (num1 + num2);
		System.out.println(result);
	}
}




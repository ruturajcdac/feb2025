/* runs infinitely

public class DoWhileIncorrectCondition {
 	public static void main(String[] args) {
		int num = 0;
		do {
			System.out.println(num);
			num++;
		} while (num > 0);
 	}
}

*/

public class DoWhileIncorrectCondition {
 	public static void main(String[] args) {
		int num = 0;
		do {
			System.out.println(num);
			System.out.println("Executed only once.");
			num++;
		} while (num < 0);
 	}
}
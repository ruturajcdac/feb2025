/* runs infinitely

public class IncorrectWhileCondition {
	public static void main(String[] args) {
 		int count = 5;
		while (count = 0) {
			System.out.println(count);
			count--;
 		}
 	}
}

*/

public class IncorrectWhileCondition {
	public static void main(String[] args) {
 		int count = 5;
		while (count >= 0) {
			System.out.println(count);
			count--;
 		}
 	}
}
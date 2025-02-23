/* runs extra

public class WrongInitializationForLoop {
	public static void main(String[] args) {
		for (int i = 10; i >= 0; i++) {
			System.out.println(i);
		}
 	}
}  

*/

public class WrongInitializationForLoop {
	public static void main(String[] args) {
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		System.out.println("After using i-- instead of i++");		
 	}
} 
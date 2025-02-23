/* the count variable was not initialized

public class UninitializedWhileLoop {
	public static void main(String[] args) {
		int count;
		while (count < 10) {
			System.out.println(count);
			count++;
		}
	}
}  

*/

public class UninitializedWhileLoop {
	public static void main(String[] args) {
		int count = 1;
		while (count < 10) {
			System.out.println(count);
			count++;
		}
	}
} 
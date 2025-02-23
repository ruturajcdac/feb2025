/* inadequate {} of for loop

public class MisplacedForLoopBody {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++)
			System.out.println(i);
			System.out.println("Done");
		}
	}  

*/

public class MisplacedForLoopBody {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++){
			System.out.println(i);
			System.out.println("Done");
		}
	}
}
/* 

-- error

public class Main {
	public static void main(String[] args) {
		while (true) {
			System.out.println("Infinite Loop");
		}
	}
}


*/

public class Main {
	public static void main(String[] args) {
		int count = 0;
		while (true) {
    			System.out.println("Looping...");
    			if (count == 5) { 
        			break; // Exit the loop
    			}
			count = count + 1;
		}
	}
}









/* 

-- error

public class Main {
	public static void main(String[] args) {
		static void displayMessage() {
		System.out.println("Message");
		}
	}
}

*/

public class Main {
    public static void main(String[] args) {
        // You can call displayMessage() here if you want
        displayMessage();
    }

    static void displayMessage() {
        System.out.println("Message");
    }
}

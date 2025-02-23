/*

error => y is not declared

public class Main {
	public static void main(String[] args) {
		int x = y + 10;
		System.out.println(x);
	}
}

*/

public class Main {
    public static void main(String[] args) {
        int y = 5; // Declared and initialized y
        int x = y + 10;
        System.out.println(x);
    }
}
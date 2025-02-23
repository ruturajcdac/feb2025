/* 

-- error

public class Main {
	public void display() {
		System.out.println("No parameters");
	}
	
	public void display(int num) {
		System.out.println("With parameter: " + num);
	}
	
	public static void main(String[] args) {
		display();
		display(5);
	}
}


*/

public class Main {
    public void display() {
        System.out.println("No parameters");
    }

    public void display(int num) {
        System.out.println("With parameter: " + num);
    }

    public static void main(String[] args) {
        Main obj = new Main(); // Create an object of Main
        obj.display();       // Call display() on the object
        obj.display(5);      // Call display(5) on the object
    }
}







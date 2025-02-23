/* 

-- error

public class Main {
	public static void main(String[] args) {
		String str = null;
		System.out.println(str.length());
	}
}



*/

/* Solution 1 - Initialize the string */

/*
public class Main {
	public static void main(String[] args) {
		System.out.println("Solution 1 - initialize the string "); 
		String str = "Hello"; // Initialize str with a String value
		System.out.println(str.length()); // Now this will work
	}
}

*/

/* Solution 2 - Check for null before using: */


public class Main {
	public static void main(String[] args) {
		System.out.println("Solution 2 - Check for null before using: "); 
		String str = null;
		if (str != null) { // Check if str is not null
    			System.out.println(str.length()); // Only then call the method
		} else {
    			System.out.println("String is null"); // Handle the null case
		}
	}
}








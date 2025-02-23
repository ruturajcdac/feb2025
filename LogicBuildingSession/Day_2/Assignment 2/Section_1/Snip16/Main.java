/* 

-- error

public class Main {
	public static void main(String[] args) {
		int num = 10;
		double result = num / 4;
		System.out.println(result);
	}
}


*/

/*Solution 1) Cast num to double:*/

/*
public class Main {
    public static void main(String[] args) {
        System.out.println("Solution 1) Cast num to double:");
        int num = 10;
        double result = (double) num / 4;
        System.out.println(result); // Output: 2.5
    }
}
*/

/* Solution 2) Use a double literal for 4: */
/*
public class Main {
    public static void main(String[] args) {
	System.out.println("Solution 2) Use a double literal for 4: ");
        int num = 10;
        double result = num / 4.0;
        System.out.println(result); // Output: 2.5
    }
}
*/


/* Solution 3) Declare num as a double: */ 

public class Main {
    public static void main(String[] args) {
	System.out.println("Solution 3) Declare num as a double:");
        double num = 10;
        double result = num / 4;
        System.out.println(result); // Output: 2.5
    }
}
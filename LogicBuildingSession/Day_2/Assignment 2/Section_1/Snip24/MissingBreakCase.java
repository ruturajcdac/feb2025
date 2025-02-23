/* 

-- unintended behaviour (when break not used)

public class MissingBreakCase {
	public static void main(String[] args) {
		int level = 1;
		switch(level) {
			case 1:
				System.out.println("Level 1");
			case 2:
				System.out.println("Level 2");
			case 3:
				System.out.println("Level 3");
			default:
				System.out.println("Unknown level");
		}
	}
}

*/




public class MissingBreakCase {
    public static void main(String[] args) {
        int level = 1;
        switch(level) {
            case 1:
                System.out.println("Level 1");
                break; // Added break
            case 2:
                System.out.println("Level 2");
                break; // Added break
            case 3:
                System.out.println("Level 3");
                break; // Added break
            default:
                System.out.println("Unknown level");
                break; //Added break, although not strictly needed here.
        }
    }
}





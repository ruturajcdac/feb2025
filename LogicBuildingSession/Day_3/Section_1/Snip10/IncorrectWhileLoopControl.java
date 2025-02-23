/* used assignment operator in the while condition

public class IncorrectWhileLoopControl {
    public static void main(String[] args) {
        int num = 10;
        while (num = 10) {
            System.out.println(num);
            num--;
        }
    }
} 

*/

public class IncorrectWhileLoopControl {
    public static void main(String[] args) {
        int num = 10;
        while (num > 0) {
            System.out.println(num);
            num--;
        }
    }
}


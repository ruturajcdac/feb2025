public class NestedLoopOutput {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.print(i + " " + j + " ");
            }
            System.out.println();
        }
    }
}

/* Dry run:
For i = 1 we get 1 1 1 2
    i = 2 we get 2 1 2 2
    i = 3 we get 3 1 3 2



*/
/*

14.  Write a program in Java to accept 20 numbers in a single dimensional array arr[20]. Transfer 
and store all the even numbers in an array even[ ] and all the odd numbers in another array 
odd[ ]. Finally, print the elements of the even & the odd array. 

*/



import java.util.Scanner;

class Que_14{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10]; // Array to store 10 input numbers
        int[] even = new int[10]; // Array to store even numbers (max 10)
        int[] odd = new int[10];  // Array to store odd numbers (max 10)
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter 10 integer numbers:");

        // Accept 10 numbers
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }

        // Transfer even and odd numbers
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                even[evenCount] = arr[i];
                evenCount++;
            } else {
                odd[oddCount] = arr[i];
                oddCount++;
            }
        }

        // Print even array
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        // Print odd array
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
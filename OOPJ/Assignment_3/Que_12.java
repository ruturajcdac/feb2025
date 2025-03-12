/*

12.  Write a program to accept 20 integer numbers in a single Dimensional Array. Find and 
Display the following: 
○  Number of even numbers. 
○  Number of odd numbers. 
○  Number of multiples of 3

*/



import java.util.Scanner;

class Que_12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];
        int evenCount = 0;
        int oddCount = 0;
        int multipleOf3Count = 0;

        System.out.println("Enter 20 integer numbers:");

        // Accept 20 integer numbers
        for (int i = 0; i < 20; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate statistics
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            if (number % 3 == 0) {
                multipleOf3Count++;
            }
        }

        // Display results
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of multiples of 3: " + multipleOf3Count);

        scanner.close();
    }
}
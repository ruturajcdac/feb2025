/*

Q20: Implement a Java program that returns the absolute value of a given number using
the ternary operator (without using Math.abs()).

*/


import java.util.Scanner;

class Que_20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close(); // Close scanner to prevent resource leak

        int absValue = (num < 0) ? -num : num; // Convert negative to positive

        System.out.println("Absolute value: " + absValue);
    }
}
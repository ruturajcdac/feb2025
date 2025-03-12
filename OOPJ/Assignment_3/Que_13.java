/*

13.  Write a program to accept the marks in Physics, Chemistry and Maths secured by 20 class 
students in a single Dimensional Array. Find and display the following: 
○  Number of students securing 75% and above in aggregate. 
○  Number of students securing 40% and below in aggregate.

*/


import java.util.Scanner;

class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] physicsMarks = new int[5]; // Reduced to 5 students
        int[] chemistryMarks = new int[5]; // Reduced to 5 students
        int[] mathsMarks = new int[5]; // Reduced to 5 students
        int above75Percent = 0;
        int below40Percent = 0;

        System.out.println("Enter marks for 5 students (Physics, Chemistry, Maths):");

        // Input marks for 5 students
        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.print("Physics: ");
            physicsMarks[i] = scanner.nextInt();
            System.out.print("Chemistry: ");
            chemistryMarks[i] = scanner.nextInt();
            System.out.print("Maths: ");
            mathsMarks[i] = scanner.nextInt();
        }

        // Calculate aggregate percentage and count students
        for (int i = 0; i < 5; i++) {
            int totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            double percentage = (double) totalMarks / 3.0; // Calculate percentage

            if (percentage >= 75.0) {
                above75Percent++;
            } else if (percentage <= 40.0) {
                below40Percent++;
            }
        }

        // Display results
        System.out.println("Number of students securing 75% and above: " + above75Percent);
        System.out.println("Number of students securing 40% and below: " + below40Percent);

        scanner.close();
    }
}
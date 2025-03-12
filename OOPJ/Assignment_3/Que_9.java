/*

9.  Find Missing Number in an Array 
- Given an array of size n-1 containing numbers from 1 to n, find the missing number. 

*/

import java.util.*;

class Que_9{
    public static int findMissingNumber(int[] arr, int n) {
        // Step 1: Calculate the expected sum of numbers from 1 to n
        int expectedSum = (n * (n + 1)) / 2;
        
        // Step 2: Calculate the actual sum of elements in the array
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        
        // Step 3: The missing number is the difference
        int missingNumber = expectedSum - actualSum;
        return missingNumber;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5}; // Array with one number missing
        int n = 5; // Range is 1 to n
        
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }
}
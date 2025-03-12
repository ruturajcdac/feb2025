/*

7. Rotate an Array 
-Rotate the array to the right by k positions. 
*/

import java.util.*;

class Que_7 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7}; // The original array
        int k = 3; // How many positions to rotate right
        
        int n = arr.length; // Length of array
        int[] temp = new int[n]; // A temporary array to hold the rotated result

        // Step 1: Put the last k elements at the start of temp array
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }
        // For k=3: temp = [5, 6, 7, _, _, _, _]

        // Step 2: Put the remaining elements after them
        for (int i = 0; i < n - k; i++) {
            temp[k + i] = arr[i];
        }
        // temp = [5, 6, 7, 1, 2, 3, 4]

        // Step 3: Copy temp back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        // Print the rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
/*

8.  Merge Two Sorted Arrays 
-  Merge two sorted arrays into a single sorted array without using extra space.

*/

import java.util.*;

class Que_8 {
    public static void mergeArrays(int[] arr1, int m, int[] arr2, int n) {
        // arr1 has space for m+n elements, but only first m are filled
        int p1 = m - 1; // Points to last element in arr1's filled part
        int p2 = n - 1; // Points to last element in arr2
        int p = m + n - 1; // Points to last position in arr1

        // Merge by placing larger elements at the end of arr1
        while (p1 >= 0 && p2 >= 0) {
            if (arr1[p1] > arr2[p2]) {
                arr1[p] = arr1[p1]; // Move arr1's larger element to the end
                p1--;
            } else {
                arr1[p] = arr2[p2]; // Move arr2's larger element to the end
                p2--;
            }
            p--; // Move to the next empty spot
        }

        // If arr2 has leftover elements, add them (arr1 elements are already in place)
        while (p2 >= 0) {
            arr1[p] = arr2[p2];
            p2--;
            p--;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[7];
        arr1[0] = 1;
        arr1[1] = 3;
        arr1[2] = 5;
        arr1[3] = 7;
        int m = 4;

        int[] arr2 = {2, 4, 6};
        int n = 3;

        mergeArrays(arr1, m, arr2, n);

        for (int i = 0; i < m + n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }
}
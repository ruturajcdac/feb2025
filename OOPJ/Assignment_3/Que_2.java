/*

2. Reverse an Array
- Reverse the given array in place

*/




import java.util.*;

class Que_2 {
    public static void main(String args[]) {
        int arr[] = {9, 81, 4, 65, 1, 22};

        int left = 0;
        int right = arr.length - 1;
        int temp;

        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
		

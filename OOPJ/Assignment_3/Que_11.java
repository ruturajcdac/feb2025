/*

11.  Find a Subarray with Given Sum 
- Given an array of integers, find the subarray that sums to a given value S. 

*/


class Que_11{
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int sum = 15;

        findSubarray(arr, sum);
    }

    public static void findSubarray(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            int currentSum = arr[i];

            if (currentSum == sum) {
                System.out.println("Subarray found from index " + i + " to " + i);
                return;
            }

            for (int j = i + 1; j < arr.length; j++) {
                currentSum += arr[j];

                if (currentSum == sum) {
                    System.out.println("Subarray found from index " + i + " to " + j);
                    return;
                }

                if (currentSum > sum) {
                    break; // No need to continue if the sum exceeds the target
                }
            }
        }

        System.out.println("No subarray found with the given sum.");
    }
}
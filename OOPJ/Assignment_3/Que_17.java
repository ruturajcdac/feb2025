/*

17.  Write a Java program to find the maximum product of two integers in a given array of 
integers. 
Example: 
Input : 
nums = { 2, 3, 5, 7, -7, 5, 8, -5 } 
Output: 
Pair is (7, 8), Maximum Product: 56 

*/


class Que_17{
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 7, -7, 5, 8, -5};
        findMaxProductPair(nums);
    }

    public static void findMaxProductPair(int[] nums) {
        if (nums == null || nums.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int maxProduct = Integer.MIN_VALUE;
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                if (product > maxProduct) {
                    maxProduct = product;
                    num1 = nums[i];
                    num2 = nums[j];
                }
            }
        }

        System.out.println("Pair is (" + num1 + ", " + num2 + "), Maximum Product: " + maxProduct);
    }
}
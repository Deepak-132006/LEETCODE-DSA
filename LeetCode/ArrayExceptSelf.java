package LeetCode;

import java.util.Arrays;

public class ArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] productArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    product *= nums[j];
                }
            }
            productArray[i] = product;
        }
        return productArray;
    }

    public static void main(String[] args) {
        ArrayExceptSelf obj = new ArrayExceptSelf();
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(obj.productExceptSelf(nums)));
    }
}
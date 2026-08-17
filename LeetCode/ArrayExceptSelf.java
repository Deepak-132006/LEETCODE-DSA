package LeetCode;

import java.util.Arrays;

public class ArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] productArray = new int[nums.length];

        productArray[0] = 1;
        for (int i = 1; i < n; i++) {
            productArray[i] = productArray[i - 1] * nums[i - 1];
        }
        for(int num : productArray){
            System.out.println(num);
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            productArray[i] *= right;
            right *= nums[i];
        }
        return productArray;
    }

    public static void main(String[] args) {
        ArrayExceptSelf obj = new ArrayExceptSelf();
        int[] nums = { 1, 2, 3, 4};
        System.out.println(Arrays.toString(obj.productExceptSelf(nums)));
    }
}
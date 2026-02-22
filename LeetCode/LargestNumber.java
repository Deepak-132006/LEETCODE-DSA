package LeetCode;

import java.util.Arrays;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        if (arr[0].equals("0"))
            return "0";

        StringBuilder result = new StringBuilder();
        for (String str : arr) {
            result.append(str);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int[] nums = { 10, 2 };
        System.out.println(new LargestNumber().largestNumber(nums));
    }
}

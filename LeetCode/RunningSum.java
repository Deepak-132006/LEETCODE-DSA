package LeetCode;

import java.util.Arrays;

public class RunningSum {
        public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for(int i = 1; i < nums.length; i++ ){
            int sum = result[i - 1] + nums[i];
            result[i] = sum;
        }
        return result;
    }
    public static void main(String[] args) {
        RunningSum obj = new RunningSum();
        int[] nums = {1,1,1,1,1};
        System.out.println(Arrays.toString(obj.runningSum(nums)));
    }
}

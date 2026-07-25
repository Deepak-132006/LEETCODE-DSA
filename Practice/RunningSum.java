package Practice;

import java.util.Arrays;

public class RunningSum {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 8 };
        System.out.println(Arrays.toString(new RunningSum().runningSum(nums)));
    }
}

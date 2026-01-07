package LeetCode;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int max = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            max = Math.max(max, currentSum);

        }
        return max;
    }

    public static void main(String[] args) {
        MaximumSubarray obj = new MaximumSubarray();
        int[] nums = {1};
        System.out.println(obj.maxSubArray(nums));
    }
}

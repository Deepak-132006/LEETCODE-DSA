package Practice;

public class MaxSumSubArray {
    public int maxSum(int[] nums) {
        int minSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.min(nums[i], currentSum + nums[i]);
            minSum = Math.min(minSum, currentSum);
        }
        return minSum;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(new MaxSumSubArray().maxSum(nums));
    }
}

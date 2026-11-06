package STRIVER.Arrays;

public class KadanesAlgo {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int current = nums[0];
        int currentSum = 0;
        for (int i = 1; i < nums.length; i++) {
            current += nums[i];
            currentSum = Math.max(currentSum, current);
            max = Math.max(max, currentSum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 5,4,-1,7,8};
        System.out.println(new KadanesAlgo().maxSubArray(nums));
    }
}

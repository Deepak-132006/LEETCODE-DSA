package LeetCode;

public class MinSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0, right = 0;
        while (right < nums.length) {

            sum += nums[right];
            right++;

            while (sum >= target) {
                min = Math.min(min, right - left);
                sum -= nums[left];
                left++;
            }
        }
        return (min == Integer.MAX_VALUE) ? 0 : min;
    }

    public static void main(String[] args) {
        int target = 7;
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        MinSubarraySum obj = new MinSubarraySum();
        System.out.println(obj.minSubArrayLen(target, nums));
    }
}

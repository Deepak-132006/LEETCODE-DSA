package LeetCode;

public class MaxConsecutiveOnes {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, zeros = 0, maxLen = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                zeros++;
            }
            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }
            int windowSize = right - left + 1;
            maxLen = Math.max(maxLen, windowSize);
            right++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes obj = new MaxConsecutiveOnes();
        int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;
        System.out.println(obj.longestOnes(nums, k));
    }
}

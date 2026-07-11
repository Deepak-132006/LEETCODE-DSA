package LeetCode;

public class LongestSubarray {
    public int longestSubarray(int[] nums) {
        int zeroCount = 0, maxLength = 0, start = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) {
                zeroCount++;
            }
            while(zeroCount > 1) {
                zeroCount -= (nums[start] == 0 ? 1 : 0);
                start++;
            }
            maxLength = Math.max(maxLength, i - start);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 1, 1, 0, 1, 1, 0, 1 };
        System.out.println(new LongestSubarray().longestSubarray(nums));
    }
}
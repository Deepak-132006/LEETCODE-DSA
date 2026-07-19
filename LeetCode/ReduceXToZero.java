package LeetCode;

public class ReduceXToZero {
    public int minOperations(int[] nums, int x) {
        int left = 0, maxCount = -1, sum = 0, windowSum = 0;

        for (int num : nums) {
            sum += num;
        }

        for (int right = 0; right < nums.length; right++) {
            windowSum += nums[right];
            while (left <= right && windowSum > sum - x)
                windowSum -= nums[left++];
            if (windowSum == sum - x)
                maxCount = Math.max(maxCount, right - left + 1);
        }
        return maxCount == -1 ? -1 : nums.length - maxCount;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 20, 1, 1, 3 };
        int x = 5;
        System.out.println(new ReduceXToZero().minOperations(nums, x));
    }
    // Input: nums = [3,2,20,1,1,3], x = 10
    // Output: 5
    // Input: nums = [1,1,4,2,3], x = 5
    // Output: 2
}

package LeetCode;

import java.util.Arrays;

public class MostFrequentElement {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int ans = 0;
        long current = 0;

        for(int right = 0; right < nums.length; right++){
            long target = nums[right];
            current += target;

            while((right - left + 1) * target - current > k){
                current -= nums[left];
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
        
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4 };
        int k = 5;
        System.out.println(new MostFrequentElement().maxFrequency(nums, k));
    }
}

// Input: nums = [1,2,4], k = 5
// Output: 3

// Input: nums = [1,4,8,13], k = 5
// Output: 2
package LeetCode;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE ;
        int sum = 0;
        for(int i = 0; i < nums.length - 2; i++){
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                sum = (nums[i] + nums[left] + nums[right]);
                if( Math.abs(sum - target) < Math.abs(closestSum - target)){
                    closestSum = sum;
                }
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 0 };
        int target = 1;
        ThreeSumClosest obj = new ThreeSumClosest();
        System.out.println(obj.threeSumClosest(nums, target));
    }
}
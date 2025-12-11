package LeetCode;

import java.util.Arrays;
public class FirstAndLastPosition {
    public int[] searchRange( int[] nums, int target){
        return new int[] {
            findFirst(nums, target),
            findLast(nums, target)
        };
    }
    public int findFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int first = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }
    public int findLast(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    
    }
    public static void main(String[] args) {
        FirstAndLastPosition obj = new FirstAndLastPosition();
        int[] nums = { 5, 7, 7, 8, 8, 10 };
       System.out.println(Arrays.toString(obj.searchRange(nums,7)));
    }
}

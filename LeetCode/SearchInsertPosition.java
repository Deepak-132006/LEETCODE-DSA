package LeetCode;

import Searching.BinarySearch;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                System.out.print("Found" + target + " on index: "+ mid);
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        System.out.print("Not Found");
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        int[] nums = {1,3,5,6};
        obj.search(nums, 5);
    }
}

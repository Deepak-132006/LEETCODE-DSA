package Searching.Practice;

public class FirstOccurance {
    public int firstOccurance(int[] nums, int target) {
        int left = 0, right = nums.length - 1, index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 2, 3, 4, 5 };
        int target = 2;
        System.out.println(new FirstOccurance().firstOccurance(nums, target));
    }
}

package Searching.Practice;

public class CountOccurrence {
    public int countOccurrences(int[] nums, int target) {
        int first = firstOccurance(nums, target);
        int last = lastOccurance(nums, target);
        if(first == -1){
            return 0;
        }
        return last - first + 1;
    }

    public int lastOccurance(int[] nums, int target) {
        int left = 0, right = nums.length - 1, index = 0;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                index = mid;
                left = mid + 1;
            } else if (nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }

        public int firstOccurance(int[] nums, int target) {
        int left = 0, right = nums.length - 1, index = 0;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                index = mid;
                right = mid - 1;
            } else if (nums[mid] < target){
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
        System.out.println(new CountOccurrence().countOccurrences(nums, target));
    }
}

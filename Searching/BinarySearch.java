package Searching;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                System.out.println("Found " + target + " at index: " + mid);
                return mid;
            }

            if(nums[mid] < target){
                left = mid + 1;
            }
            if(nums[mid] > target){
                right = mid - 1;
            }
        }
        System.out.println("Not found");
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        int[] nums = {1, 3, 5, 7, 9, 19};
        obj.search(nums, 1);
    }
}

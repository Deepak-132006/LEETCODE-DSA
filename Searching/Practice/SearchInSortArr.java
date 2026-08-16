package Searching.Practice;

public class SearchInSortArr {

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 12, 18, 21, 30, 44 };
        int target = 21;
        System.out.println(new SearchInSortArr().search(arr, target));
    }
}

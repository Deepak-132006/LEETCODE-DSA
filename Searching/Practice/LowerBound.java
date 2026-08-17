package Searching.Practice;

public class LowerBound {
    public int lowerBound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] >= target){
                right = mid - 1;
            }
            if(nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 4, 6, 8 };
        int target = 0;
        System.out.println(new LowerBound().lowerBound(nums, target));
    }
}

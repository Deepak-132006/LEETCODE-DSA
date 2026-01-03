package LeetCode;

import java.util.Arrays;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target){
        int left = 0, right = numbers.length - 1;

        while(left < right) {
            int result = numbers[left] + numbers[right];
            if(result == target){
                return new int[] {left + 1, right + 1};
            } else if (result > target){
                right--;
            } else {
                left++;
            }
        }
        return new int[] {-1, -1};
    }
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;

        TwoSumII obj = new TwoSumII();
        System.out.print( Arrays.toString(obj.twoSum(numbers, target)) );
    }
}

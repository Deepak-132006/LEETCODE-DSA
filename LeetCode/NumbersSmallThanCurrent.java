package LeetCode;

import java.util.Arrays;

public class NumbersSmallThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] < nums[i]){
                    count++;   
                }
            }
            result[i] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        NumbersSmallThanCurrent obj = new NumbersSmallThanCurrent();
        System.out.println(Arrays.toString(obj.smallerNumbersThanCurrent(nums)));
    }
}

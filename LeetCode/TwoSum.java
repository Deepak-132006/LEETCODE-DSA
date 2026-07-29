package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int current = target - nums[i];
            if(map.containsKey(current)){
                return new int[]{map.get(current), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.print(Arrays.toString(obj.twoSum(nums, target)));
    }
}

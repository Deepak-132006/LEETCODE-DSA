package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateNum {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) == 2){
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(new FindDuplicateNum().findDuplicate(nums));
    }
}

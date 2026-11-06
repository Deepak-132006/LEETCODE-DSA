package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>(); 
        int possible = nums.length / 3;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > possible) {
                result.add(entry.getKey());
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        int[] nums = { 1 , 2 };
        System.out.println(new MajorityElementII().majorityElement(nums));
    }
}

package STRIVER.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = 0;
        int count = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(count < entry.getValue()) {
                count = entry.getValue();
                max = entry.getKey();                
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(new MajorityElement().majorityElement(nums));
    }
}

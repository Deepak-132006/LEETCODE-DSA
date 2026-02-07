package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionTwo {
     public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int num1 : nums1){
            map.put(num1, map.getOrDefault(num1, 0) + 1);
        }
        for(int num2 : nums2){
            if(map.containsKey(num2) && map.get(num2) > 0){
                res.add(num2);
                map.put(num2, map.get(num2) - 1);
            }
        }
        int[] result = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            result[i] = res.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2, 2};
        IntersectionTwo obj = new IntersectionTwo();
        System.out.println(Arrays.toString(obj.intersect(num1, num2)));
    }
}

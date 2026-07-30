package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOne {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> setOne = new HashSet<>();
        HashSet<Integer> setTwo = new HashSet<>();

        for(int num : nums1){
            setOne.add(num);
        }
        for(int num : nums2){
            setTwo.add(num);
        }

        setOne.retainAll(setTwo);
        int[] result = new int[setOne.size()];
        int i = 0;
        
        for(int num : setOne){
            result[i++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        IntersectionOne obj = new IntersectionOne();
        System.out.println(Arrays.toString(obj.intersection(nums1, nums2)));
    }
}

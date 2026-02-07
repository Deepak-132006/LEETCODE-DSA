package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DiffOfTwo {
        public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();

            for (int num : nums1)
                set1.add(num);
            for (int num : nums2)
                set2.add(num);

            List<Integer> diff1 = new ArrayList<>();
            for (int num : set1) {
                if (!set2.contains(num)) {
                    diff1.add(num);
                }
            }
            List<Integer> diff2 = new ArrayList<>();
            for (int num : set2) {
                if (!set1.contains(num)) {
                    diff2.add(num);
                }
            }
            List<List<Integer>> result = new ArrayList<>();
            result.add(diff1);
            result.add(diff2);
            return result;
        }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = { 2, 4, 6 };
        DiffOfTwo obj = new DiffOfTwo();
        System.out.println(obj.findDifference(nums1, nums2));

    }
}

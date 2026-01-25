package Backtracking;

import java.util.*;

public class SubsetsArray {
    public void generate(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);
        generate(nums, index + 1, current, result);


        
        current.remove(current.size() - 1);
        generate(nums, index + 1, current, result);
    }

    public static void main(String[] args) {
        SubsetsArray obj = new SubsetsArray();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        obj.generate(nums, 0, new ArrayList<>(), result);
        System.out.println(result);
    }
}

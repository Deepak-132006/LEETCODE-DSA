package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {
    
    boolean[] used;
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        used = new boolean[nums.length];
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }
    
    public void backtrack(int[] nums, List<Integer> temp, List<List<Integer>> result) {

        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if(used[i]){
                continue;
            }

            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            temp.add(nums[i]);
            used[i] = true;
            backtrack(nums, temp, result);
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2 };
        PermutationsII obj = new PermutationsII();
        System.out.println(obj.permuteUnique(nums));
    }
}
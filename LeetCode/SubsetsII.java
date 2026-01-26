package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        generate(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void generate(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));

        for(int i = index; i < nums.length; i++ ){
            if (i > index && nums[i] == nums[i - 1]) continue;
            current.add(nums[i]);

            generate(nums, i + 1, current, result);

            current.remove(current.size() - 1); 
        }

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2 };
        SubsetsII obj = new SubsetsII();
        System.out.println(obj.subsetsWithDup(nums));
    }
}

package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        permutate(0, nums);
        return result;
    }

    public void permutate(int index, int[] nums) {
        if (index == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);
            }
            result.add(temp);
            return;
        }
        for (int i = index; i < nums.length; i++) {

            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;

            permutate(index + 1, nums);

            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;

        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Permutations obj = new Permutations();
        System.out.println(obj.permute(nums));
    }
}

package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        solve(0, nums, new ArrayList<>());
        return result;
    }

    void solve(int index, int[] nums, List<Integer> path) {

        // BASE CASE
        if (index == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }

        // OPTION 1: TAKE nums[index]
        path.add(nums[index]);
        solve(index + 1, nums, path);

        // CLEANUP (undo TAKE)
        path.remove(path.size() - 1);

        // OPTION 2: DON'T TAKE nums[index]
        solve(index + 1, nums, path);
    }
}

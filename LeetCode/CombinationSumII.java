package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        combine(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }

    public void combine(int[] candidates, int start, int target, List<Integer> current, List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if(i > start && candidates[i] == candidates[i - 1]){
                continue;
            }
            if (candidates[i] > target) {
                break;
            }
            current.add(candidates[i]);
            combine(candidates, i + 1, target - candidates[i], current, result);
            current.remove(current.size() - 1);
        }

    }

    public static void main(String[] args) {
        int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
        int target = 8;
        CombinationSumII obj = new CombinationSumII();
        System.out.println(obj.combinationSum2(candidates, target));

    }
}

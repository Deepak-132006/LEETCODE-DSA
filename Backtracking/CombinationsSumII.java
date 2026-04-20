package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationsSumII {
    public static List<List<Integer>> combII(int[] arr, int target){
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        backtract(arr, target, 0, 0, new ArrayList<>(), result);
        return result;
    }
    public static void backtract(int[] arr, int target, int sum, int start, List<Integer> path, List<List<Integer>> result){
        
        if(sum == target){
            result.add(new ArrayList<>(path));
            return;
        }
        if(sum > target) return;
        for (int i = start; i < arr.length; i++) {
            if(i > start && arr[i] == arr[i - 1]) continue;
            path.add(arr[i]);
            backtract(arr, target, sum + arr[i], i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        System.out.println(combII(arr, target));
    }
}

package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> combSum(int[] arr,int target){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(arr, new ArrayList<>(), result, 0, 0, target);
        return result;
    }
    public static void backtrack(int[] arr, List<Integer> path, List<List<Integer>> result, int sum,int start, int target){
        if(sum == target){
            result.add(new ArrayList<>(path));
            return;
        }
        if(sum > target) return;
        for(int i = start; i < arr.length; i++){
            path.add(arr[i]);
            backtrack(arr, path, result, sum + arr[i], i, target);
            path.remove(path.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] arr ={2, 3, 6, 7};
        int target = 7;
        System.out.println(combSum(arr, target));
    }
}

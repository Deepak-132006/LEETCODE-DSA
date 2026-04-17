package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> permutations(int[] arr, List<Integer> res, List<Integer> temp) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(arr, new ArrayList<>(), result);
        return result;
    }

    public static void backtrack (int[] arr, List<Integer> temp, List<List<Integer>> result){
        if(temp.size() == arr.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int num : arr){
            if(temp.contains(num)){
                continue;
            }
            temp.add(num);
            backtrack(arr, temp, result);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(permutations(arr, new ArrayList<>(), new ArrayList<>()));
    }
}

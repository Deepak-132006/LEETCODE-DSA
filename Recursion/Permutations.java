package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void permutations(int[] arr, List<Integer> res, List<Integer> path, int start) {
        if (path.size() == arr.length) {
            res.add(path.get(start - 1));
        }
        
        for (int i = start; i < arr.length; i++) {
            path.add(arr[i]);

            permutations(arr, res, path, i + 1);

            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        permutations(arr, new ArrayList<>() ,new ArrayList<>(), 0);
    }
}

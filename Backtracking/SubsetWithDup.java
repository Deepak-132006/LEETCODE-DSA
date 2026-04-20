package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubsetWithDup {
    public static void subsetsWithDup(int[] arr, int start, List<Integer> path) {
        System.out.println(path);
        for (int i = start; i < arr.length; i++) {
            if (i > start && arr[i] == arr[i - 1]) {
                continue;
            }
            path.add(arr[i]);
            subsetsWithDup(arr, i + 1, path);
            path.remove(path.size() - 1);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2 };
        subsetsWithDup(arr, 0, new ArrayList<>());
    }
}

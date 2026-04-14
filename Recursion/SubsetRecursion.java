package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetRecursion {
    public static void subsets(int[] arr, List<Integer> path,int start){

        System.out.println(path);
        for (int i = start; i < arr.length; i++) {
            path.add(arr[i]);

            subsets(arr, path, i + 1);
            path.remove( path.size() - 1);            
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        subsets(arr, new ArrayList<>(), 0);
    }
}

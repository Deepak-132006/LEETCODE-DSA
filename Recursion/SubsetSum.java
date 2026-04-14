package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {
    public static void subsetSum(int[] arr, List<Integer> path ,int start){
        int sum = 0;
        for(int i = 0; i < path.size(); i++){
            sum += path.get(i);
        }
        System.out.println(sum);
        for(int i = start; i < arr.length; i++){
            path.add(arr[i]);

            subsetSum(arr, path, i + 1);

            path.remove(path.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        subsetSum(arr, new ArrayList<>(), 0);
    }
}

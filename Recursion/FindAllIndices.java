package Recursion;

import java.util.ArrayList;
import java.util.List;

public class FindAllIndices {
    public List<Integer> findIndex (int[] arr, int index, int target){
         if (index == arr.length) {
            return new ArrayList<>();            
         }
         List<Integer> ans = findIndex(arr, index + 1, target);

         if(arr[index] == target){
            ans.add(0, index);
         }
         return ans;
    }
    public static void main(String[] args) {
        FindAllIndices obj = new FindAllIndices();
        int[] arr = {1, 2, 4, 2, 5, 2, 7};
        int target = 2;
        System.out.println(obj.findIndex(arr, 0, target));
    }
}

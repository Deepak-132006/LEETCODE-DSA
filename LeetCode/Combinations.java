package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public void comb(int n, int k, List<Integer> path, int start, List<List<Integer>> result){
        if(path.size() == k){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i = start; i <= n; i++){
            path.add(i);
            comb(n, k, path, i + 1, result);
            path.remove(path.size() - 1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
       List <List<Integer>> result = new ArrayList<>();
        comb(n, k, new ArrayList<>(), 1, result);
        return result;
       
    }
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        System.out.println(new Combinations().combine(n, k));
        // [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
    }
}

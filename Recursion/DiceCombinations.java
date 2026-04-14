package Recursion;

import java.util.ArrayList;
import java.util.List;

public class DiceCombinations {
    StringBuilder res = new StringBuilder();

    public static void dice(int[] comb, List<Integer> path, int target, int start, int sum) {
        if (sum == target) {
            StringBuilder res = new StringBuilder();
            for (int num : path){
                res.append(num);
            }

            System.out.println(res.toString());
            return;
        }

        if(sum > target) return;

        for (int i = start; i < comb.length; i++) {
            path.add(comb[i]);

            dice(comb, path, target, i + 1, sum + comb[i]);

            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] comb = { 1, 2, 3, 4, 5, 6 };
        int target = 3;
        dice(comb, new ArrayList<>(), target, 0, 0);
    }
}

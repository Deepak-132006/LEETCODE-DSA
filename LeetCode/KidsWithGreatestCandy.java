package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestCandy {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = 0;
        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            maxCandy = Math.max(maxCandy, candies[i]);
        }

        for (int i = 0; i < candies.length; i++){
            candies[i] += extraCandies;
            System.out.println(candies[i]);
            if(candies[i] >= maxCandy){
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        System.out.println(new KidsWithGreatestCandy().kidsWithCandies(candies, extraCandies));
    }
}

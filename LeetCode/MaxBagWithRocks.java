package LeetCode;

import java.util.Arrays;

public class MaxBagWithRocks {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] needed = new int[capacity.length];
        for(int i = 0; i < capacity.length; i++) {
            needed[i] = capacity[i] - rocks[i]; 
        }
        Arrays.sort(needed);
        int bag = 0;
        for(int i = 0; i < needed.length; i++) {
            if(needed[i] <= additionalRocks) {
                additionalRocks -= needed[i];
                bag++;
            } else {
                break;
            }
        }
        return bag;
    }

    public static void main(String[] args) {
        int[] capacity = { 2, 3, 4, 5 };
        int[] rocks = { 1, 2, 4, 4 };
        int additionalRocks = 2;
        System.out.println(new MaxBagWithRocks().maximumBags(capacity, rocks, additionalRocks));
    }
}

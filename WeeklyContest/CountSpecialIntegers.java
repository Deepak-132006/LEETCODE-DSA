package WeeklyContest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountSpecialIntegers {

    public int countSpecialIntegers(int[] nums) {
        int count = 0;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(nums[i]);
        }

        for (List<Integer> index : map.values()) {
            if (index.size() == 3) {

                int i1 = index.get(0);
                int i2 = index.get(1);
                int i3 = index.get(2);

                if (i2 - i1 == i3 - i2) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 8, 8, 8, 8 };
        System.out.println(new CountSpecialIntegers().countSpecialIntegers(nums));
    }
}
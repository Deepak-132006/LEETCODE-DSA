package HashMap;

import java.util.HashMap;

public class HashPractice {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int count = 0;

        int k = 1;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int runningSum = 0;
        for (int num : nums) {
            runningSum += num;

            if (map.containsKey(runningSum - k)) {
                count += map.get(runningSum - k);

            }
            map.put(runningSum, map.getOrDefault(runningSum, 0) + 1);

        }
        System.out.println("Count of subarrays = " + count);

    }

}

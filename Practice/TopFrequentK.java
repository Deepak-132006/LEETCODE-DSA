package Practice;

import java.security.KeyStore.Entry;
import java.util.HashMap;

public class TopFrequentK {
    public int[] topK(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map.values());
        return new int[] { 0 };
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4, 4, 4 };
        int k = 2;
        System.out.println(new TopFrequentK().topK(nums, k));
    }
}

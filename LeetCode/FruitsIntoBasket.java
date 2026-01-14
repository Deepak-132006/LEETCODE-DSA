package LeetCode;

import java.util.HashMap;

public class FruitsIntoBasket {
    public int totalFruit(int[] fruits) {
        int left = 0, right = 0, maxLen = 0;
        HashMap<Integer, Integer> type = new HashMap<>();
        while (right < fruits.length) {
            type.put(fruits[right], type.getOrDefault(fruits[right], 0) + 1);
            while (type.size() > 2) {
                type.put(fruits[left], type.get(fruits[left])- 1);
                if (type.get(fruits[left]) == 0) {
                    type.remove(fruits[left]);
                }
                left++;
            }
            int windowSize = right - left + 1;
            maxLen = Math.max(maxLen, windowSize);
            right++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] fruits = { 1, 2, 1};
        FruitsIntoBasket obj = new FruitsIntoBasket();
        System.out.println(obj.totalFruit(fruits));
    }
}

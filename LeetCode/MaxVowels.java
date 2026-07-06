package LeetCode;

import java.util.Set;

public class MaxVowels {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int start = 0;
        int windowCount = 0;
        int maxCount = 0;

        for (int end = 0; end < s.length(); end++) {
            if (vowels.contains(s.charAt(end))) {
                windowCount += 1;
            }
            if (end - start + 1 == k) {
                maxCount = Math.max(maxCount, windowCount);
                if (s.length() > start) {

                    if (vowels.contains(s.charAt(start))) {
                        windowCount--;
                    }
                }
                start++;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        String s = "novowels";
        int k = 1;
        System.out.println(new MaxVowels().maxVowels(s, k));
    }
}

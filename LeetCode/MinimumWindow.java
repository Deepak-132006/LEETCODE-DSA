package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindow {
    public String minWindow(String s, String t) {
        int left = 0, right = 0, have = 0, start = 0, minLen = Integer.MAX_VALUE;
        Map<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> window = new HashMap<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (need.containsKey(c) && window.get(c).intValue() == need.get(c).intValue()) {
                have++;
            }

            while (have == need.size()) {
                char ch = s.charAt(left);
                window.put(ch, window.getOrDefault(ch, 0) - 1);
                if (need.containsKey(ch) && window.get(ch) < need.get(ch)) {
                    have--;
                }
                if ((right - left + 1) < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                left++;
            }

            right++;
        }
        return (minLen == Integer.MAX_VALUE) ? "" : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        MinimumWindow obj = new MinimumWindow();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(obj.minWindow(s, t));
    }
}

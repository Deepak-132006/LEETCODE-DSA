package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        Set<Character> set = new HashSet<>();
        while(right < s.length()){
            char ch = s.charAt(right);

            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubstring obj = new LongestSubstring();
        String s = "abcabcbb";
        System.out.println(obj.lengthOfLongestSubstring(s));
    }
}

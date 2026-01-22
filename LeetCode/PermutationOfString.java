package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class PermutationOfString {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0, right = 0;
        Map<Character, Integer> need = new HashMap<>();
        for (char c : s1.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        Map <Character, Integer> window = new HashMap<>();
        while (right < s2.length()) {
            char c = s2.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if(right - left + 1 > s1.length()){
                char ch = s2.charAt(left);
                window.put(ch, window.get(ch) - 1);
                if(window.get(ch) == 0){
                    window.remove(ch);
                }
                left++;
            }
            if(window.equals(need)){
                return true;
            }
            right++;
        }
        return false;
    }

    public static void main(String[] args) {
        PermutationOfString obj = new PermutationOfString();
        String s1 = "ab", s2 = "eidbaooo";
        System.out.println(obj.checkInclusion(s1, s2));
    }
}

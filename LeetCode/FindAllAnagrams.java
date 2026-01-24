package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        int left = 0, right = 0;
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> need = new HashMap<>();
        for(char c : p.toCharArray()){
            need.put(c, need.getOrDefault(c,  0) + 1);
        }
        Map<Character, Integer> window = new HashMap<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if(right - left + 1 > p.length()){
                char ch = s.charAt(left);
                window.put(ch, window.get(ch) - 1);
                if (window.get(ch) == 0) window.remove(ch);
                left++;
            }
            if (right - left + 1 == p.length() && window.equals(need)) {
                result.add(left);          
            }
            right++;
        }
        return result;

    }
    public static void main(String[] args) {
        FindAllAnagrams obj = new FindAllAnagrams();
        String s = "cbaebabacd";
        String p = "abc";
        System.out.print(obj.findAnagrams(s, p));
    }
}

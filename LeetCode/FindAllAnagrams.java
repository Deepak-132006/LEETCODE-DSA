package LeetCode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        int left, right = 0;
        Map<Character, Integer> need = new HashMap<>();
        

    }
    public static void main(String[] args) {
        FindAllAnagrams obj = new FindAllAnagrams();
        String s = "cbaebabacd";
        String p = "abc";
        System.out.print(obj.findAnagrams(s, p));
    }
}

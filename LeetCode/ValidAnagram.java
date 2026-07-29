package LeetCode;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
        }

        if (mapS.equals(mapT)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        ValidAnagram obj = new ValidAnagram();
        System.out.print(obj.isAnagram(s, t));
    }
}

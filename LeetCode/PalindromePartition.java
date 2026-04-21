package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtract(s, 0, new ArrayList<>(), result);
        return result;
    }

    public static void backtract(String s, int start, List<String> path, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            String sub = s.substring(start, i + 1);
            
            if (isPal(sub)) {
                path.add(sub);
                backtract(s, i + 1, path, result);
                path.remove(path.size() - 1);
            }
        }
    }

    public static boolean isPal(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aab";
        System.out.println(new PalindromePartition().partition(s));
    }
}

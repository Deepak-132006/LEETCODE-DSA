package LeetCode;

import java.util.Set;

public class ReverseVowels {
    public String reverseVowels(String s) {
        int start = 0, end = s.length() - 1;
        Set<Character> vowels = Set.of(
                'a', 'e', 'i', 'o', 'u',
                'A', 'E', 'I', 'O', 'U');
        StringBuilder result = new StringBuilder();

        while (start < end) {
            while (start < end && !vowels.contains(s.charAt(start))) {
                start++;
            }
            while (start < end && !vowels.contains(s.charAt(end))) {
                end--;
            }

            char temp = result.charAt(start);
            result.setCharAt(start, result.charAt(end));
            result.setCharAt(end, temp);

            start++;
            end--;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "Icecream";
        System.out.println(new ReverseVowels().reverseVowels(s));
    }
}

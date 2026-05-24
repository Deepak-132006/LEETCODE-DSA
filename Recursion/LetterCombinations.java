package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    Map<Character, String> tele = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.length() == 0)
            return result;

        tele.put('2', "abc");
        tele.put('3', "def");
        tele.put('4', "ghi");
        tele.put('5', "jkl");
        tele.put('6', "mno");
        tele.put('7', "pqrs");
        tele.put('8', "tuv");
        tele.put('9', "wxyz");

        backtrack(0, digits, new StringBuilder(), result);
        return result;
    }

    public void backtrack(int index, String digits, StringBuilder current, List<String> result) {
        if(current.length() == digits.length()){
            result.add(current.toString());
            return;
        }
        String letters = tele.get(digits.charAt(index));

        for (char ch : letters.toCharArray()) {
            current.append(ch);
            backtrack(index + 1, digits, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        String digits = "23";
        LetterCombinations obj = new LetterCombinations();
        System.out.println(obj.letterCombinations(digits));
    }
}

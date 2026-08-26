package LeetCode;

public class ReverseWordsIII {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            int left = words[i].length();
            int right = 0;
            for (int j = words[i].length() - 1; j >= 0; j--) {
                result.append(words[i].charAt(j));
            }
            result.append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(new ReverseWordsIII().reverseWords(s));
    }
}

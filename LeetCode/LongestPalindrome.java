package LeetCode;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if( s.length() < 2) {
            return s;
        }
        

    }


    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(new LongestPalindrome().longestPalindrome(s));
    }
}

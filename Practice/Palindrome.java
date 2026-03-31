package Practice;

public class Palindrome {
    public static boolean isPalindrome(String s, int left, int right) {

        while (left <= right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(new Palindrome().isPalindrome(s, 0, s.length() - 1));
    }
}

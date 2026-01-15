package LeetCode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int given = x;
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return given == reversed;
    }

    public static void main(String[] args) {
        PalindromeNumber obj = new PalindromeNumber();
        int x = 121;
        System.out.println(obj.isPalindrome(x));
    }
}

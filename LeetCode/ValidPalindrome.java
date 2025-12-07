package LeetCode;

public class ValidPalindrome {
    public void validate(String s) {

        s = "A man, a plan, a canal: Panama";
        StringBuffer valid = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                ch = Character.toLowerCase(ch);
                valid.append(ch);
            }
        }
        int left = 0;
        int right = valid.length() - 1;

        while (left < right) {
            if (valid.charAt(left) != valid.charAt(right)) {
                System.out.print("Not Palindrome!");
                return;
            }
            left++;
            right--;
        }
        System.out.print("Palindrome");
    }

    public static void main(String[] args) {
        ValidPalindrome obj = new ValidPalindrome();
        obj.validate(null);
    }
}

package LeetCode;

public class ReverseInteger {
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
            if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
                return 0;
            }
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }
    public static void main(String[] args) {
        ReverseInteger obj = new ReverseInteger();
        int x = 1230;
        System.out.println(obj.reverse(x));
    }
}

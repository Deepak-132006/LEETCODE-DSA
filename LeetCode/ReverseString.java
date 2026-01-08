package LeetCode;

import java.util.Arrays;

public class ReverseString {
    public char[] reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return s;
    }
    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        char[] s ={'h','e','l','l','o'};
        System.out.println(Arrays.toString(obj.reverseString(s)));
    }
}

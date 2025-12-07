package String;

import java.util.Scanner;

public class ReverseString {

    public static String reverseWords(String s) {
        String output = new StringBuilder(s).reverse().toString();
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Input: ");
        String input = sc.nextLine();

        ReverseString obj = new ReverseString();
        String result = obj.reverseWords(input);

        System.out.println("Reversed Input: " + result);
    }
}

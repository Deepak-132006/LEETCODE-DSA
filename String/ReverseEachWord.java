package String;

import java.util.*;

import javax.swing.plaf.synth.SynthStyle;

public class ReverseEachWord {
    public static String reverseEachWord(String s){
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words){
            StringBuffer reversedString = new StringBuffer(word);
            result.append(reversedString.reverse()).append(" ");
        }

        return result.toString().trim();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String input = sc.nextLine();

        String result = reverseEachWord(input);
        System.out.println("Here is your Reversed String: " + result);
    }
}

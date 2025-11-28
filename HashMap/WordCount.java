package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Sentence");
        String sentence = sc.nextLine();

        HashMap<String, Integer> freq = new HashMap<>();
        for(String word : sentence.split(" ")){
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        System.out.print("\nWord Frequency: ");
        for(String key : freq.keySet()){
            System.out.println(key + " -> " + freq.get(key));
        }
        sc.close();
    }
}

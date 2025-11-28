package HashMap;

import java.util.*;

public class Entry {
    public static void main(String[] args) {

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Harini", 20);
        marks.put("Srimathi", 47);
        marks.put("Deepak", 8);

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            String name = entry.getKey();
            if (entry.getKey().equals("Deepak")) {
                entry.setValue(21);
            }
            Integer score = entry.getValue();

            System.out.println(name + " Scored " + score);
        }

    }
}

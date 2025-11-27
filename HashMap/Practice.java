package HashMap;

import java.util.HashMap;

public class Practice {
    public static void main(String[] args) {
        HashMap <String, Integer> map = new HashMap<>();
        
        map.put("Harini", 20);
        map.put("Srimathi", 47);
        map.put("Deepak", 8);
        map.put("John", 9);

        // Display
        System.out.println(map);

        // Update
        map.put("Deepak", 20);

        // Remove
        map.remove("John");

        //Updated Map
        System.out.println(map);
    }
    
}

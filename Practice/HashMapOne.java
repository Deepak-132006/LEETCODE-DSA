package Practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapOne {
    public static void main(String[] args) {
        HashMap<Integer, String> student = new HashMap<>();
        student.put(101, "Ravi");
        student.put(102, "Deepak");
        student.put(103, "Henry");
        student.put(104, "Dpak");

        System.out.println(student.entrySet());

        for(Map.Entry<Integer, String> entry : student.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }    
}

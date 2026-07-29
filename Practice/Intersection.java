package Practice;

import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        s1.add(1);
        s1.add(23);
        s1.add(2);
        s1.add(3);

        s2.add(23);
        s2.add(21);
        
        s1.retainAll(s2);

        System.out.println(s1);
    }
}

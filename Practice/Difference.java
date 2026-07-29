package Practice;

import java.util.HashSet;

public class Difference {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        s1.add(12);
        s1.add(14);
        s1.add(13);

        s2.add(13);

        s1.removeAll(s2);

        System.out.println(s1);
    }
}

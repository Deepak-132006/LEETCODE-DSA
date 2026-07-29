package Practice;

import java.util.HashSet;

public class Union {
    public static void main(String[] args) {

        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        s1.add(12);
        s1.add(2);
        s1.add(1);

        s2.add(3);
        s2.add(12);
        s2.add(1);

        s1.addAll(s2);

        System.out.println(s1);
    }
}

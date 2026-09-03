package Practice;

import java.util.ArrayList;
import java.util.List;

public class StreamsPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.stream()
                .filter(n -> n > 25)
                .forEach(System.out::println);
    }
}

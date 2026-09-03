package Practice;

import java.util.List;

public class StreamsUnique {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 10, 30, 20, 40);
        List<Integer> result = numbers.stream()
                .distinct()
                .toList();
        System.out.println(result);
    }
}

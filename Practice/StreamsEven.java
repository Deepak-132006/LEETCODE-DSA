package Practice;

import java.util.List;

public class StreamsEven {
    public static void main(String[] args) {
        List<Integer> numbers =
        List.of(10, 15, 20, 25, 30, 35, 40, 45);
        List<Integer> result = numbers.stream()
        .filter(n -> n % 2 == 0)
        .toList();

        System.out.println(result);
    }
}

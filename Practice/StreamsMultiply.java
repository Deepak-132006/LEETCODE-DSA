package Practice;

import java.util.List;

public class StreamsMultiply {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 15, 20, 25, 30, 35, 40, 45);
        int result = numbers.stream()
        .filter(n -> n > 20)
        .reduce(1, (a , b) -> a * b);
        System.out.println(result);
    }
}

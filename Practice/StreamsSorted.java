package Practice;

import java.util.Comparator;
import java.util.List;

public class StreamsSorted {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(80, 90, 100, 110, 120, 130, 140, 150, 160);
        List<Integer> result = numbers.stream()
        .sorted(Comparator.reverseOrder())
        .toList();
        System.out.println(result);
    }
}

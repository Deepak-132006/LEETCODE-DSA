package Practice;

import java.util.List;

public class StreamsFilter {
    int sum = 0;
    public int sum(int num) {
        sum += num;
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> number = List.of(10, 20, 30, 40, 50, 60);
        int result = number.stream()
                .filter(n -> n > 30)
                .mapToInt(n -> n)
                .sum();

        System.out.println(result);
    }
}
